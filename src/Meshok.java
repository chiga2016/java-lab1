import java.util.ArrayList;
import java.util.Random;
import java.util.Stack;

public class Meshok extends ItemContainer {
    private double maxWeight;

    //private ArrayList <Item> arr1 = new ArrayList<Item> ();

    public Meshok(String name, double weight,double maxWeight, String ...str) {
        super(name, weight, str);
        setMaxWeight(maxWeight);
        itemColl = new ArrayList<Item>();
       // ArrayList <Item> arr1 = new ArrayList<Item>();
    }

    private void addWeight(double weight) { setWeight(getWeight()+weight); }

    public void delWeight(double weight) { setWeight(getWeight()-weight); }

    public void setMaxWeight(double maxWeight) {
        this.maxWeight = maxWeight;
    }

    public double getMaxWeight() {
        return maxWeight;
    }

    public Item outItem(){
        Random r = new Random();
        int index = r.nextInt(((ArrayList<Item>)itemColl).size());
        Item item1 = (Item) (((ArrayList<Item>)itemColl)).get(index);
        (((ArrayList<Item>)itemColl)).remove( item1);
        delWeight(item1.getWeight());
        item1.setItemInContainer(false);
        return item1;
    }

    @Override
    public void addItem(Item item) throws Exception {
        if (getWeight()+item.getWeight() < getMaxWeight()){
              super.addItem(item);

        }
        else { throw new ItemStoreException("Предмет " + item.getName() + " с весом = " + item.getWeight() + " не может быть добавлен в контейнер " + this.getName() +" . Максимальный вес достигнут. Текущий вес " + getWeight());
        }
    }


//    public void addItem(Item item) throws ItemAlreadyPlacedException, ItemStoreException, ItemNotFlatException {
//        try {
//            if (getWeight()+item.getWeight() > getMaxWeight()) {
//                throw new ItemStoreException("Предмет " + item.getName() + " с весом = " + item.getWeight() + " не может быть добавлен в контейнер " + this.getName() +" . Максимальный вес достигнут. Текущий вес " + getWeight());
//            }
//            if ((item).getItemInContainer()) {
//                throw new ItemAlreadyPlacedException("предмет " + item.getName()  + " не может быть добавлен в контейнер " + this.getName() + " Он уже был ранее добавлен в контейнер");
//            }
//
//            item.setItemInContainer(true);
//            // item.setItemInContainerMap(item,itemcont);
//            ((ArrayList<Item>)arr1).add(item);
//            //System.out.println(((ArrayList<Item>)arr1).size());
//            addWeight(item.getWeight());
//
//        }
//        catch (ItemAlreadyPlacedException ex){
//            System.err.println(ex);
//        }
//        catch (ItemStoreException ex){
//            System.err.println(ex);
//        }
//        catch (NullPointerException ex) {
//            System.err.println(ex);
//        }
//    }

    @Override
    public String getInfoItem () { String infoItem = getClass() + "; Название предмета: " + getName() + "; Общий вес c предметами: " + getWeight() + "; Максимальный вес " + getMaxWeight() + "; В контейнере? "+ getItemInContainer() + "; Количество предметов внутри " + countItem(); return infoItem;}


    public Item findItem(String str) {
        Item item = null;
        try {
            for (int i = 0; i < itemColl.size(); i++) {
                if ((((ArrayList<Item>)itemColl)).get(i).getName().matches(str)) {
                    item = (((ArrayList<Item>)itemColl)).get(i);
                }
            }
            if (item==null) { throw new NullPointerException();}
        }
        catch (NullPointerException e) {
            System.out.println(e+" Элемент не найден" );
        }
        return item;
    }

}


import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Random;

public abstract class ItemContainer extends Item  {
    protected Random randomGenerator;
   // protected double currentWeight=getWeight();
    private double maxWeight;

  // LinkedList<Item> arr1 = new LinkedList<Item>();
    ArrayList<Item> arr1 = new ArrayList<Item>();

   public ItemContainer(String name, double weight, String ...str) {
        super(name, weight, str);
    }

   public void setMaxWeight(double maxWeight) {
        this.maxWeight = maxWeight;
    }

   public double getMaxWeight() {
        return maxWeight;
    }

   public void addItem(Item item) throws ItemAlreadyPlacedException, ItemStoreException {
       try {
           if (getWeight()+item.getWeight() > maxWeight) {
               throw new ItemStoreException("Предмет " + item.getName() + " с весом = " + item.getWeight() + " не может быть добавлен в контейнер " + this.getName() +" . Максимальный вес достигнут. Текущий вес " + getWeight());
           } else {
               if ((item).getItemInContainer()) {
                   throw new ItemAlreadyPlacedException("предмет " + item.getName()  + " не может быть добавлен в контейнер " + this.getName() + " Он уже был ранее добавлен в контейнер");
               } else {
                   item.setItemInContainer(true);
                   // item.setItemInContainerMap(item,itemcont);
                   arr1.add(item);
                   addWeight(item.getWeight());
               }
           }
       }
       catch (ItemAlreadyPlacedException ex){
           //ex.printStackTrace("НЕЛЬЗЯ ДОБАВЛЯТЬ ОДИН ПРЕДМЕТ В НЕСКОЛЬКО КОНТЕЙНЕРОВ");
           //System.out.println(ex);
           System.err.println(ex);
       }
       catch (ItemStoreException ex){
           System.err.println(ex);
       }
   }
    public int countItem(){
        return arr1.size();
    }

   public Item outItem(){
       Random r = new Random();
       int index = r.nextInt(arr1.size());
       Item item1 = arr1.get(index);
       arr1.remove( item1);
       delWeight(item1.getWeight());
       item1.setItemInContainer(false);
       return item1;
   }

   public Item findItem(String str) {
       Item item = null;
       try {
           for (int i = 0; i < arr1.size(); i++) {
               if (arr1.get(i).getName().matches(str)) {
                   item = arr1.get(i);
               }
           }
           if (item==null) { throw new NullPointerException();}
       }
       catch (NullPointerException e) {
           System.out.println(e+" Элемент не найден" );
       }
           return item;
   }

//    public double sumWeight(){
//        //currentWeight = 0;
//        Iterator<Item> iter = arr1.iterator();
//        while(iter.hasNext()) currentWeight = currentWeight + iter.next().getWeight();
//        return currentWeight ;
//    }


    @Override
    public String getInfoItem () { String infoItem = getClass() + "; Название предмета: " + getName() + "; Общий вес предмета: " + getWeight() + "; Максимальный вес " + getMaxWeight() + "; В контейнере? "+ getItemInContainer() + "; Количество предметов внутри " + countItem(); return infoItem;}


}

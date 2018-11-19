import java.util.*;

public abstract class ItemContainer extends Item  {
    protected Random randomGenerator;
   // protected double currentWeight=getWeight();
  // LinkedList<Item> arr1 = new LinkedList<Item>();

    protected Collection <Item> itemColl;

    //ArrayList<Item> arr1 = new ArrayList<Item>();

    public ItemContainer(String name, double weight, String ...str) {
        super(name, weight, str);
    }

    public void addItem(Item item) throws Exception {
       // try {
           // System.out.println(item.getItemInContainer());
            if (item.equals(this)){
                throw new ItemInItem("Нельзя добавить самого себя");
            }

            if (item.getItemInContainer()) {
                throw new ItemAlreadyPlacedException("предмет " + item.getName()  + " не может быть добавлен в контейнер " + this.getName() + " Он уже был ранее добавлен в контейнер");
            }
               itemColl.add(item);
                item.setItemInContainer(true);
                this.setWeight(this.getWeight()+item.getWeight());
                //addWeight(item.getWeight());
                // itemColl.add(item);

//        } catch (ItemAlreadyPlacedException ex) {
//            System.err.println(ex.getMessage());
//
//        }
    }

    public int countItem(){
        try {
            return itemColl.size();
        }
        catch (NullPointerException ex) {
           // System.out.println(ex.getMessage());
            return 0;
        }
    }

}

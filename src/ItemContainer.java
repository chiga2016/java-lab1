import java.util.LinkedList;
public abstract class ItemContainer extends Item  {
    LinkedList<Item> arr1 = new LinkedList<Item>();

   public ItemContainer(String name, double weight, String ...str) {
        super(name, weight, str);
    }

   public void addItem(Item item) {
       if ((item).getItemInContainer()) {
           System.out.println("предмет уже добавлен в контейнер");

       }
       else {
           (item).setItemInContainer(true);
           arr1.add(item);
       }
   }
    public int countItem(){
        return arr1.size();
    }

   public void outItem(Item item){
       arr1.remove( item);
       (item).setItemInContainer(false);
   }

   public void findItem(Item item){arr1.contains(item);}


}

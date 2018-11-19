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
                throw new ItemAlreadyPlacedException("Предмет уже в контейнере");//"предмет " + item.getName()  + " не может быть добавлен в контейнер " + this.getName() + " Он уже был ранее добавлен в контейнер");
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

//   public Item outItem(){
//       Random r = new Random();
//       int index = r.nextInt(arr1.size());
//       Item item1 = arr1.get(index);
//       arr1.remove( item1);
//       delWeight(item1.getWeight());
//       item1.setItemInContainer(false);
//       return item1;
//   }
//
//   public Item findItem(String str) {
//       Item item = null;
//       try {
//           for (int i = 0; i < arr1.size(); i++) {
//               if (arr1.get(i).getName().matches(str)) {
//                   item = arr1.get(i);
//               }
//           }
//           if (item==null) { throw new NullPointerException();}
//       }
//       catch (NullPointerException e) {
//           System.out.println(e+" Элемент не найден" );
//       }
//           return item;
//   }


}

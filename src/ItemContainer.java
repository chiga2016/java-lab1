import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Random;

public abstract class ItemContainer extends Item  {
    protected Random randomGenerator;
    double currentWeight;
    double maxWeight;

   LinkedList<Item> arr1 = new LinkedList<Item>();
    //ArrayList<Item> arr1 = new ArrayList<Item>();



   public ItemContainer(String name, double weight, String ...str) {
        super(name, weight, str);
    }

   public void setMaxWeight(double maxWeight) {
        this.maxWeight = maxWeight;
    }

   public double getMaxWeight() {
        return maxWeight;
    }

   public void addItem(Item item, ItemContainer itemcont)  throws ItemAlreadyPlacedException {
       if ((item).getItemInContainer()) {
               throw new ItemAlreadyPlacedException("предмет уже добавлен в контейнер");
          }
       else {
           item.setItemInContainer(true);
           item.setItemInContainerMap(item,itemcont);

           arr1.add(item);
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
       item1.setItemInContainer(false);
       return item1;
   }

   public Item findItem(String str) {
       Item item=null;
       try {
           for (int i = 0; i < arr1.size(); i++) {
               if (arr1.get(i).getName().matches(str)) {
                   item = arr1.get(i);
               }
           }

       }
       catch (NullPointerException e) {
           System.out.println("Элемент не найден" );
       }

           return item;


   }

    public double sumWeight(){
        currentWeight = 0;
        Iterator<Item> iter = arr1.iterator();
        while(iter.hasNext()) currentWeight = currentWeight + iter.next().getWeight();
        return currentWeight+getWeight();
    }


    @Override
    public String getInfoItem () { String infoItem = getClass() + "; Название предмета: " + getName() + "; Вес предмета: " + getWeight() + "; Общий вес с предметами: " + Math.rint(100.0 * sumWeight()) / 100.0 + "; Максимальный вес " + getMaxWeight() + "; Количество предметов внутри " + countItem(); return infoItem;}


}

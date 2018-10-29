import java.util.Iterator;
import java.util.LinkedList;
public abstract class ItemContainer extends Item  {
    double currentWeight;
    double maxWeight;
    LinkedList<Item> arr1 = new LinkedList<Item>();

   public ItemContainer(String name, double weight, String ...str) {
        super(name, weight, str);
    }

   public void setMaxWeight(double maxWeight) {
        this.maxWeight = maxWeight;
    }

   public double getMaxWeight() {
        return maxWeight;
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

    public double sumWeight(){
        currentWeight = 0;
        Iterator<Item> iter = arr1.iterator();
        while(iter.hasNext()) currentWeight = currentWeight + iter.next().getWeight();
        return currentWeight+getWeight();
    }


    @Override
    public String getInfoItem () { String infoItem = getClass() + "; Название предмета: " + getName() + "; Вес предмета: " + getWeight() + "; Общий вес с предметами: " + Math.rint(100.0 * sumWeight()) / 100.0 + "; Максимальный вес " + getMaxWeight() + "; Количество предметов внутри " + countItem(); return infoItem;}


}

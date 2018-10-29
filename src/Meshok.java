import java.util.Iterator;

public class Meshok  extends ItemContainer {
    double currentWeight;
    double maxWeight;

    public Meshok(String name, double weight,double maxWeight, String ...str) {
        super(name, weight, str);
        setMaxWeight(maxWeight);
    }

    public void setMaxWeight(double maxWeight) {
        this.maxWeight = maxWeight;
    }

    public double getMaxWeight() {
        return maxWeight;
    }

    public double sumWeight(){
        currentWeight = 0;
        Iterator<Item> iter = arr1.iterator();
        while(iter.hasNext()) currentWeight = currentWeight + iter.next().getWeight();
        return currentWeight+getWeight();
    }

    @Override
    public String getInfoItem () { String infoItem = getClass() + "; Название предмета: " + getName() + "; Вес предмета: " + getWeight() + "; Общий вес с предметами: " + sumWeight() + "; Максимальный вес " + getMaxWeight() + "; Количество предметов внутри" + countItem(); return infoItem;}
}


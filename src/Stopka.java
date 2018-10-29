import java.util.Stack;

public class Stopka extends ItemContainer {
    private int maxItem;
    private int currentCountItem;

    Stack<Item> stack1 = new Stack<Item>();

    public Stopka(String name, double weight, int maxItem, String ...str) {
        super(name, weight, str);
        setMaxItem(maxItem);
    }

    public void setMaxItem(int maxItem) {
        this.maxItem = maxItem;
    }

    public int getMaxItem() {
        return maxItem;
    }

    @Override
    public void addItem(Item item) {
        stack1.add(item);
        //return false;
    }

    @Override
    public String getInfoItem () { String infoItem = getClass() + " ;Название предмета: " + getName() + " ;Вес предмета: " + getWeight() + "; Максимальное количество предметов: " + maxItem; return infoItem;}
}





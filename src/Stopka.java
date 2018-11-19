import java.util.ArrayList;
import java.util.Stack;

public class Stopka extends ItemContainer {
    private int maxItem;
    private int currentCountItem;

    //Stack<Item> stack1 = new Stack<Item>();

    public Stopka(String name, double weight, int maxItem, String ...str) {
        super(name, weight, str);
        setMaxItem(maxItem);
        itemColl = new Stack<Item>();
    }

    public void setMaxItem(int maxItem) {
        this.maxItem = maxItem;
    }

    public int getMaxItem() {
        return maxItem;
    }

    @Override
    public void addItem(Item item) throws Exception {
            if (countItem() + 1 > maxItem) {
                throw new ItemStoreException("Предмет " + item.getName() + " не может быть добавлен в контейнер " +this.getName()+  ". Максимальное количество предметов(" + maxItem + ")достигнуто. " + "Текущее количество предметов = " + countItem());
            }
            if (!item.isPloskii()) {
                throw new ItemNotFlatException("предмет " + item.getName() +  " не является плоским");
            }
            if (!item.isPloskii()) {
                throw new ItemNotFlatException("предмет " + item.getName() +  " не является плоским");
            }
            else {
                  super.addItem(item);
            }
    }

    public Item outItem() {
        Item item1 = null;
        try {
            if (countItem() > 0) {
                item1 = ((Stack<Item>) itemColl).pop();
                item1.setItemInContainer(false);
                return item1;
            } else {
                return null;
            }
        } catch (Exception ex) {
            ex.getMessage();
        }
        return item1;
    }

    public Item findItem(String str) {
        Item item = null;
        try {
            for (int i = 0; i < itemColl.size(); i++) {
                if ((((Stack<Item>)itemColl)).get(i).getName().matches(str)) {
                    item = (((Stack<Item>)itemColl)).get(i);
                }
            }
            if (item==null) { throw new NullPointerException();}
        }
        catch (NullPointerException e) {
            System.out.println(e+" Элемент не найден" );
        }
        return item;
    }

    @Override
    public String getInfoItem () { String infoItem = getClass() + " ;Название предмета: " + getName() + "; Максимальное количество предметов: " + getMaxItem()  + "; Количество предметов в стопке " + countItem();
        return ( infoItem);
    }
}





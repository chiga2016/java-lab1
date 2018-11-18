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

    public int countItem() {
       return stack1.size();
    }

    @Override
    public void addItem(Item item) throws ItemStoreException, ItemAlreadyPlacedException {

        try {
            if (countItem() + 1 > maxItem) {
                throw new ItemStoreException("Предмет " + item.getName() + " не может быть добавлен в контейнер " +this.getName()+  ". Максимальное количество предметов(" + maxItem + ")достигнуто. " + "Текущее количество предметов = " + countItem());
            } else {
                //System.out.println("НЕПОНЯТНО " + countItem());
                if ((item).getItemInContainer()) {
                    throw new ItemAlreadyPlacedException("предмет " + item.getName() + " уже добавлен в контейнер");
                } else {
                    if (!item.isPloskii()) {
                        throw new ItemNotFlatException("предмет " + item.getName() +  " не является плоским");
                    } else {
                        item.setItemInContainer(true);
                        //  item.setItemInContainerMap(item,itemcont);
                        stack1.add(item);
                    }
                }
            }
        }
        catch (ItemAlreadyPlacedException ex){
            System.err.println(ex);
        }
        catch (ItemStoreException ex){
            System.err.println(ex);
        }
        catch (ItemNotFlatException ex){
            System.err.println(ex);
        }
    }

    @Override
    public Item outItem() {
       Item item1 = stack1.pop();
        item1.setItemInContainer(false);
        //System.out.println("УДАЛЕН" + item1.getInfoItem());
       return item1;
    }

    @Override
    public String getInfoItem () { String infoItem = getClass() + " ;Название предмета: " + getName() + "; Максимальное количество предметов: " + getMaxItem()  + "; Количество предметов в стопке " + countItem();
        return ( infoItem);
    }
}





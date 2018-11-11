import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public abstract class Item {
    private String name;
    private double weight;
    private HashSet<String> param = new HashSet<String>();
    private HashMap<Integer,ItemContainer> itemInContainerMap = new HashMap<Integer,ItemContainer>();
    private boolean itemInContainer;

    public Item (String name,double weight,String ...str) {
        setName(name);
        setWeight(weight);
        setItemInContainer(false);
        for (int i = 0; i<str.length; i++)
            {setParam(str[i]);}
    }

    public void setItemInContainerMap(Item item,ItemContainer itemContainer) {
        itemInContainerMap.put(item.hashCode(),itemContainer);
    }

    public String getItemInContainerMap(Item item) {
       return itemInContainerMap.get(item).getName();
       // return itemInContainerMap;
    }
    public int getSizeItenContMap () {
       return itemInContainerMap.size();
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setParam(String param1) {
        param.add(param1);
    }

    public double getWeight() {
        return weight;
    }

    public String getName() {
        try {
            if (name!=null) {
                return name;
            }
            else {
                throw new NullPointerException();
            }
        }
        catch (NullPointerException e) {
            name = e + " Элемент не найден" ;
        }
        return name;
    }

    public String getParam() {
        String param1;
        param1 = param.toString();
        return param1;
    }

    public boolean getItemInContainer(){
        return itemInContainer;
    }

    public void setItemInContainer(boolean itemInContainer) {
        this.itemInContainer = itemInContainer;
    }

    public String getInfoItem () { String infoItem = getClass() + "; Название предмета: " + name + "; Вес предмета: " + weight + "; В контейнере? "+ getItemInContainer() + "; Доп.параметр:" + getParam(); return infoItem;}

    public String getInfoItemFinded () { String infoItem = "НАЙДЕН ОБЪЕКТ: " + getClass() + "; Название предмета: " + name + "; Вес предмета: " + weight + "; В контейнере? "+ getItemInContainer() + "; Доп.параметр:" + getParam(); return infoItem;}


    public boolean isPloskii(){
        boolean bool;
        if (getParam().toLowerCase().contains("плоский")) {
            bool =  true;
        }
        else {
            bool = false;
        }
        return bool;
    }


}

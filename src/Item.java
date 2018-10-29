import java.util.HashSet;
import java.util.Iterator;

public abstract class Item {
    //String param1;
    private String name;
    private double weight;
    private HashSet<String> param = new HashSet<String>();
    private boolean itemInContainer;

    public Item (String name,double weight,String ...str) {
        setName(name);
        setWeight(weight);
        setItemInContainer(false);
        for (int i = 0; i<str.length; i++)
            {setParam(str[i]);}
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

    public static boolean isPloskii(Item it){
        if (it.getParam().toLowerCase().contains("плоский")) {
            return  true;
        }
        else {
            return false;
        }
    }

    public double getWeight() {
        return weight;
    }

    public String getName() {
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
    }




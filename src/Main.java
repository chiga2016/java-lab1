import java.util.Random;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class Main {

    public static void main(String[] args) throws ItemAlreadyPlacedException, Exception, ItemNotFlatException {
        Kirpich kirpich1 = new Kirpich("Первый кирпич", 2, "красный", "облицовочный","ПЛосКий");
        Kirpich kirpich2 = new Kirpich("Второй кирпич", 2, "белый","Плоский");
        Kirpich kirpich3 = new Kirpich("Третий кирпич", 2, "не получился","Плоский");
        Kirpich kirpich4 = new Kirpich("Четвертый кирпич", 2, "белый","Плоский");
        Kirpich kirpich5 = new Kirpich("Пятый кирпич", 2, "белый","Сломанный");
        Meshok meshok1 = new Meshok("Первый мешок", 0.1,9, "Полиэтиленовый");
        Meshok meshok2 = new Meshok("Второй мешок", 0.1,6, "Бумажный");
        Korobka korobka1= new Korobka("Первая коробка",0.5,9,"10", "Синяя","плоский");
        Korobka korobka2 = new Korobka("Вторая коробка",0.5,8,"картонная","плоский");
        Korobka korobka3 = new Korobka("Третья коробка",0.5,8,"плоский");
        Stopka stopka1 = new Stopka("Первая стопка",1,3,"Странная");

      meshok1.addItem(kirpich1);
        System.out.println(meshok1.findItem("Первый кирпич").getInfoItemFinded());
        meshok1.addItem(kirpich2);
       //meshok1.addItem(meshok1); //ItemInItem
       meshok1.outItem();

     //   meshok1.addItem(kirpich3); // ItemStoreException
        korobka1.addItem(meshok1);
        korobka1.addItem(kirpich4);
        korobka1.addItem(kirpich5);
//        korobka1.addItem(kirpich2); // ItemAlreadyPlacedException
        stopka1.addItem(korobka1);
       stopka1.addItem(korobka2);
//
//        stopka1.addItem(kirpich5); // ItemNotFlatException
        stopka1.addItem(kirpich3);
    //    System.out.println(stopka1.findItem("Первая коробка").getInfoItemFinded());
//stopka1.addItem(korobka3); // ItemStoreException

       // stopka1.outItem();
            System.out.println(kirpich1.getInfoItem());
            System.out.println(kirpich2.getInfoItem());
            System.out.println(kirpich3.getInfoItem());
            System.out.println(kirpich4.getInfoItem());
            System.out.println(kirpich5.getInfoItem());
            System.out.println(meshok1.getInfoItem());
            System.out.println(meshok2.getInfoItem());

            System.out.println(korobka1.getInfoItem());
            System.out.println(korobka2.getInfoItem());

            System.out.println(stopka1.getInfoItem());
//        System.out.println(stopka1.outItem().getName());


    }
}

//find
//сделать коробку и кирпич изначально плоской
//проверка максимального количет=ства в стопке
//контейнер не может добавить сам себя
// исправить тесты
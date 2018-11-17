import java.util.Random;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class Main {

    public static void main(String[] args) throws ItemAlreadyPlacedException, ItemStoreException, ItemNotFlatException {
        Kirpich kirpich1 = new Kirpich("Первый кирпич", 2, "красный", "облицовочный","ПЛосКий");
        Kirpich kirpich2 = new Kirpich("Второй кирпич", 2, "белый","Плоский");
        Kirpich kirpich3 = new Kirpich("Третий кирпич", 2, "не получился","Плоский");
        Kirpich kirpich4 = new Kirpich("Четвертый кирпич", 2, "Сломанный");
        Kirpich kirpich5 = new Kirpich("Пятый кирпич", 2, "белый","Плоский");
        Meshok meshok1 = new Meshok("Первый мешок", 0.1,6, "Полиэтиленовый");
        Meshok meshok2 = new Meshok("Второй мешок", 0.1,6, "Бумажный");
        Korobka korobka1= new Korobka("Первая коробка",0.5,8,"10", "Синяя","плоский");
        Korobka korobka2 = new Korobka("Вторая коробка",0.5,8,"картонная","плоский");
        Stopka stopka1 = new Stopka("Первая стопка",1,3,"Странная");

        meshok1.addItem(kirpich1);

        meshok1.addItem(kirpich2);
      //  meshok1.addItem(kirpich3); //
        korobka1.addItem(meshok1);
        korobka1.addItem(kirpich4);
      //  korobka1.addItem(kirpich2);
        stopka1.addItem(korobka1);
        stopka1.addItem(korobka2);
        stopka1.addItem(kirpich3);
       // stopka1.outItem();
            System.out.println(kirpich1.getInfoItem());
            System.out.println(kirpich2.getInfoItem());
            System.out.println(kirpich3.getInfoItem());
            System.out.println(kirpich4.getInfoItem());
            System.out.println(meshok1.getInfoItem());
            System.out.println(meshok2.getInfoItem());

            System.out.println(korobka1.getInfoItem());
            System.out.println(korobka2.getInfoItem());

            System.out.println(stopka1.getInfoItem());
        System.out.println(stopka1.outItem().getName());
        System.out.println(stopka1.getInfoItem());

//        Kirpich A = new Kirpich("kirpich1", 2, "плоский");
//        Kirpich B = new Kirpich("kirpich1", 2, "плоский");
//        Kirpich C = new Kirpich("kirpich1", 2, "плоский");
//        Meshok D = new Meshok("мешок1", 0.1, 10, ",большой");
//        Korobka E = new Korobka("коробка1", 0.5, 10, "пЛоская");
//        Stopka F = new Stopka("Новая стопка",0.1,5,"стопка какая то");
//
//        D.addItem(A);
//        System.out.println(D.getWeight());
//        D.addItem(B);
//        System.out.println(D.getWeight());
//        E.addItem(C);
//        System.out.println(E.getWeight());
//        E.addItem(D);
//        System.out.println(E.getWeight());
//
//        F.addItem(E);
//        F.addItem(C);
//        F.addItem(D);   // - должно быть исключение
//        System.out.println(F.outItem().getName());



    }
}


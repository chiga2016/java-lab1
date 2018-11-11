import java.util.Random;

public class Main {
   // private static Object randomgenerator1;
    public static Random randomgenerator1;

    public static void main(String[] args) throws ItemAlreadyPlacedException {
        Kirpich kirpich1 = new Kirpich("Первый кирпич", 5.6, "красный", "облицовочный","плоский");
        Kirpich kirpich2 = new Kirpich("Второй кирпич", 5.6, "белый");
        Kirpich kirpich3 = new Kirpich("Третий кирпич", 5.6, "не получился");

        Meshok meshok1 = new Meshok("Первый мешок", 0.1,10, "Полиэтиленовый");
        Meshok meshok2 = new Meshok("Второй мешок", 0.1,10, "Плоский");

        Korobka korobka1= new Korobka("Первая коробка",1,20,"10","Плоская", "Синяя");
        Korobka korobka2 = new Korobka("Вторая коробка",1,15,"плоский");

        Stopka stopka1 = new Stopka("Первая стопка",20,20,"Странная");

        meshok2.addItem(kirpich1, meshok1);
        meshok2.addItem(kirpich2, meshok2);
        meshok2.addItem(kirpich3, meshok2);

        //System.out.println(meshok2.arr1..getName());
        // meshok2.outItem(meshok2.countItem());
          //System.out.println(meshok2.outItem().getName());

        System.out.println(meshok2.findItem("Первый ").getName());

        //System.out.println(meshok2.outItem(5));

        //System.out.println(meshok1.getSizeItenContMap());
        //System.out.println(meshok1.getItemInContainerMap(kirpich1));


        //meshok1.addItem(kirpich2);

            System.out.println(kirpich1.getInfoItem());
            System.out.println(kirpich2.getInfoItem());
            System.out.println(kirpich3.getInfoItem());

            System.out.println(meshok1.getInfoItem());
            System.out.println(meshok2.getInfoItem());

            System.out.println(korobka1.getInfoItem());
            System.out.println(korobka2.getInfoItem());

            System.out.println(stopka1.getInfoItem());



//            System.out.println(meshok1.getInfoItem());
//            meshok1.outItem(kirpich2);
//
//            System.out.println(kirpich1.getInfoItem());
//            System.out.println(kirpich2.getInfoItem());
//            System.out.println(meshok1.getInfoItem());
//
//        korobka1.addItem(kirpich1);
//        korobka1.addItem(kirpich2);
//        korobka1.getInfoItem();
//
//          stopka1.addItem(kirpich1);
//
//        System.out.println(stopka1.getInfoItem());
//        //  stopka1.getInfoItem();



    }
}


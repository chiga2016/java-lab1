import java.util.Random;

public class Main {

    public static void main(String[] args) throws ItemAlreadyPlacedException, ItemStoreException, ItemNotFlatException {
        Kirpich kirpich1 = new Kirpich("Первый кирпич", 4.9, "красный", "облицовочный","плоский");
        Kirpich kirpich2 = new Kirpich("Второй кирпич", 4.9, "белый");
        Kirpich kirpich3 = new Kirpich("Третий кирпич", 4.9, "не получился");
        Kirpich kirpich4 = new Kirpich("Четвертый кирпич", 4.9, "не получился");

        Meshok meshok1 = new Meshok("Первый мешок", 0.1,10, "Полиэтиленовый");
        Meshok meshok2 = new Meshok("Второй мешок", 0.1,10, "Бумажный");

        Korobka korobka1= new Korobka("Первая коробка",1,20,"10","плоский", "Синяя");
        Korobka korobka2 = new Korobka("Вторая коробка",1,15,"плоский");

        Stopka stopka1 = new Stopka("Первая стопка",1,5,"Странная");

        korobka1.addItem(kirpich1);
        korobka1.addItem(kirpich2);
        korobka2.addItem(kirpich3);
        meshok1.addItem(kirpich1);

        stopka1.addItem(korobka1);
        stopka1.addItem(korobka2);
        stopka1.addItem(kirpich4);
        //stopka1.outItem();

            System.out.println(kirpich1.getInfoItem());
            System.out.println(kirpich2.getInfoItem());
            System.out.println(kirpich3.getInfoItem());

            System.out.println(meshok1.getInfoItem());
            System.out.println(meshok2.getInfoItem());

            System.out.println(korobka1.getInfoItem());
            System.out.println(korobka2.getInfoItem());

            System.out.println(stopka1.getInfoItem());

    }
}


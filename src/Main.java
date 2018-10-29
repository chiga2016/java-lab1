public class Main {

    public static void main(String[] args) {
        Kirpich kirpich1 = new Kirpich("Первый кирпич", 5.6, "красный", "облицовочный","плоский");
        Kirpich kirpich2 = new Kirpich("Второй кирпич", 5.6, "белый");
        Kirpich kirpich3 = new Kirpich("Третий кирпич", 5.6, "не получился");

          Meshok meshok1 = new Meshok("Первый мешок", 0.1,10, "Полиэтиленовый");
          Meshok meshok2 = new Meshok("Второй мешок", 0.1,10, "Плоский");

        System.out.println(kirpich1.getInfoItem());
        System.out.println(kirpich2.getInfoItem());
        //System.out.println(kirpich1.getParam());
        //System.out.println(isPloskii(kirpich1));

        meshok1.addItem(kirpich1);
        meshok1.addItem(kirpich2);

        System.out.println(kirpich1.getInfoItem());
        System.out.println(kirpich2.getInfoItem());

        System.out.println(meshok1.getInfoItem());
        meshok1.outItem(kirpich2);

        System.out.println(kirpich1.getInfoItem());
        System.out.println(kirpich2.getInfoItem());
        System.out.println(meshok1.getInfoItem());

        //meshok1.addItem(kirpich1);   //(new Kirpich("Первый кирпич в мешке", 2));
        //meshok1.addItem(new Kirpich("Второй кирпич в мешке", 2, "Плоский"));

        Korobka korobka1= new Korobka("Первая коробка",1,20,"10","Плоская", "Синяя");
        //meshok1.addItem(kirpich1);

       // korobka1.addItem(kirpich1);
       // korobka1.addItem(kirpich2);

        //System.out.println(korobka1.getInfoItem());

        //Stopka stopka1 = new Stopka("Первая стопка", 2,15,"Высокая стопка");

        //stopka1.addItem(kirpich1);
        //stopka1.addItem(kirpich2);

        //System.out.println(stopka1.getInfoItem());

        /*
        Iterator<Item> iter1 = meshok1.arr1.iterator();
        System.out.println(meshok1.getInfoItem());
        while(iter1.hasNext()) System.out.println(iter1.next().getInfoItem());
        */






          Stopka stopka1 = new Stopka("первая стопка",20,20,"Странная");
          stopka1.addItem(kirpich1);
        //  stopka1.getInfoItem();



    }
}


import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.nio.file.Files;
import java.nio.file.Path;

import static javafx.scene.input.KeyCode.F;
import static javax.management.Query.not;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.*;

public class ItemContainerTest {
    Kirpich A = new Kirpich("kirpich1", 2, "плоский");
    Kirpich B = new Kirpich("kirpich2", 2, "плоский");
    Kirpich C = new Kirpich("kirpich3", 2, "плоский");
    Meshok D = new Meshok("мешок1", 0.1, 10, ",большой");
    Meshok G = new Meshok("мешок2", 0.1, 10, "второй мешок");
    Korobka E = new Korobka("коробка1", 0.5, 10, "пЛоская");
    Stopka F = new Stopka("Новая стопка",0.1,5,"стопка какая то");

    @Test
    public void test1() throws Exception {

            D.addItem(A);
            //System.out.println(D.getWeight());
            D.addItem(B);
            //System.out.println(D.getWeight());

            E.addItem(C);
            //System.out.println(E.getWeight());
            assertEquals(E.getWeight(), 2.5,0);
            E.addItem(D);
            //System.out.println(E.getWeight());
            assertEquals(E.getWeight(),6.6,0);

            F.addItem(E);
          //  F.addItem(C); // - должно быть исключение
            //System.out.println(F.outItem().getName());
            assertTrue(F.outItem() == E);
           // F.addItem(G);   // - должно быть исключение


    }

//
    @Test(expected=Exception.class)
    public void test2() throws Exception {
            Kirpich kirpich1 = new Kirpich("кирпич1",2, "плоский");
            Korobka korobka1 = new Korobka("коробка1",0.5, 5);
            korobka1.addItem(kirpich1);
            korobka1.addItem(kirpich1);

    }


    }






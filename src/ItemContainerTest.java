import org.junit.Test;

import static javafx.scene.input.KeyCode.F;
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
    public void test1() {
        try {
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
            F.addItem(C);
            //System.out.println(F.outItem().getName());
            assertTrue(F.outItem() == E);
            F.addItem(G);   // - должно быть исключение
        }
        catch (ItemAlreadyPlacedException | ItemStoreException ex){
            System.out.println(ex.getMessage());
        }

    }

    @Test
    public void sumWeight() {
    }







}
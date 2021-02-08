import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class PrinterTest {

    Printer canon;
    Printer hp;
    Printer apple;
    Printer pixma;

    @Before
    public void before(){
        canon = new Printer("Canon", 30, 90);
        hp = new Printer("hp", 120, 200);
        apple = new Printer("Apple", 20, 30);
        pixma = new Printer("Pixma", 20, 10);

    }

    @Test
    public void hasName(){
        assertEquals("Canon", canon.getName());
    }

    @Test
    public void getSheets(){
        assertEquals(30, canon.getSheetsLeft());
    }
    @Test
    public void print(){
        canon.print(2, 4);
        assertEquals(22, canon.getSheetsLeft());
    }
    @Test
    public void printAgain(){
        hp.print(12, 4);
        assertEquals(72, hp.getSheetsLeft());
    }
    @Test
    public void print3(){
        apple.print(12, 4);
        assertEquals(20, apple.getSheetsLeft());
    }
    @Test
    public void print4(){
        pixma.print(3, 4);
        assertEquals(20, pixma.getSheetsLeft());
    }

}

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class PrinterTest {

    Printer canon;
    Printer hp;

    @Before
    public void before(){
        canon = new Printer("Canon", 30);
        hp = new Printer("hp", 120);
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

}

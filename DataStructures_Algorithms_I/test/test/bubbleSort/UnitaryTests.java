package test.bubbleSort;

import ActividadClase_2.DoublyLinkedList.DList;
import org.junit.Test;

public class UnitaryTests {
    @Test
    public void testSucces(){
        DList<Integer> lista = new DList<>();
        lista.appendLast(45);
        lista.appendLast(45);
        lista.appendLast(45);
        lista.getHead();
    }

}

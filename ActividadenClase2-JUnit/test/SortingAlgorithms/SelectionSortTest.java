package SortingAlgorithms;

import ActividadClase_2.DoublyLinkedList.DList;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SelectionSortTest {
    DList<Integer> listaOrdenada = new DList<Integer>();
    DList<Integer> lista = new DList<Integer>();

    public void configLists() {
        listaOrdenada.appendLast(2);
        listaOrdenada.appendLast(3);
        listaOrdenada.appendLast(3);
        listaOrdenada.appendLast(4);
        listaOrdenada.appendLast(5);
        listaOrdenada.appendLast(7);
        listaOrdenada.appendLast(7);
        listaOrdenada.appendLast(41);


        lista.appendLast(41);
        lista.appendLast(2);
        lista.appendLast(7);
        lista.appendLast(3);
        lista.appendLast(3);
        lista.appendLast(7);
        lista.appendLast(5);
        lista.appendLast(4);

    }
    @Test
    public void bestCaseEscenario() {
        this.configLists();
        SelectionSort.sort(listaOrdenada);

     }

    @Test
    public void worstCaseEscenario() {
        this.configLists();
        SelectionSort.sort(lista);

        Assert.assertEquals(lista.toString(), listaOrdenada.toString());
    }

    @Test
    public void emptyList() {
        this.configLists();
        SelectionSort.sort(new DList());
    }  

    @Test
    public void nullList() {

        SelectionSort.sort(null);

    }
}
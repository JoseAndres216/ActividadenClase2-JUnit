package SortingAlgorithms;

import ActividadClase_2.DoublyLinkedList.DList;
import ActividadClase_2.DoublyLinkedList.DNode;

public class BubbleSort {

    public static void sort(DList lista) {
        for (DNode i = lista.getHead(); i != null; i = i.getNext()) {
            for (DNode j = lista.getHead(); j != null; j = j.getNext()) {
                if (i.getData().compareTo(j.getData()) < 0) {
                    lista.swap(i, j);
                }
            }
        }
    }
}


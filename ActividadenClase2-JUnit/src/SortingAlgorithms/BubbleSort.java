package SortingAlgorithms;

import ActividadClase_2.DoublyLinkedList.DList;
import ActividadClase_2.DoublyLinkedList.DNode;

import java.io.IOException;

public class BubbleSort {

    public static void sort(DList lista) {
        if(lista == null || lista.len()==0){
            System.out.println("List cant be null or empty");
            return;
        }
        for (DNode i = lista.getHead(); i != null; i = i.getNext()) {
            for (DNode j = lista.getHead(); j != null; j = j.getNext()) {
                if (i.getData().compareTo(j.getData()) < 0) {
                    lista.swap(i, j);
                }
            }
        }
    }
}


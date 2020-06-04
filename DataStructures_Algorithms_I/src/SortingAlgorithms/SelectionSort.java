package SortingAlgorithms;

import ActividadClase_2.DoublyLinkedList.DList;
import ActividadClase_2.DoublyLinkedList.DNode;

import java.awt.dnd.DnDConstants;

public class SelectionSort {
    public SelectionSort(){
        return;
    }

    public static void sort(DList list){
        for(DNode first = list.getHead(); first.getNext()!=null; first=first.getNext()){
            DNode smaller=first;
            DNode temp=smaller.getNext();
            while(temp!=null){
                if(temp.getData().compareTo(smaller.getData())<0){
                    smaller=temp;
                }
                temp=temp.getNext();
            }
            list.swap(first, smaller);
        }
    }
}

package SortingAlgorithms;

import ActividadClase_2.DoublyLinkedList.DList;
import ActividadClase_2.DoublyLinkedList.DNode;

public class InsertionSort {

    public static void sort(DList lista) {

        if(lista == null || lista.len()==0){

            System.out.println("List cant be null or empty");
            return;
        }

        for (DNode i = lista.getHead(); i != null; i = i.getNext()) {
            DNode temp = i.getNext();

            if(temp == lista.getTail()){
                while(i.getData().compareTo(temp.getData()) < 0 && temp.getPrev() != null){
                    temp = temp.getPrev();
                }
                if(temp.getPrev()==null){
                    System.out.println("Llego al inicio de la lista en el while, no se ordeno nada");
                }
                lista.swap(i, temp);
                break;
                //caso para el ultimo elemento
            }

            else{
                while(i.getData().compareTo(temp.getData() ) < 0 && temp.getPrev() != null){
                    temp = temp.getPrev();
                }
                if(temp.getPrev()==null){
                    System.out.println("Llego al inicio de la lista en el while, no se ordeno nada");
                }
                lista.swap(i, temp);
            }
        }
    }
}

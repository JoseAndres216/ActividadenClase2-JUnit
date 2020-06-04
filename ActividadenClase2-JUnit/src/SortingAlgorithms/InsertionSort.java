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

    public static void main(String[] args) {
        DList<Integer> lista = new DList<>();
        lista.appendLast(1);
        lista.appendLast(4);
        lista.appendLast(2);
        lista.appendLast(3);
        lista.appendLast(5);
        lista.appendLast(15);
        lista.appendLast(45);
        lista.appendLast(24);
        lista.appendLast(38);
        lista.appendLast(56);


        InsertionSort.sort(lista);
        System.out.println(lista);
    }
}

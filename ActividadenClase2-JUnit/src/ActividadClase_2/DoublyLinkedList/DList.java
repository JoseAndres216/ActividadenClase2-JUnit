package ActividadClase_2.DoublyLinkedList;

public class DList<T extends Comparable<T>> {
    private DNode<T> head, tail;
    private int len;

    public DList() {
        this.head = this.tail = null;
        this.len = 0;
    }
    public void swap(DNode<T> i, DNode<T> j) {
        T temp = i.getData();
        i.setData(j.getData());
        j.setData(temp);
    }
    public void Bubblesort() {
        for (DNode<T> i = this.head; i != null; i = i.getNext()) {
            for (DNode<T> j = this.head; j != null; j = j.getNext()) {
                if (i.getData().compareTo(j.getData()) < 0) {
                    T temp = i.getData();
                    i.setData(j.getData());
                    j.setData(temp);
                }
            }
        }
    }

    public DNode getHead() {
        return this.head;
    }

    public void appendLast(DNode<T> node) {
        this.appendLast(node.getData());
    }

    public void appendLast(T data) {
        DNode<T> newNode = new DNode(data);
        if (this.head == null) {
            this.head = this.tail = newNode;
            this.len++;
        } else {
            newNode.setPrev(this.tail);//attach the prev of the new to the tail
            this.tail.setNext(newNode);// attach the next of the tail to the new tail
            this.tail = newNode;// Update tail reference.
            len++; // Update list length
        }
    }

    public T index(int index) throws Exception {
        T valueReturn;
        if (index == (this.len - 1)) {
            valueReturn = this.tail.getData();
        } else if (index == 0 && this.head != null) {
            valueReturn = this.head.getData();
        } else {
            DNode<T> tmp = this.head;
            int counter = 0;
            while (counter != index) {
                if (tmp == null) {
                    throw new Exception("Null pointer, index out of range");
                }
                tmp = tmp.getNext();
                counter++;
            }

            valueReturn = tmp.getData();
        }
        return valueReturn;
    }


    @Override
    public String toString() {
        StringBuilder stBuilder = new StringBuilder();
        if (this.head == null) {
            stBuilder.append("Empty list.");
        } else {
            stBuilder.append("List of: [");
            DNode<T> temp = this.head;
            while (temp.getNext() != null) {
                stBuilder.append(temp.toString()).append(", ");
                temp = temp.getNext();
            }
            stBuilder.append(temp.toString()).append("]");

        }
        return stBuilder.toString();
    }

    public int len() {
        return this.len;
    }

    public DNode getTail() {
        return this.tail;
    }
}

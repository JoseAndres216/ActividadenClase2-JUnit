package ActividadClase_2.DoublyLinkedList;

public class DNode<T extends Comparable<T>> {
    private DNode<T> next, prev;
    private T data;

    public DNode(T data) {
        this.data = data;
        this.next = this.prev = null;
    }

    public DNode(T data, DNode<T> next, DNode<T> prev) {
        this.next = next;
        this.prev = prev;
        this.data = data;
    }
    public DNode<T> getNext() {
        return next;
    }

    public void setNext(DNode<T> next) {
        this.next = next;
    }

    public DNode<T> getPrev() {
        return prev;
    }

    public void setPrev(DNode<T> prev) {
        this.prev = prev;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
    @Override
    public String toString(){
        return this.data.toString();
    }
}

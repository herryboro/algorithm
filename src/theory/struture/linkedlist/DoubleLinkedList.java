package theory.struture.linkedlist;

public class DoubleLinkedList<T> {
    private Node<T> head;
    private Node<T> tail;

    public class Node<T> {
        T data;
        Node<T> prev;
        Node<T> next;

        public Node(T data) {
            this.data = data;
        }
    }

    public void addNode(T data) {
        if (this.head == null) {
            this.head = new Node<T>(data);
            this.tail = this.head;
        } else {
            Node<T> node = this.head;
            while (node.next != null) {
                node = node.next;
            }
            node.next = new Node<T>(data);
            node.next.prev = node;
            this.tail = node.next;
        }
    }

    public void printAll() {
        Node<T> node = this.head;
        if (node != null) {
            while (node.next != null) {
                System.out.println(node.data);
                node = node.next;
            }
            System.out.println(node.data);
        }
    }

    public T searchFromHead(T isData) {
        if (this.head == null) {
            return null;
        } else {
            Node<T> node = this.head;
            while (node != null) {
                if (node.data == isData) {
                    return node.data;
                } else {
                    node = node.next;
                }
            }
            return null;
        }
    }

    public T searchFromTail(T isData) {
        if (this.head == null) {
            return null;
        } else {
            Node<T> node = this.tail;
            while (node != null) {
                if (node.data == isData) {
                    return node.data;
                } else {
                    node = node.prev;
                }
            }
            return null;
        }
    }

    public boolean insertToFront(T addData, T existedData) {
        if (this.head == null) {
            this.head = new Node<T>(addData);
            this.tail = this.head;
            return true;
        } else if (this.head.data == existedData) {
            Node<T> newNode = new Node<T>(addData);
            newNode.next = this.head;
            this.head = newNode;
            return true;
        } else {
            Node<T> node = this.head;
            while (node != null) {
                if (node.data == existedData) {
                    Node<T> prevNode = node.prev;
                    prevNode.next = new Node<T>(addData);
                    prevNode.next.next = node;
                    prevNode.next.prev = prevNode;
                    node.prev = prevNode.next;
                    return true;
                } else {
                    node = node.next;
                }
            }
            return false;
        }
    }

    public static void main(String[] args) {
        DoubleLinkedList<Integer> MyLinkedList = new DoubleLinkedList<Integer>();

        MyLinkedList.addNode(1);
        MyLinkedList.addNode(2);
        MyLinkedList.addNode(3);
        MyLinkedList.addNode(4);
        MyLinkedList.addNode(5);
//        MyLinkedList.printAll();
        System.out.println("----------------");

        MyLinkedList.insertToFront(1, 2);
        MyLinkedList.insertToFront(6, 5);

//
//
        MyLinkedList.printAll();
//        System.out.println("----------------");
//
//        MyLinkedList.insertToFront(6, 2);
//        MyLinkedList.insertToFront(1, 0);
//        MyLinkedList.printAll();
//        System.out.println("----------------");
//
//        MyLinkedList.addNode(6);
//        MyLinkedList.printAll();
//        System.out.println("----------------");
//        System.out.println(MyLinkedList.searchFromHead(10));
    }
}

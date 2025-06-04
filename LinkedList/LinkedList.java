public class LinkedList {

    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    // Add at the beginning
    public void addFirst(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    // Add at the end
    public void addLast(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    // Add in the middle at index `idx`
    public void addMiddle(int idx, int data) {
        if (idx == 0) {
            addFirst(data);
            return;
        }

        Node newNode = new Node(data);
        size++;

        Node temp = head;
        int ind = 0;

        while (ind < idx - 1 && temp != null) {
            temp = temp.next;
            ind++;
        }

        if (temp == null) return;

        newNode.next = temp.next;
        temp.next = newNode;
    }

    // Print the list
    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("Null");
    }

    // Remove first
    public int removeFirst() {
        if (size == 0) {
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size--;
            return val;
        }
        size--;
        int val = head.data;
        head = head.next;
        return val;
    }

    // Remove last
    public static int removeLast() {
        if (size == 0) {
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int val = head.data;
            size--;
            head = tail = null;
            return val;
        }

        Node prev = head;
        for (int i = 0; i < size - 2; i++) {
            prev = prev.next;
        }

        int val = prev.next.data;
        prev.next = null;
        tail = prev;
        size--;
        return val;
    }

    // Reverse the list
    public void reverse() {
        Node prev = null;
        Node curr = tail = head;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;

            prev = curr;
            curr = next;
        }

        head = prev;
    }

    // Delete nth node from end
    public void deleteNode(int n) {
        int sz = 0;
        Node temp = head;

        while (temp != null) {
            temp = temp.next;
            sz++;
        }

        if (n == sz) {
            head = head.next;
            size--;
            return;
        }

        int i = 1;
        int iToFind = sz - n;
        Node prev = head;

        while (i < iToFind) {
            prev = prev.next;
            i++;
        }

        prev.next = prev.next.next;
        size--;
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();

        ll.addFirst(1);
        ll.addFirst(2);
        ll.addLast(5);
        ll.addLast(9);
        ll.addMiddle(2, 18);

        ll.printList();
        ll.deleteNode(3);
        ll.reverse();

        System.out.print("Size after deletion: " + ll.size);
        System.out.println();

        ll.removeLast();
        ll.printList();
        System.out.println("Size after removing last: " + ll.size);
    }
}

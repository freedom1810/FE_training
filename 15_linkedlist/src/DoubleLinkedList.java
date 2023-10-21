class DoubleLinkedList {
    Node head;

    public DoubleLinkedList(){

    }

    public DoubleLinkedList(int[] arr) {
        for (int num : arr) {
            add(num);
        }
    }

    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
            newNode.prev = current;
        }
    }


    public void printList() {
        System.out.println("Danh sách:");
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public void delete(int data) {
        if (head == null) {
            return;
        }

        if (head.data == data) {
            head = head.next;
            if (head != null) {
                head.prev = null;
            }
            return;
        }

        Node current = head;
        while (current != null && current.data != data) {
            current = current.next;
        }

        if (current == null) {
            return;
        }

        if (current.next != null) {
            current.next.prev = current.prev;
        }

        if (current.prev != null) {
            current.prev.next = current.next;
        }
    }


    public static void main(String[] args) {
        DoubleLinkedList list = new DoubleLinkedList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.printList();

        // Hãy viết một constructor cho DoubleLinkedList nhận vào một array int[] triển khai thành các phần tử trong DoubleLinkedList
        int[] arr = {1, 2, 3, 4, 5};
        DoubleLinkedList doubleLinkedList1 = new DoubleLinkedList(arr);
        doubleLinkedList1.printList();


        //
        int[] deleteArr = {1, 2, 3, 4, 5};
        DoubleLinkedList deleteLinkList = new DoubleLinkedList(deleteArr);
        deleteLinkList.printList();

        System.out.println("// Xoá phần tử có giá trị 3");
        deleteLinkList.delete(3);
        deleteLinkList.printList(); // In danh sách sau khi xoá

        System.out.println("// Xoá phần tử đầu tiên (head)");
        deleteLinkList.delete(1);
        deleteLinkList.printList(); // In danh sách sau khi xoá

    }
}
public class SinglyLinkedList {
    private static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node head;

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
        }
    }

    public int sumOfNumbersWith3() {
        SinglyLinkedList newList = new SinglyLinkedList();
        int sum = 0;

        Node current = head;
        while (current != null) {
            if (containsThree(current.data)) {
                newList.add(current.data);
                sum += current.data;
            }
            current = current.next;
        }

        return sum;
    }

    private boolean containsThree(int number) {
        return String.valueOf(number).contains("3");
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}


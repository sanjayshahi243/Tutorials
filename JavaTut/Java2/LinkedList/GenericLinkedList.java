public class GenericLinkedList<E> {

    private class Node <E> {
        E data;
        Node<E> next;
        
        Node(E data, Node<E> next) {
            this.data = data;
            this.next = next;
        }

    }

    private Node<E> head;
    public GenericLinkedList() {
        head = null;
    }

    public boolean isEmpty () {
        return (head==null);
    }

    public void addToFront (E newData) {
        head = new Node<E>(newData, head);
    }

    public void addToRear(E newData) {
        Node<E> node = new Node<E> (newData, null);
        Node<E> current = head;
        if (head == null) {
            head = node;
        } else {
            while (current.next != null) {
                current = current.next;
            }
            current.next = node;
        }
    }

    public void removeFromFront () {
        if (isEmpty()) return;
        head = head.next;
    }

    public void removeFromRear () {
        if (isEmpty()) return;
        if (head.next == null) {
            head = null;
        }
        Node <E> current = head;
        while (current.next.next != null) {
            current = current.next;
        }
        current.next = null;
    }

    public String toString () {
        Node<E> current = head;
        String result = "";
        while (current != null) {
            result = result + current.data.toString() + "\n";
            current = current.next;
        }
        return result;
    }

    public boolean contains (E target) {
        if (isEmpty()) return false;

        boolean found = false;

        Node<E> current = head;
        while((current != null) && !found) {
            if (target.equals(current.data)) {
                found = true;
            } else {
                current = current.next;
            }
        }
        return found;
    }

    public static void main(String[] args) {
        GenericLinkedList<String> favBabySongs = new GenericLinkedList<>();
        favBabySongs.addToFront("Humpty Dumpty");
        favBabySongs.addToRear("Swing Low Sweet Chariot");
        favBabySongs.addToFront("Itsy Bitsy Spider");
        favBabySongs.addToRear("Twinkle, Twinkle Little Star");
        favBabySongs.addToFront("Wheels on the Bus");
        System.out.println(favBabySongs.toString());
        System.out.println("Humpty Dumpty Exists:" + favBabySongs.contains("Humpty Dumpty"));
        System.out.println("Baby Shark Exists:" + favBabySongs.contains("Baby Shark"));

        System.out.println("\nRemoving First Node Wheels on the Bus");
        favBabySongs.removeFromFront();
        System.out.println("Wheels on the Bus Exists:" + favBabySongs.contains("Wheels on the Bus"));
        
        System.out.println("");
        System.out.println(favBabySongs.toString());

        System.out.println("\nRemoving Last Node Twinkle, Twinkle Little Star");
        favBabySongs.removeFromRear();
        System.out.println("Twinkle, Twinkle Little Star Exists:" + favBabySongs.contains("Twinkle, Twinkle Little Star"));
        System.out.println("");
        System.out.println(favBabySongs.toString());
    }
}
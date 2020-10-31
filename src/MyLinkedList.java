/**
 * Created With IntelliJ IDEA.
 * Description:
 * User:ZouSS
 * Date:2020-10-31
 * Time:13:45
 **/

class Node {
    public int data;
    public Node next;

    public Node(int data) {
        this.data = data;
        this.next = next;
    }


}
public class MyLinkedList {

    public Node head;
    public void addLast(int data){
        Node node = new Node(data);
        if (this.head == null){
            this.head = node;
            return;
        }
        Node cur = this.head;
        while(cur.next != null){
            cur = cur.next;
        }
        cur.next = node;
    }

    public void display(){
        Node cur = this.head;
        while(cur != null){
            System.out.print(cur.data+" ");
            cur = cur.next;
        }
        System.out.println();
    }
    public Node findPrev(int toRemove){
        Node prev = this.head;
        while(prev.next != null){
            if (prev.next.data == toRemove){
                return prev;
            }
            prev = prev.next;
        }
        return null;
    }
    public void remove(int toRemove){
        if (this.head ==null){
            return;
        }
        if (this.head.data == toRemove){
            this.head = this.head.next;
        }
        Node prev = findPrev(toRemove);
        if (prev == null){
            return;
        }
        Node del = prev.next;
        prev.next = del.next;
    }

    public void removeAllKey(int keys){
        Node prev = this.head;
        Node cur = this.head.next;
        if (this.head == null){
            return;
        }
        while(cur != null){
            if (cur.data == keys){
                prev.next = cur.next;
                cur = cur.next;
            }else {
                prev = cur;
                cur = cur.next;
            }

        }
        if (this.head.data == keys){
            this.head = this.head.next;
        }
    }

    public Node reverseList() {
        if (this.head == null){
            return null;
        }
        Node cur = this.head;
        Node prev = null;
        Node newHead = null;
        while(cur != null){
            Node curNext = cur.next;
            if (curNext == null){
                newHead = cur;
            }
            cur.next = prev;
            prev = cur;
            cur = curNext;
        }
        return newHead;
    }
    public void display(Node newHead){
        Node cur = newHead;
        while(cur != null){
            System.out.print(cur.data+"  ");
            cur = cur.next;
        }
    }
}

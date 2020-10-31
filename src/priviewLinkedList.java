/**
 * Created With IntelliJ IDEA.
 * Description:
 * User:ZouSS
 * Date:2020-10-31
 * Time:13:45
 **/
public class priviewLinkedList {
    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.addLast(1);
        myLinkedList.addLast(3);
        myLinkedList.addLast(5);
        myLinkedList.addLast(7);
       /* myLinkedList.addLast(9);
        myLinkedList.removeAllKey(3);
        myLinkedList.display();*/
       myLinkedList.display();
       Node ret = myLinkedList.reverseList();
       myLinkedList.display(ret);
    }

}

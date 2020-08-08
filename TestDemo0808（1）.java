import java.util.Scanner;
class ListNode {
    public int val;
    public ListNode next;
}

class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode newHead = l1;
        if(l1.val > l2.val){
            newHead = l2;
            l2 = l2.next;
        } else{
            l1 = l1.next;
        }
        ListNode cur = newHead;
        while(l1 != null && l2 != null){
        if(l1.val < l2.val){
            cur.next = l1;
            cur = cur.next;
            l1 = l1.next;
        } else{
            cur.next = l2;
            cur = cur.next;
            l2 = l2.next;
        }
    }
        if(l1 != null){
            cur.next = l1;
        }
        if(l2 != null){
            cur.next = l2;
        }
        return newHead;
}
public class TestDemo{
    public static void main(String[] args) {

    }
}
class ListNode{
    public int val;
    public ListNode next;

    public ListNode(int val){
        this.val = val;
    }
}

class Solution {
    //头插法
    public void addFirst(int data) {
        ListNode node = new ListNode(data);
        node.next = this.head;
        this.head = node;
    }

    //尾插法
    public void addLast(int data) {
        ListNode cur = this.head;
        ListNode node = new ListNode(data);
        if (head == null) {
            this.head = node;
        } else {
            while (cur.next != null) {
                cur = cur.next;
            }
            cur.next = node;
        }
    }

    //给定一个链表，判断链表中是否有环
    public ListNode head;

    public boolean hasCycle() {
        if (this.head == null) {
            return false;
        }
        ListNode fast = this.head;
        ListNode slow = this.head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true;
            }
        }
        return false;
    }

    //输入两个链表，找出它们的第一个公共结点
//    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
//        ListNode newHead = l1;
//        if(l1.val > l2.val){
//            newHead = l2;
//        }
//        ListNode cur = newHead;
//        while (cur != null && l1 != null && l2 != null){
//            if(l1.val < l2.val){
//                cur = l1;
//                cur = cur.next;
//                l1 = l1.next;
//            } else{
//                cur = l2;
//                cur = cur.next;
//                l2 = l2.next;
//            }
//            if (l2 == null){
//                cur.next = l2;
//            }
//        }
//        return newHead;
//    }

    //链表开始入环的第一个节点
    public ListNode detectCycle(ListNode head) {
        ListNode slow = this.head;
        ListNode fast = this.head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (slow == fast) {
                break;
            }
        }
        if (fast == null || fast.next == null) {
            return null;
        } else {
            slow = this.head;
            while (slow != fast) {
                slow = slow.next;
                fast = fast.next;
            }
            return slow;
        }
    }

    //输入两个链表，找出它们的第一个公共结点
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode la = headA;
        ListNode lb = headB;
        int las = 0;
        int lbs = 0;
        while (la != null) {
            la = la.next;
            las++;
        }
        while (lb != null) {
            lb = lb.next;
            lbs++;
        }
        if (las < lbs) {
            la = headB;
            lb = headA;
        } else {
            la = headA;
            lb = headB;
        }
        int k = Math.abs(las - lbs);
        while (la != null && lb != null) {
            if (la == lb) {
                return la;
            }
            la = la.next;
            if (k > 0) {
                k--;
            } else {
                lb = lb.next;
            }
        }
        return null;
    }

    //链表的回文结构
    //1、找出链表尾结点和中间结点
    //2、将链表后半部分指向逆置
    //3、首尾结点同时遍历，判断各结点val是否相同，直到共同指向中间结点
    public boolean chkPalindrome(ListNode A) {
        if(A == null){
            return false;
        }
        ListNode head = A;
        ListNode cur = A;
        ListNode mid = A;
        int i = 1;
        while (cur != null) {
            if (i % 2 == 0) {
                mid = mid.next;
            }
            cur = cur.next;
            i++;
        }
        //找出尾结点和中间结点
        cur = mid;
        ListNode curNext = cur.next;
        while (cur.next != null) {
            cur = curNext;
            curNext = cur.next;
            cur.next = mid;
            mid = cur;
        }
        ListNode tail = cur;
        //逆置链表后半段
        while (head != tail && head.next != tail) {
            if (head.val != tail.val) {
                return false;
            }
            head = head.next;
            tail = tail.next;
        }
        if(head.val != tail.val){
            return false;
        }
        return true;
    }
}

public class HomeDemo {
    public static void main(String[] args) {
        Solution st = new Solution();
        st.addLast(5);
//        st.addLast(9);
//        st.addLast(12);
//        st.addLast(12);
//        st.addLast(9);
//        st.addLast(5);
        System.out.println(st.chkPalindrome(st.head));
    }
}

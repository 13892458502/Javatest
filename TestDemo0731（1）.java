class Node{
    int val;
    Node prev;
    Node next;

    public Node(int val){
        this.val = val;
    }
}

class LinkedList{
    public Node head;
    public Node tail;
    //头插法
    public void addFirst(int data){
        Node node = new Node(data);
        if(this.head == null) {
            this.tail = node;
        } else{
            head.prev = node;
            node.next = head;
        }
        this.head = node;
    }

    //尾插法
    public void addLast(int data){
        Node node = new Node(data);
        if(this.head == null){
            this.head = node;
        } else{
            tail.next = node;
            node.prev = tail;
        }
        this.tail = node;
    }

    //任意位置插入,第一个数据节点为 x 号下标
    public void addIndex(int index,int data){
        if(index == 0){
            addFirst(data);
            return;
        }
        int lang = size();
        if(index-1 == lang){
            addLast(data);
            return;
        }
        Node cur = this.head;
        Node node = new Node(data);
        int i = 0;
        while (cur.next != null){
            if(i == index){
                node.next = cur;
                node.prev = cur.prev;
                cur.prev.next = node;
                cur.prev = node;
                return;
            }
            cur = cur.next;
            i++;
        }
    }

    //查找是否包含关键字key是否在单链表当中
    public boolean contains(int key){
        Node cur = this.head;
        while(cur != null){
            if(cur.val == key){
                return true;
            }
            cur = cur.next;
        }
        return false;
    }

    //删除第一次出现关键字为key的节点
    public void remove(int key){
        if (head.val == key){
            head = head.next;
            head.prev = null;
            return;
        }
        if(tail.val == key){
            tail = tail.prev;
            tail.next = null;
            return;
        }
        Node cur = this.head.next;
        while (cur.next != null){
            if(cur.val == key){
                cur.prev.next = cur.next;
                cur.next.prev = cur.prev;
                return;
            }
            cur = cur.next;
        }
    }

    //删除所有值为key的节点
    public void removeAllKey(int key){
        while(head.val == key){
            head = head.next;
            head.prev = null;
        }
        while(tail.val == key){
            tail = tail.prev;
            tail.next = null;
        }
        Node cur = this.head.next;
        while (cur.next != null){
            if(cur.val == key){
                cur.prev.next = cur.next;
                cur.next.prev = cur.prev;
            }
            cur = cur.next;
        }
    }

    //得到单链表的长度
    public int size(){
        int lang = 0;
        Node cur = this.head;
        while (cur != null){
            cur = cur.next;
            lang++;
        }
        return lang;
    }

    public void display(){
        Node cur = this.head;
        while(cur != null){
            System.out.print(cur.val+" ");
            cur = cur.next;
        }
        System.out.println("");
    }

    public void clear(){

    }
}

public class TestDemo {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.display();
    }
}

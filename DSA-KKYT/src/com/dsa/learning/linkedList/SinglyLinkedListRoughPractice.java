package com.dsa.learning.linkedList;

import java.util.HashMap;
import java.util.Map;

public class SinglyLinkedListRoughPractice {
    private int data;
    private SinglyLinkedListRoughPractice next;

    public SinglyLinkedListRoughPractice(int data) {
        this.data = data;
        this.next = null;
    }

    private static void print(SinglyLinkedListRoughPractice head) {
        if (head == null)
            return;
        while (head != null) {
            System.out.println(head.data);
            head = head.next;
        }
    }

    // In this approach we can only add numbers without carry addition numbers.
    private static SinglyLinkedListRoughPractice addTwoLinkedList(SinglyLinkedListRoughPractice one, SinglyLinkedListRoughPractice two) {
        if (one == null && two == null)
            return null;
        SinglyLinkedListRoughPractice output = null;
        while (one != null || two != null) {
            int temp = 0;
            if (one != null) {
                temp = one.data;
                one = one.next;
            }
            if (two != null) {
                temp = temp + two.data;
                two = two.next;
            }
            // Here write the logic to add the numbers in the new linked list and return the output.
        }
        return output;
    }

    private static SinglyLinkedListRoughPractice separateEvenAndOddIndex(SinglyLinkedListRoughPractice head) {
        if (head == null)
            return null;
        SinglyLinkedListRoughPractice evenHead = head.next;
        SinglyLinkedListRoughPractice evenNode = head.next;
        SinglyLinkedListRoughPractice oddNode = head;
        while (evenNode != null && evenNode.next != null) {
            oddNode.next = oddNode.next.next;
            evenNode.next = evenNode.next.next;
            oddNode = oddNode.next;
            evenNode = evenNode.next;
        }
        oddNode.next = evenHead;
        return head;
    }

    public static SinglyLinkedListRoughPractice sortZeroOneAndTwo(SinglyLinkedListRoughPractice head) {
        if (head == null)
            return null;
        SinglyLinkedListRoughPractice zeroHead = new SinglyLinkedListRoughPractice(-1);
        SinglyLinkedListRoughPractice oneHead = new SinglyLinkedListRoughPractice(-1);
        SinglyLinkedListRoughPractice twoHead = new SinglyLinkedListRoughPractice(-1);

        SinglyLinkedListRoughPractice zero = zeroHead;
        SinglyLinkedListRoughPractice one = oneHead;
        SinglyLinkedListRoughPractice two = twoHead;
        SinglyLinkedListRoughPractice node = head;

        while (node != null) {
            if (node.data == 0) {
                zero.next = node;
                zero = zero.next;
            } else if (node.data == 1) {
                one.next = node;
                one = one.next;
            } else {
                two.next = node;
                two = two.next;
            }
            node = node.next;
        }
        zero.next = oneHead.next != null ? oneHead.next : twoHead.next;
        one.next = twoHead.next;
        two.next = null;
        SinglyLinkedListRoughPractice newHead = zeroHead.next;
        return newHead;
    }

    private static void check(SinglyLinkedListRoughPractice head) {
        SinglyLinkedListRoughPractice node = head;
        while (node.next != null) {
            node = node.next;
        }
        node.next = new SinglyLinkedListRoughPractice(5);
    }

    private static SinglyLinkedListRoughPractice removeNthNodeFromEnd(SinglyLinkedListRoughPractice head, int index) {
        if (head == null)
            return null;
        SinglyLinkedListRoughPractice slow = head;
        SinglyLinkedListRoughPractice fast = head;
        for (int i = 0; i < index; i++) {
            fast = fast.next;
        }
        if (fast == null)
            return head.next;
        while (fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;
        return head;
    }

    private static SinglyLinkedListRoughPractice reverse(SinglyLinkedListRoughPractice head) {
        if (head == null) {
            return null;
        }
        SinglyLinkedListRoughPractice curr = head;
        SinglyLinkedListRoughPractice prev = null;
        SinglyLinkedListRoughPractice next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    private static boolean isPalindrome(SinglyLinkedListRoughPractice head) {
        if (head == null)
            return false;
        SinglyLinkedListRoughPractice node = head;
        SinglyLinkedListRoughPractice slow = node;
        SinglyLinkedListRoughPractice fast = node;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        SinglyLinkedListRoughPractice reverse = reverse(slow.next);
        while (reverse != null) {
            if (node.data != reverse.data)
                return false;
            node = node.next;
            reverse = reverse.next;
        }
        return true;
    }

    private static SinglyLinkedListRoughPractice addOneToTheLinkedList(SinglyLinkedListRoughPractice head) {
        if (head == null)
            return null;
        SinglyLinkedListRoughPractice node = head;
        SinglyLinkedListRoughPractice reverse = reverse(node);
        SinglyLinkedListRoughPractice node2 = reverse;
        int carry = 1;
        while (node2 != null) {
            int newData = node2.data + carry;
            if (newData == 10) {
                node2.data = 0;
                carry = 1;
            } else {
                node2.data = newData;
                carry = 0;
            }
            node2 = node2.next;
        }
        if (carry == 1) {
            SinglyLinkedListRoughPractice newNode = new SinglyLinkedListRoughPractice(carry);
            reverse = reverse(reverse);
            newNode.next = reverse;
            return newNode;
        }
        return reverse(reverse);
    }

    // Watch Video for any confusion- https://www.youtube.com/watch?v=0DYoPz2Tpt4&list=PLgUwDviBIf0rAuz8tVcM0AymmhTRsfaLU&index=14
    private static SinglyLinkedListRoughPractice findIntersectionPoint(SinglyLinkedListRoughPractice head1, SinglyLinkedListRoughPractice head2) {
        SinglyLinkedListRoughPractice temp1 = head1;
        SinglyLinkedListRoughPractice temp2 = head2;
        while (temp1 != temp2) {
            temp1 = temp1.next;
            temp2 = temp2.next;
            if (temp1 == temp2)
                return temp1;
            if (temp1 == null)
                temp1 = head2;

            if (temp2 == null)
                temp2 = head1;
        }
        return temp1;
    }

    //https://www.youtube.com/watch?v=wiOo4DC5GGA&list=PLgUwDviBIf0rAuz8tVcM0AymmhTRsfaLU&index=15
    private static boolean detectALoop(SinglyLinkedListRoughPractice head) {
        SinglyLinkedListRoughPractice temp = head;
        Map<SinglyLinkedListRoughPractice, Integer> map = new HashMap<>();
        int tempValue = 0;
        while (temp != null) {
            if (!map.containsKey(temp)) {
                map.put(temp, tempValue++);
                temp = temp.next;
            } else {
                return true;
            }
        }
        return false;
    }

    private static boolean detectALoopEfficientApproach(SinglyLinkedListRoughPractice head) {
        SinglyLinkedListRoughPractice slow = head;
        SinglyLinkedListRoughPractice fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast)
                return true;
        }
        return false;
    }

    private static SinglyLinkedListRoughPractice findNthNode(SinglyLinkedListRoughPractice head, int n){
            int count=1;
            while(head!=null){
                if(n==count)
                    return head;
               head=head.next;
            }
            return head;
    }

    private static SinglyLinkedListRoughPractice rotateTheLinkedListByKTimes(SinglyLinkedListRoughPractice head, int k) {
        SinglyLinkedListRoughPractice temp = head;
        SinglyLinkedListRoughPractice tail = head;
        int length = 1;
        while (tail.next != null) {
            tail = tail.next;
            length++;
        }
        if (k % length == 0)
            return head;

        k = k % length;

        tail.next = head;
        SinglyLinkedListRoughPractice newNode = findNthNode(head, length - k);
       head= newNode.next;
       newNode.next=null;
        return head;
    }


    public static void main(String[] args) {
//        SinglyLinkedListRoughPractice one = new SinglyLinkedListRoughPractice(1);
//        SinglyLinkedListRoughPractice node1 = new SinglyLinkedListRoughPractice(2);
//        SinglyLinkedListRoughPractice node2 = new SinglyLinkedListRoughPractice(3);
//        one.next = node1;
//        node1.next = node2;
//
//        SinglyLinkedListRoughPractice two = new SinglyLinkedListRoughPractice(4);
//        SinglyLinkedListRoughPractice n1 = new SinglyLinkedListRoughPractice(5);
//        SinglyLinkedListRoughPractice n2 = new SinglyLinkedListRoughPractice(0);
//        two.next = n1;
//        n1.next = n2;

        // print(addTwoLinkedList(one, two));
//        SinglyLinkedListRoughPractice head = new SinglyLinkedListRoughPractice(1);
//        SinglyLinkedListRoughPractice node1 = new SinglyLinkedListRoughPractice(2);
//        SinglyLinkedListRoughPractice node2 = new SinglyLinkedListRoughPractice(3);
//        SinglyLinkedListRoughPractice node3 = new SinglyLinkedListRoughPractice(4);
//        head.next = node1;
//        node1.next = node2;
//        node2.next = node3;
        //SinglyLinkedListRoughPractice singlyLinkedListRoughPractice = separateEvenAndOddIndex(head);
        //print(singlyLinkedListRoughPractice);
//        SinglyLinkedListRoughPractice head1 = new SinglyLinkedListRoughPractice(3);
//        SinglyLinkedListRoughPractice node1 = new SinglyLinkedListRoughPractice(1);
//        SinglyLinkedListRoughPractice node2 = new SinglyLinkedListRoughPractice(4);
//        SinglyLinkedListRoughPractice node3 = new SinglyLinkedListRoughPractice(6);
//        SinglyLinkedListRoughPractice node4 = new SinglyLinkedListRoughPractice(2);
//
//        SinglyLinkedListRoughPractice head2 = new SinglyLinkedListRoughPractice(1);
//        SinglyLinkedListRoughPractice node6 = new SinglyLinkedListRoughPractice(4);
//        SinglyLinkedListRoughPractice node7 = new SinglyLinkedListRoughPractice(6);
//        SinglyLinkedListRoughPractice node8 = new SinglyLinkedListRoughPractice(2);
//
//        head1.next = node1;
//        node1.next = node2;
//        node2.next = node3;
//        node3.next = node4;
//
//
//        head2.next = node6;
//        node6.next = node7;
//        node7.next = node8;
//        node8.next = node2;

        //SinglyLinkedListRoughPractice singlyLinkedListRoughPractice = sortZeroOneAndTwo(head);
        // print(singlyLinkedListRoughPractice);
        //check(head);

        //  SinglyLinkedListRoughPractice singlyLinkedListRoughPractice = removeNthNodeFromEnd(head, 4);
        // print(singlyLinkedListRoughPractice);
        //SinglyLinkedListRoughPractice reverse = reverse(head);
        //print(reverse);
        // System.out.println(isPalindrome(head));
        //print(addOneToTheLinkedList(head));
        //print(findIntersectionPoint(head1, head2));
        SinglyLinkedListRoughPractice head1 = new SinglyLinkedListRoughPractice(1);
        SinglyLinkedListRoughPractice node1 = new SinglyLinkedListRoughPractice(2);
        SinglyLinkedListRoughPractice node2 = new SinglyLinkedListRoughPractice(3);
        // SinglyLinkedListRoughPractice node3 = new SinglyLinkedListRoughPractice(6);
        // SinglyLinkedListRoughPractice node4 = new SinglyLinkedListRoughPractice(2);
        head1.next = node1;
        node1.next = node2;
        // node2.next = node3;
        // node3.next = node4;
        //node4.next = node2;
        // System.out.println(detectALoop(head1));
        //System.out.println(detectALoopEfficientApproach(head1));
        print(rotateTheLinkedListByKTimes(head1, 2));
    }
}

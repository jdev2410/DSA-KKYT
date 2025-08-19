package com.dsa.learning.linkedList.practiceLinkedList;

import com.dsa.learning.linkedList.SinglyLinkedListRoughPractice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;

class Node {
    public int data;
    public Node next;

    Node(int data, Node next) {
        this.data = data;
        this.next = next;

    }
}

public class LLNode {

    private static void print(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    private static Node convertArrayIntoLinkedList(int[] arr) {
        Node head = new Node(arr[0], null);
        Node mover = head;
        for (int i = 1; i < arr.length; i++) {
            Node temp = new Node(arr[i], null);
            mover.next = temp;
            mover = temp;
        }
        return head;
    }

    private static Node deleteTheHeadOfLL(Node head) {
        Node temp = head;
        head = head.next;
        return head;
    }

    private static Node deleteTheTailElement(Node head) {
        if (head == null || head.next == null) {
            return null;
        }
        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
        return head;
    }

    private static Node deleteKElement(Node head, int k) {
        Node temp = head;
        Node prev = null;
        int count = 0;
        if (1 == k) {
            head = head.next;
            return head;
        }
        while (temp != null) {
            count++;
            if (count == k) {
                prev.next = prev.next.next;
                break;
            }
            prev = temp;
            temp = temp.next;
        }
        return head;
    }

    private static Node insertNodeAtFirst(Node head) {
        Node newNode = new Node(0, head);
        return newNode;
    }

    private static Node insertNodeAtLast(Node head, int n) {
        if (head == null)
            return new Node(n, null);
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = new Node(n, null);
        return head;
    }

    private static Node insertAtGivenKthElement(Node head, int k, int n) {
        if (k == 1) {
            return new Node(n, head);
        }
        int count = 0;
        Node prev = null;
        Node temp = head;
        while (count <= k) {
            count++;
            if (count == k) {
                Node newNode = new Node(n, null);
                prev.next = newNode;
                newNode.next = temp;
                return head;
            }
            prev = temp;
            temp = temp.next;
        }

        return temp;
    }

    private static Node addTwoLinkedList(Node head1, Node head2) {
        Node temp1 = head1;
        Node temp2 = head2;
        int carry = 0;
        Node headSum = new Node(-1, null);
        Node tempSum = headSum;
        while (temp1 != null || temp2 != null) {
            int val1 = (temp1 != null) ? temp1.data : 0;
            int val2 = (temp2 != null) ? temp2.data : 0;
            int sum = val1 + val2 + carry;
            carry = sum / 10;
            Node node = new Node(sum % 10, null);
            tempSum.next = node;
            tempSum = node;
            if (temp1 != null) temp1 = temp1.next;
            if (temp2 != null) temp2 = temp2.next;
        }
        if (carry > 0) {
            tempSum.next = new Node(carry, null);
        }
        return headSum.next;
    }

    private static List<Integer> evenOddLL(Node head) {
        Node temp = head;
        List<Integer> list = new ArrayList<>();
        while (temp != null && temp.next != null) {
            list.add(temp.data);
            temp = temp.next.next;
        }
        if (temp != null)
            list.add(temp.data);

        temp = head.next;
        while (temp != null && temp.next != null) {
            list.add(temp.data);
            temp = temp.next.next;
        }
        if (temp != null)
            list.add(temp.data);

        return list;
    }

    private static Node evenOddLLEfficient(Node head) {
        Node odd = head;
        Node even = head.next;
        Node evenHead = head.next;
        while (even != null && even.next != null) {
            odd.next = odd.next.next;
            even.next = even.next.next;
            odd = odd.next;
            even = even.next;
        }
        odd.next = evenHead;
        return head;
    }

    private static Node sortLLZeroOneTwo(Node head) {
        Node temp = head;
        int zero = 0;
        int one = 0;
        int two = 0;
        while (temp != null) {
            if (temp.data == 0)
                zero++;
            else if (temp.data == 1)
                one++;
            else
                two++;
            temp = temp.next;
        }
        temp = head;
        int sum = zero + one + two;
        for (int i = 0; i < sum; i++) {
            if (zero != 0) {
                temp.data = 0;
                zero--;
            } else if (one != 0) {
                temp.data = 1;
                one--;
            } else {
                temp.data = 2;
                two--;
            }
            temp = temp.next;
        }
        return head;
    }

    private static Node sortZeroOneTwoBetterApproach(Node head) {
        Node zeroHead = new Node(-1, null);
        Node oneHead = new Node(-1, null);
        Node twoHead = new Node(-1, null);
        Node zero = zeroHead;
        Node one = oneHead;
        Node two = twoHead;
        Node temp = head;
        while (temp != null) {
            if (temp.data == 0) {
                zero.next = temp;
                zero = temp;
            } else if (temp.data == 1) {
                one.next = temp;
                one = temp;
            } else {
                two.next = temp;
                two = temp;
            }
            temp = temp.next;
        }
        zero.next = oneHead.next != null ? oneHead.next : twoHead.next;
        one.next = twoHead.next;
        two.next = null;
        return zeroHead.next;
    }

    private static Node deleteKthNodeFromTheEnd(Node head, int k) {
        // Assuming k will never exceed length of LL.
        Node temp = head;
        int count = 0;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        if (k == count) {
            return head.next;
        }
        int endLoop = count - k;
        temp = head;
        for (int i = 0; i < endLoop - 1; i++) {
            temp = temp.next;
        }
        temp.next = temp.next.next;
        return head;
    }

    private static Node deleteKthNodeFromTheEndBetter(Node head, int k) {
        Node fast = head;
        Node slow = head;
        if (head == null || head.next == null)
            return null;
        for (int i = 0; i < k; i++) {
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

    private static boolean isPalindrome(Node head) {
        Node temp = head;
        Stack<Integer> stack = new Stack<>();
        while (temp != null) {
            stack.push(temp.data);
            temp = temp.next;
        }
        temp = head;
        while (temp != null) {
            if (stack.pop().intValue() != temp.data)
                return false;
            temp = temp.next;
        }
        return true;
    }

    private static boolean isPalindromeBetter(Node head) {
        Node fast = head;
        Node slow = head;
        while (fast.next != null && fast.next.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        Node reverseHead = reverse(slow.next);
        Node temp1 = reverseHead;
        slow = head;
        while (temp1 != null) {
            if (slow.data != temp1.data)
                return false;
            temp1 = temp1.next;
            slow = slow.next;
        }
        return true;
    }

    private static Node reverse(Node head) {
        if (head == null) {
            return null;
        }
        Node curr = head;
        Node prev = null;
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }


    private static Node addOne(Node head) {
        //TC- 3N
        //SC-1
        Node temp = head;
        Node reverseHead = reverse(temp);
        int carry = 1;
        Node tempReverseHead = reverseHead;
        while (tempReverseHead != null) {
            tempReverseHead.data = tempReverseHead.data + carry;
            if (tempReverseHead.data < 10) {
                carry = 0;
                break;
            } else {
                tempReverseHead.data = 0;
                carry = 1;
            }
            tempReverseHead = tempReverseHead.next;
        }
        if (carry == 1) {
            return new Node(1, reverse(reverseHead));
        }
        return reverse(reverseHead);
    }

    private static Node addOneOptimize(Node head) {
        Node temp = head;
        int carry = 1;
        carry = addOneHelper(temp);
        if (carry == 1) {
            return new Node(1, head);
        }
        return head;
    }

    private static int addOneHelper(Node temp) {
        if (temp == null)
            return 1;
        int carry = addOneHelper(temp.next);
        temp.data = temp.data + carry;
        if (temp.data < 10)
            return 0;
        temp.data = 0;
        return 1;
    }

    private static Node findIntersection(Node head1, Node head2) {
        Node temp1 = head1;
        Node temp2 = head2;
        Map<Node, Integer> map = new HashMap<>();
        while (temp1 != null) {
            map.put(temp1, 1);
            temp1 = temp1.next;
        }
        while (temp2 != null) {
            if (map.containsKey(temp2)) {
                return temp2;
            }
            temp2 = temp2.next;
        }
        return null;
    }

//    private static Node findIntersectionBetter(Node head1, Node head2) {
//        Node temp1 = head1;
//        Node temp2 = head2;
//        int count1 = 0;
//        int count2 = 0;
//        while (temp1 != null) {
//            count1++;
//            temp1 = temp1.next;
//        }
//        while (temp2 != null) {
//            count2++;
//            temp2 = temp2.next;
//        }
//        int diff = 0;
//        temp1 = head1;
//        temp2 = head2;
//        if (count1 > count2) {
//            diff = count1 - count2;
//            Node newNode = getShiftedNode(temp1, diff);
//            while (newNode != null) {
//                if (newNode.data == temp2.data)
//                    return temp2;
//                temp2 = temp2.next;
//                newNode = newNode.next;
//            }
//        } else if (count2 > count1) {
//            diff = count2 - count1;
//            Node newNode = getShiftedNode(temp2, diff);
//            while (newNode != null) {
//                if (newNode.data == temp1.data)
//                    return temp1;
//                temp1 = temp1.next;
//                newNode = newNode.next;
//            }
//        }
//        while (temp1 != null) {
//            if (temp1.data == temp2.data)
//                return temp1;
//            temp1 = temp1.next;
//            temp2 = temp2.next;
//        }
//        return null;
//    }
//
//    private static Node getShiftedNode(Node head, int diff) {
//        Node temp = head;
//        for (int i = 0; i < diff; i++) {
//            temp = temp.next;
//        }
//        return temp;
//    }

    private static int findMiddle(Node head) {
        Node temp = head;
        Node slow = temp;
        Node fast = temp;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow.data;
    }

    private static Node deleteMiddleElement(Node head) {
        Node temp = head;
        Node slow = temp;
        Node fast = temp;
        Node prev = new Node(-1, head);
        Node tempPrev = prev;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            tempPrev = slow;
            slow = slow.next;
        }
        tempPrev.next = slow.next;
        return prev.next;
    }

    private static void findAllPairsWithGivenSum(Node head, int target) {
        Node temp1 = head;
        Node temp2 = head;
        while (temp1 != null) {
            temp2 = temp1.next;
            while (temp2 != null) {
                if (temp1.data + temp2.data == target)
                    System.out.println(temp1.data + "," + temp2.data);
                else if (temp1.data + temp2.data > target) {
                    break;
                }
                temp2 = temp2.next;
            }
            temp1 = temp1.next;
        }
    }

    private static Node reverseNodeInKGroup(Node head, int k) {
        if (head == null || head.next == null)
            return head;
        Node temp = head;
        Node preserv = null;
        while (temp != null) {
            Node kthNode = getKthNode(temp, k);
            if (kthNode == null) {
                if (preserv != null)
                    preserv.next = null;
                break;
            }

            Node nextNode = kthNode.next;
            kthNode.next = null;
            Node reverse = reverse(temp);
            if (temp == head) {
                head = kthNode;
            } else {
                preserv.next = kthNode;
            }
            preserv = temp;
            temp = nextNode;
        }

        return head;
    }

    private static Node getKthNode(Node temp, int k) {
        k -= 1;
        while (temp != null && k > 0) {
            k--;
            temp = temp.next;
        }
        return temp;
    }

    private static Node rotateByKTimes(Node head, int k) {
        Node tail = head;
        int length = 1;
        while (tail.next != null) {
            length++;
            tail = tail.next;
        }
        if (k % length == 0)
            return head;
        k = k % length;
        tail.next = head;
        Node kthNode = getKthNode(head, length - k);
        head = kthNode.next;
        kthNode.next = null;
        return head;
    }

    private static Node mergeTwoSortedList(Node head1, Node head2) {
        List<Integer> list = addTwoSortedLL(head1, head2);
        List<Integer> sortedList = list.stream().sorted().toList();
        int[] array = sortedList.stream().mapToInt(Integer::intValue).toArray();
       return convertArrayIntoLinkedList(array);
    }

    private static List<Integer> addTwoSortedLL(Node head1, Node head2) {
        List<Integer> list = new ArrayList<>();
        while (head1 != null) {
            list.add(head1.data);
            head1 = head1.next;
        }
        while (head2 != null) {
            list.add(head2.data);
            head2 = head2.next;
        }
        return list;
    }

    public static void main(String[] args) {
        int[] arr = {9};
        int[] arr1 = {1, 3};
        int[] evenOddArray = {1, 2, 3};
        int[] zeroOneTwoArr = {1, 2, 0, 0, 1, 2, 1, 0};
        int[] deletKthEle = {1, 2, 3, 4, 5};
        int[] palindromeArr = {1};
        Node node = convertArrayIntoLinkedList(arr);
        Node node1 = convertArrayIntoLinkedList(arr1);
        Node evenOddNode = convertArrayIntoLinkedList(evenOddArray);
        Node zeroOneTwo = convertArrayIntoLinkedList(zeroOneTwoArr);
        Node deleteKthElement = convertArrayIntoLinkedList(deletKthEle);
        Node palindromeNode = convertArrayIntoLinkedList(palindromeArr);
        //print(node);
        //print(deleteTheHeadOfLL(node));
        //print(deleteTheTailElement(node));
        //print(deleteKElement(node, 4));
        //print(insertNodeAtFirst(node));
        // print(insertNodeAtLast(node, 3));
        //print(insertAtGivenKthElement(node, 3, 2));
        // print(addTwoLinkedList(node, node1));
        //System.out.println(evenOddLL(evenOddNode));
        //print(evenOddLLEfficient(evenOddNode));
        //print(sortLLZeroOneTwo(zeroOneTwo));
        //print(sortZeroOneTwoBetterApproach(zeroOneTwo));
        //print(deleteKthNodeFromTheEnd(zeroOneTwo, 8));
        //print(deleteKthNodeFromTheEndBetter(deleteKthElement, 2));
        //System.out.println(isPalindrome(palindromeNode));
        //System.out.println(isPalindromeBetter(palindromeNode));
        int[] addOne = {1, 6, 9};
        //Node addOneNode = convertArrayIntoLinkedList(addOne);
        //print(addOne(addOneNode));
        // print(addOneOptimize(addOneNode));
        int[] intersection1 = {1, 2, 9};
        int[] intersection2 = {1, 2, 3, 12, 5, 6, 7};
        Node intersectionLL1 = convertArrayIntoLinkedList(intersection1);
        Node intersectionLL2 = convertArrayIntoLinkedList(intersection2);
        Node temp1 = intersectionLL1;
        Node temp2 = intersectionLL2;
        while (temp1 != null) {
            temp2 = temp2.next;
            if (temp1.next == null) {
                temp1.next = temp2;
                break;
            }
            temp1 = temp1.next;
        }
        //print(findIntersection(intersectionLL1, intersectionLL2));
        //print(findIntersectionBetter(intersectionLL1, intersectionLL2));
        int[] arr11 = {1, 3, 4};
        int[] arr13 = {1, 2, 4, 5};
        Node node11 = convertArrayIntoLinkedList(arr11);
        Node node13 = convertArrayIntoLinkedList(arr13);
        //System.out.println(findMiddle(node11));
        //print(deleteMiddleElement(node11));
        //findAllPairsWithGivenSum(node11, 8);
        //print(reverseNodeInKGroup(node11, 3));
        //print(rotateByKTimes(node11, 2));
        print(mergeTwoSortedList(node11,node13 ));
    }

}

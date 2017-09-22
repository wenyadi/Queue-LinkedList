//Assumption: Reorder the given singly-linked list N1 -> N2 -> N3 -> N4 -> … -> Nn -> null to be
//N1- > Nn -> N2 -> Nn-1 -> N3 -> Nn-2 -> … -> null
public class ReOrderLinkedList {
  public ListNode reorder(ListNode head) {
    // Write your solution here.
    if(head==null||head.next == null) {
      return head;
    }
    ListNode mid = middleNode(head);
    ListNode one = head;
    ListNode two = mid.next;
    mid.next = null;
    return merge(one, reverseLinkedList(two));
    
  }
  public ListNode middleNode(ListNode head) {
    ListNode fast = head;
    ListNode slow = head;
    while(fast.next != null && fast.next.next != null) {
      slow = slow.next;
      fast = fast.next.next;
    }
    return slow;
  }
  
  public ListNode reverseLinkedList(ListNode head) {
    if(head == null || head.next == null) {
      return head;
    }
    ListNode pre = null;
    while(head != null) {
      ListNode next = head.next;
      head.next = pre;
      pre = head;
      head = next;
    }
    return pre;
  }
  
  public ListNode merge(ListNode one, ListNode two) {
    ListNode dummy = new ListNode(0);
    ListNode cur = dummy;
    while(one != null && two != null) {
      cur.next = one;
      one = one.next;
      cur.next.next = two;
      two = two.next;
      cur = cur.next.next;
      }
      if(one != null) {
        cur.next = one;
      } else {
        cur.next = two;
      }
      return dummy.next;
  }
}

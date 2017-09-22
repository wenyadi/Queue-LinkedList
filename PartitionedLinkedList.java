//Assumption: L = 2 -> 4 -> 3 -> 5 -> 1 -> null, T = 3, is partitioned to 2 -> 1 -> 4 -> 3 -> 5 -> null

public class PartitionedLinkedList {
  public ListNode partition(ListNode head, int target) {
    if(head == null || head.next == null) {
      return head;
    }
    // write your solution here
    ListNode dummySmall = new ListNode(0);
    ListNode dummyLarge = new ListNode(0);
    ListNode curSmall = dummySmall;
    ListNode curLarge = dummyLarge;
    while(head != null) {
      if(head.value < target) {
        curSmall.next = head;
        curSmall = curSmall.next;
      } else {
        curLarge.next = head;
        curLarge = curLarge.next;
      }
      head = head.next;
    }
    curSmall.next = dummyLarge.next;
    curLarge.next = null;
    return dummySmall.next;
  }
}

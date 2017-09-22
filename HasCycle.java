public class HasCycle {
  public boolean hasCycle(ListNode head) {
    // write your solution here
    ListNode fast = head;
    ListNode slow = head;
    if(head == null||head.next == null) {
      return false;
    }
    while(fast != null && fast.next != null) {
      slow = slow.next;
      fast = fast.next.next;
      if(slow == fast) {
        return true;
      }
    }
    return false;
  }
}

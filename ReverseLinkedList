/**
 * class ListNode {
 *   public int value;
 *   public ListNode next;
 *   public ListNode(int value) {
 *     this.value = value;
 *     next = null;
 *   }
 * }
 */
public class ReverseLinkedList {
  public ListNode reverse(ListNode head) {
    // write your solution here
    if(head == null || head.next == null) {
      return head;
    }
  //   ListNode cur = head;
  //   ListNode pre = null;
  //   ListNode next = null;
    
  //   while(cur != null) {
  //     next = cur.next;
  //     cur.next = pre;
  //     pre = cur;
  //     cur = next;
  //   }
  //   return pre;
  // }
    ListNode nextNode = head.next;
    ListNode newHead = reverse(nextNode);
    nextNode.next = head;
    head.next = null;
    return newHead;
  }
}

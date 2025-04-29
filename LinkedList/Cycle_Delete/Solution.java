// /*
//  Detect Only Cycle
//  */
// public class Solution {
//     public boolean hasCycle(ListNode head) {
//         ListNode slow = head;
//         ListNode fast = head;

//         while(fast != null && fast.next != null){
//             slow = slow.next;
//             fast = fast.next.next;

//             if(slow == fast){
//                 return true;
//             }
//         }
//         return false;
        
//     }
// }






///////DELETE THE CYCLE

public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode slow = head, fast = head;
        int index = 0;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                slow = head;
                while (slow != fast) {
                    slow = slow.next;
                    fast = fast.next;
                    index++;
                }
                System.out.print("tail connects to node index " + index);
                return slow;
            }
        }
        return null;
    }
}

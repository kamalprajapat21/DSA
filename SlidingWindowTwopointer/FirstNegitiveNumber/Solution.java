import java.util.*;

class Solution {
    static List<Integer> firstNegInt(int arr[], int k) {
        Queue<Integer> queue = new LinkedList<>();
        ArrayList<Integer> res = new ArrayList<>();
        
        // Process the first window
        for (int i = 0; i < k; i++) {
            if (arr[i] < 0) {
                queue.offer(arr[i]);
            }
        }
        res.add(queue.isEmpty() ? 0 : queue.peek());

        // Process the rest of the windows
        for (int i = 1; i <= arr.length - k; i++) {
            // Remove the element going out of the window
            if (!queue.isEmpty() && queue.peek() == arr[i - 1]) {
                queue.poll();
            }

            // Add the new element coming into the window
            if (arr[i + k - 1] < 0) {
                queue.offer(arr[i + k - 1]);
            }

            res.add(queue.isEmpty() ? 0 : queue.peek());
        }

        return res;
    }
}
import java.io.*;
import java.util.*;

class greatestelement {
    public static int[] input(BufferedReader br, int n) throws IOException {
        String[] s = br.readLine().trim().split(" ");
        int[] a = new int[n];
        for (int i = 0; i < n; i++) a[i] = Integer.parseInt(s[i]);

        return a;
    }

    public static void print(int[] a) {
        for (int e : a) System.out.print(e + " ");
        System.out.println();
    }

    public static void print(ArrayList<Integer> a) {
        for (int e : a) System.out.print(e + " ");
        System.out.println();
    }
}

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine()); // Number of test cases
        while (t-- > 0) {
            // Read input array as space-separated integers
            String input = br.readLine();
            String[] inputs = input.split(" ");
            int[] arr = new int[inputs.length];

            for (int i = 0; i < inputs.length; i++) {
                arr[i] = Integer.parseInt(inputs[i]);
            }
            Solution obj = new Solution();
            int res = obj.largest(arr, 0); // Pass array and starting index 0

            System.out.println(res);
            System.out.println("~");
        }
    }
}

// Solution Class
class Solution {
    public int largest(int[] arr, int i) {
        // Base case: when we reach the last element
        int n = arr.length;
        if (i == n - 1) {
            return arr[i];
        }
        // Recursive call
        int max = largest(arr, i + 1);
        // Compare current element with the maximum of the remaining elements
        return Math.max(arr[i], max);
    }
}

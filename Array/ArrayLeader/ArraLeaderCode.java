/*https://chatgpt.com/c/67b17583-d538-8000-a5ae-ac8a37998b59 */


import java.util.ArrayList;

public class ArraLeaderCode {
    static ArrayList<Integer> leaders(int arr[]) {
        ArrayList<Integer> result = new ArrayList<>();
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            boolean isLeader = true;
            for (int j = i + 1; j < n; j++) {
                if (arr[i] < arr[j]) {
                    isLeader = false;
                    break;
                }
            }
            if (isLeader) {
                result.add(arr[i]);
            }
        }
        return result;
    }
    public static void main(String args []){
        int arr[] = {16, 17, 4, 3, 5, 2};
       System.out.println( leaders(arr));
    }
}

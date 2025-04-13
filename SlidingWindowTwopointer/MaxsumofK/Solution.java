public int maximumSumSubarray(int[] arr, int k) {
    int sum = 0;

    // Initial window sum
    for (int i = 0; i < k; i++) {
        sum += arr[i];
    }

    int maxSum = sum;
    int j = 0;

    // Sliding window
    for (int i = k; i < arr.length; i++) {
        sum += arr[i] - arr[j];
        j++;
        maxSum = Math.max(maxSum, sum);
    }

    return maxSum;
}

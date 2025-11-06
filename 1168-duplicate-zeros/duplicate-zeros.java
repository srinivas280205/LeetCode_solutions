class Solution {
    public void duplicateZeros(int[] arr) {
        int n = arr.length;
        int zeros = 0;

        // Count zeros that will be duplicated
        for (int num : arr) {
            if (num == 0) zeros++;
        }

        int i = n - 1;
        int j = n + zeros - 1; // virtual extended index

        // Work backward from the end
        while (i < j) {
            if (j < n) {
                arr[j] = arr[i]; // Copy if within bounds
            }

            if (arr[i] == 0) {
                j--;
                if (j < n) {
                    arr[j] = 0; // Duplicate zero
                }
            }

            i--;
            j--;
        }
    }
}

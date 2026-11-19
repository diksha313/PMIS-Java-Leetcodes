class Solution {
    public void duplicateZeros(int[] arr) {

        int possiblezero = 0;
        int lastdnx = arr.length - 1;

        // Step 1: Count zeros that can be duplicated
        for (int i = 0; i <= lastdnx - possiblezero; i++) {

            if (arr[i] == 0) {

                if (i == lastdnx - possiblezero) {
                    arr[lastdnx] = 0;
                    lastdnx--;
                    break;
                }

                possiblezero++;
            }
        }

        // Step 2: Traverse backwards and shift elements
        int lastindex = lastdnx - possiblezero;

        for (int j = lastindex; j >= 0; j--) {

            if (arr[j] == 0) {
                arr[j + possiblezero] = 0;
                possiblezero--;
                arr[j + possiblezero] = 0;
            } else {
                arr[j + possiblezero] = arr[j];
            }
        }
    }
}
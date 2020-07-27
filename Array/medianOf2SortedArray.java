/**
 * medianOf2SortedArray
 */
public class medianOf2SortedArray {

    // median -odd = (n+1)/2
    // even = (n/2 + n/2+1)

    public static void main(String[] args) {
        int[] arr1 = { 1, 2 };
        int[] arr2 = { 3, 4 };
        float median = 0;

        int[] merged = combine2SortedArrays(arr1, arr2);

        if (merged.length % 2 == 0) {
            median = (merged[merged.length / 2 - 1] + merged[(merged.length / 2) + 1 - 1]) / 2f;
        }

        // as array starts with 0 thats why we have to substract one
        else {
            median = merged[(merged.length + 1) / 2 - 1];
        }

        System.out.println(median);

    }

    public static int[] combine2SortedArrays(int[] arr1, int[] arr2) {

        int[] merged = new int[arr1.length + arr2.length];
        int i = 0, j = 0, k = 0;

        while (i < arr1.length && j < arr2.length) {

            if (arr1[i] < arr2[j]) {
                merged[k] = arr1[i];
                i++;
                k++;
            }

            else {
                merged[k] = arr2[j];
                j++;
                k++;
            }

            if (i == arr1.length) {
                while (j < arr2.length) {
                    merged[k] = arr2[j];
                    j++;
                    k++;
                }
            }

            if (j == arr2.length) {
                while (i < arr1.length) {
                    merged[k] = arr1[i];
                    i++;
                    k++;
                }
            }
        }

        return merged;

    }
}
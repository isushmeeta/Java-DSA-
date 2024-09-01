//Given a sorted array 
//of positive integers, rearrange the array alternately
// i.e first element should be a maximum value, at second position minimum value, 
//at third position second max, at fourth position second min, and so on.

public class MinMaxRearrange {
    // Function to rearrange the array elements alternately
    static void rearrange(long[] arr, int n) {
        // Initialize indexes of the smallest and largest elements
        int small = 0, large = n - 1;

        // Maximum element value + 1 to ensure all elements in array are handled
        long maxElem = arr[large] + 1;

        // Traverse the array
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                // Even index: place the maximum element at the current position
                arr[i] += (arr[large--] % maxElem) * maxElem;
            } else {
                // Odd index: place the minimum element at the current position
                arr[i] += (arr[small++] % maxElem) * maxElem;
            }
        }

        // Divide all elements by maxElem to get the rearranged array
        for (int i = 0; i < n; i++) {
            arr[i] /= maxElem;
        }
    }

    // Driver code
    public static void main(String[] args) {
        long[] arr = { 1, 2, 3, 4, 5, 6 };
        int n = arr.length;

        System.out.println("Original Array");
        for (long num : arr)
            System.out.print(num + " ");
      
        rearrange(arr, n);

        System.out.println("\nModified Array");
        for (long num : arr)
            System.out.print(num + " ");
    }
}


public class binarySearch {

    public static int binarySearch(int arr[], int x) {
        int low = 0, high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;

            // Check if x is present at mid
            if (arr[mid] == x) {
                return mid;
            }

            // If x is greater, ignore the left half
            if (arr[mid] < x) {
                low = mid + 1;
            }
            // If x is smaller, ignore the right half
            else {
                high = mid - 1;
            }
        }
        // If x is not present in array
        return -1;
    }

    public static void main(String args[]) {
        int arr[] = {2, 3, 4, 10, 40};
        int x = 10;

        int result = binarySearch(arr, x);

        if (result == -1) {
            System.out.println("Element is not present in array");
        } else {
            System.out.println("Element is present at index " + result);
        }
    }
}

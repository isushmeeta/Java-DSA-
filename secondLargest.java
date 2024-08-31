import java.util.Arrays;

class SecondLargest {

    // Function to find and print the second largest element
    static void print2ndLargest(int[] arr) {
        int n = arr.length;

        // There should be at least two elements
        if (n < 2) {
            System.out.println("Invalid Input: Array should have at least two elements.");
            return;
        }

        // Initialize the largest and second largest
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        // Traverse the array
        for (int i = 0; i < n; i++) {
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            } else if (arr[i] > secondLargest && arr[i] != largest) {
                secondLargest = arr[i];
            }
        }

        // If second largest is still MIN_VALUE, there is no second largest element
        if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("There is no second largest element.");
        } else {
            System.out.println("The second largest element is: " + secondLargest);
        }
    }

    // Driver code
    public static void main(String[] args) {
        int[] arr = {12, 35, 1, 10, 34, 1};
        print2ndLargest(arr);
    }
}


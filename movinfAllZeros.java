import java.util.Arrays;

public class movinfAllZeros{

    // Function to move all zeros to the end of the array
    public static void zeros(int arr[]){
        int j=0;// index to track non-zero elements
        int n=arr.length;
        // Traverse the array and move non-zero elements to the front
        for (int i=0;i<arr.length;i++){
            if (arr[i]!=0){
                arr[j++]=arr[i];

            }
        }
        // Fill the remaining positions with zeros
        while(j<n){
            arr[j++]=0;
        }
    }
    public static void main(String args[]){
        int arr[]={1, 2, 0, 0, 0, 3, 6};
        int n=arr.length;
        zeros(arr);
        // Print the array after moving zeros
        System.out.println(Arrays.toString(arr));

    }
    
}

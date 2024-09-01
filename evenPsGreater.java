//Time complexity O(N) linear time
//Space Complexity O(1) constant space

public class evenPsGreater {
    public static void rearrange (int []arr){
        int N=arr.length;
        for(int i=1;i<N;i++){
            //Check if the index is even (0-based) or odd (0-based)
            if (((i % 2 == 0) && (arr[i] > arr[i - 1])) || 
                ((i % 2 != 0) && (arr[i] < arr[i - 1]))) {
                    // // Swap elements if they are not in the desired order
                    int temp =arr[i];
                    arr[i]=arr[i-1];
                    arr[i-1]=temp;
            }
            
        }
    }

    public static void main(String args[]){
        int arr[]={8,5,3,9};
        rearrange(arr);
        //out the rearranged array
        for(int i:arr){
            System.out.print(i+" ");
        }
        System.out.println();
    }
    
}
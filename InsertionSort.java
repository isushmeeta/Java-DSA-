//time complexcity O(n^2)
public class InsertionSort {
    public static void printArray(int arr[]){
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

    }

    public static void main(String arg[]){
        int arr[]={7,8,3,1,2};


        //insertion sort
        for(int i=0;i<arr.length;i++){//unsorted array te loop run
            int current=arr[i];
            int j=i-1;//sorted part er last index
            while(j>=0 && current< arr[j]){//sorted part traverse
                arr[j+1]=arr[j];
                j--;
            }

            //placement
            arr[j+1]=current;

        }

        printArray(arr);
    }

    
}

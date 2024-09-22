//Time Complexcity is O(n^2) not good

public class BubbleSort {
    public static void printArray(int arr[]){
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

    }
    public static void main(String args[]){
        int arr[]={7,8,3,1,2};
        //bubble sort
        for (int i=0;i<arr.length-1;i++){//n-1 times the loop will run
            for (int j=0;j<arr.length-i-1;j++){//as the largest element is already sorted everytime thats why array length -i then -1 ,
                if(arr[j]>arr[j+1]){//index is defined by j not i
                    //swap
                    int temp=arr[j]; 
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;


                }

            }
        }
        printArray(arr);
    }
    
}

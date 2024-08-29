//Time Complexcity is O(n^2) as there are two nexted loops
//works well with small datasets
//In place algorithm as it doesnt require extra space

public class SelectionSort {
    public static void printArray(int arr2[]){
        for (int i=0;i<arr2.length;i++){
            System.out.print(arr2[i]+" ");
        }
        System.out.println();
    }

    public static void main(String arr[]){
        int arr2[]={8,12,15,9,4,1};
        //Selection Sort
        for (int i=0;i<arr.length-1;i++){
            for (int j=i+1;j<arr2.length;j++){
                if (arr2[j]<arr2[i]){
                    int temp= arr2[i];
                    arr2[j]= arr2[j+1];
                    arr2[j]= temp;
                }
            }
        }
    printArray(arr2);


            
    }
    
}

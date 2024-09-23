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

    public static void main(String args[]){
        int arr2[]={8,12,15,9,4,1};
        //Selection Sort
        for (int i=0;i<arr2.length-1;i++){
            int smallest=i;

            for (int j=i+1;j<arr2.length;j++){//here as the last element isnt sorted so we will take the array length
                if (arr2[j]<arr2[smallest]){//  if smallest is greater than jth element then sammlest will be j
                    smallest=j;
                }   
            }
            int temp= arr2[smallest];
            arr2[smallest]= arr2[i];
            arr2[i]= temp;
        }
        printArray(arr2);
            
    }
    
}

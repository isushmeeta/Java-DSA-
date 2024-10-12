//two sum, closest two sum, three sum O(n)
public class twoPointers {

    public static boolean twosum(int [] arr,int target){
        int n=arr.length;

        for (int i=0;i<n;i++){
            for (int j=i+1;j<n;j++){
                if (arr[i]+arr[j]==target){
                    return true;
                }
            }
        }
    
    return false;
    }

    public static void main(String args[]){
        int arr[]={10,20,35,50};
        int target=70;

        if(twosum(arr,target)){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }

    }
    
}

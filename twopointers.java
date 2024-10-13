public class twopointers {

    public static boolean twoSum(int arr[],int target){
        
            int left=0, right=arr.length-1;
            while(left<right){
                int sum=arr[left]+arr[right];
                if(sum==target){
                    return true;
                }
                else if (sum<target){
                    left++;

                }
                else right--;
            }
            return false;

    }
    public static void main(String args[]){

        int arr[]={10,20,35,50};
        int target=70;

        if (twoSum(arr,target)){
            System.out.println("true");

        }
        else{
            System.out.println("false");
        }

    }
    
}

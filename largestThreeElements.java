public class largestThreeElements {


    public static void largestelems(int[]arr){
        for (int i=0; i<arr.length; i++){
            if (arr[i]> arr [i+i]){
                System.out.println(arr[i]);

            }else{
                System.out.println("No large Number");

            }
        }
    }


    public static void main(String args){
        int [] arr= {10,4,3,50,90};
        largestelems(arr);
    }

}













   
    


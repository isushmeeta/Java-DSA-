public class largestThreeElements {


    public static void largestelems(int[]arr){
        int first, second, third;
        if (arr.length<3){
            System.out.print("Invalid Input");
        }
        third=first=second=Integer.MIN_VALUE;

        for (int i=0; i<arr.length; i++){
            if (arr[i]> first){
                third=second;
                second=first;
                first=arr[i];

            }else if(arr[i]>second){
                third=second;
                second=arr[i];
            }else if(arr[i]>third){
                third=arr[i];
            }

        
        }
        System.out.println(first +" " + second +" "+third);
    }


    public static void main(String args){
        int [] arr= {10,4,3,50,90};
        largestelems(arr);
    }

}













   
    


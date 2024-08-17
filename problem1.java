// Take an array as input from the user.Search for a given number x 
//and print the index at which it occurs.
//linear Search Algo

import java.util.*;

public class problem1 {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int size=sc.nextInt();//array Size numbers.length
        int numbers[]=new int[size];//array
        //input
        for(int i=0;i<size;i++){
            numbers[i]=sc.nextInt();
        }

        int x=sc.nextInt();
        
        //output
        for(int i=0;i<numbers.length;i++){
            if (numbers[i]==x){
                System.out.println("x found at "+i);

            }
            
        }sc.close();


    }
    
}

import java.util.*;

public class bitmanipulation {
    public static void main(String args[]){
        //Get Bit
        int n=5;//0101
        int pos=2;
        int bitmask=1<<pos;//0100

        if((bitmask & n)==0){
            System.out.println("Bit was zero");
        }else{
            System.out.println("Bit was  1");
        }

        //set bit
        int m=5;
        int posi=1;
        int bitmask1=1<<pos;

        int newNumber= bitmask1 |n;
        System.out.println(newNumber);

        //clear bit
        int l=5;
        int position=2;
        int bitmsk=1<<position;
        int notBitmask= ~(bitmsk);
        int newNum= notBitmask & l;
        System.out.println(newNum);

        //update bit
        int p=5;
        int poss=2;
        int oper=1;//update bit to 1
        //set oper=1: clear: oper=0;
        int bitmsk1=1<<poss;
        if (oper==1){
            //set
            

            int newNumb= bitmsk1 |n;
            System.out.println(newNumb);
        }else{
            int newBitmsk=~(bitmsk1);
            int newNumb=newBitmsk&p;
            System.out.println(newNumb);

        }

    }
    
}

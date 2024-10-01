//rules
//Only one disk transfered in 1 step
//smaller disks will always be at top

//time complexicity O(2^n) T(n)=2T(n-1)+1
//space complexicity 

public class towerOfHanoi{

    public static void towerOfhanoi(int n, String src, String helper, String dest){
        if(n==1){
            System.out.println("transfer disk "+ n + " from "+src+" to "+dest);
            return;
        }
        towerOfhanoi(n-1, src, dest, helper);
        System.out.println("transfer disk "+ n + " from "+src+" to "+dest);
        towerOfhanoi(n-1, helper,src,dest);

    }

    public static void main(String args[]){
        int n=4;
        towerOfhanoi(n, "S", "H", "D");

    }
    
}
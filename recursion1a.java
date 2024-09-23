// printing 1 to 5 using recursion

public class recursion1a {

    public static void printNumb(int n){
        if(n==6){//base case
            return;
        }
        System.out.println(n);
        printNumb(n+1);

    }

    public static void main(String args[]){
        int n=1;
        printNumb(n);
    }
    
}
// main function was n=1;
// it called printNumb n=1 
//it calledPrintNumb n=2
// it called printNumb n=3 
//it calledPrintNumb n=4
// it called printNumb n=5 
//it calledPrintNumb n=6

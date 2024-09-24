public class fibonaccitoNthterm {

    public static void printFibonacci(int a, int b, int n){
        if(n==0){//base case
            return;
        }
        int c=a+b;
        System.out.println(c);
        printFibonacci(b, c, n-1);//(1,1,5-1=4) c=2

    }

    public static void main(String args[]){
        int a=0, b=1;
        System.out.println(a);// term 1
        System.out.println(b); //term 2
        int n=7;
        printFibonacci(a, b, n-2); //(0,1,7-2=5)

    }
}

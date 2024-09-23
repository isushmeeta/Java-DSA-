public class recursion1 {

    public static void printNumb(int n){
        if(n==0){//base case
            return;
        }
        System.out.println(n);
        printNumb(n-1);//recursion
    }

    public static void main(String args[]){
        int n=5;
        printNumb(n);//5
    }
}
//memory is used in every step as result it takes memory more.

//print x^n (stack height =n)
public class printXpowerOfN {

    public static int xsqr(int x, int n){
        if (n==0){
            return 1;//base case 1
        }
        if (x==0){
            return 0; //base case 2

        }

        int xpower1=xsqr(x, n-1);// the work
        int xPow=x*xpower1;
        return xPow;

    } 
    public static void main(String args[]){
        int x=2, n=5;
        int ans= xsqr(x, n);
        System.out.println(ans);
    }
}

public class printFactorialOfNum {

    public static int factorialofNum(int n){
        if (n ==1 || n==0){//baseCase
            return 1;
        }

        int fact_num= factorialofNum(n-1);
        int fact_n=n*fact_num;//n(n-1)

        return fact_n;

    }

    public static void main(String args[]){
        int n=5;
        int ans=factorialofNum(n);
        System.out.println(ans);
    }
    
}

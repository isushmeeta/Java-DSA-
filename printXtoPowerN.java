//print x^n (stack height=logn)

public class printXtoPowerN {
    public static int caculatePow(int x, int n){
        if(n==0){
            return 1;
        }
        if(x==0){
            return 0;
        }
        //if n is even
        if(n%2==0){
            return caculatePow(x, n/2)*caculatePow(x, n/2);
        }
        else{//n is odd
            return caculatePow(x, n/2)*caculatePow(x, n/2)* x;
        }

    }

    public static void main(String args[]){
        int x=2, n=5;
        int ans=caculatePow(x,n);
        System.out.println(ans);
    }
    
}

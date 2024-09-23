public class sumOfNaturalNums {

    public static void printSum(int i,int n,int sum){

        if (i==n){
            sum+=i;
            System.out.println(sum);
            return;
        }
        sum+=i;
        printSum(i+1,n,sum);
    }
    public static void main(String args[]){
        printSum(1,5,0);

    }
    
}
//i=1, n=5, s=0
//i=1, n=5, s=1
//i=2, n=5, s=1+2=3
//i=3, n=5, s=3+3=6
//i=4, n=5, s=6+4=10
//i=5, n=5, s=10+5=15

//time complexcity O(n);
public class firstLastOccurence{
    public static int first=-1;
    public static int last=-1;

    public static void function(String str, int idx,char elem){

        if(idx==str.length()){
            System.out.println(first);
            System.out.println(last);
            return;

        }
        char currChar=str.charAt(idx);
        if(currChar==elem){
            if(first==-1){
                first=idx;

            }
            else{
                last=idx;
            }
        }
        function(str, idx+1, elem);

    }

    public static void main(String args[]){
        String str="abbbaaaefah";
        function(str, 0, 'a');

    }
}
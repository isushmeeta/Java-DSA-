//time complexcity O(n+count)=O(2n)=O(n)

public class moveAllxtoEnd {

    public static void MoveAllX(String str,int idx,int count,String newString){
        if(idx==str.length()){
            for(int i=0;i<count;i++){
                newString+='x';
            }
            System.out.println(newString);
        }
        char currchar=str.charAt(idx);
        if(currchar=='x'){
            count++;
            MoveAllX(str, idx+1, count, newString);
        }

        else{
            newString+=currchar;//new string=newstring +currchar
            MoveAllX(str, idx+1, count, newString);
        }

    }

    public static void main(String args[]){
         String str="axbcxxl";
         MoveAllX(str, 0, 0, "");


    }
    
}

import java.util.*;
public class stringsBuilder {
    public static void main(String args[]){
        StringBuilder sb=new StringBuilder("Hello");
        System.out.println(sb);

      

       //char at index 0
        System.out.println(sb.charAt(0));

    //set character at index
        sb.setCharAt(1, 'L');
        System.out.println(sb);
    //INSERT 
        sb.insert(0, 'B');
        System.out.println(sb);
    //Delete
        sb.delete(0, 2);
        System.out.println(sb);
    //append
       sb.append(" ");
       sb.append("W");
       sb.append("o");
       System.out.println(sb);
       System.out.println(sb.length());
    //reverse a string
       for (int i=0; i<sb.length()/2;i++){
        int front=i;
        int back=sb.length()-1-i;//5-1-0
        char frontchar=sb.charAt(front);
        char backchar=sb.charAt(back);
        sb.setCharAt(front, backchar);
        sb.setCharAt(back, frontchar);



       }

     System.out.println(sb);
     
    }
    
}

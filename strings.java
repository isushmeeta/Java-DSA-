import java.util.*;
//Strings are immutable you cant change it once its created

public class strings {
    public static void main(String args[]){
        //String Declaration
        //String name="Hello";
        //String fullname=" His name is Hello";
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your first name:" );
        String firstname=sc.nextLine();

        System.out.println("Enter your Last name:" );
        String lastName=sc.nextLine();
        String fullname=firstname+" "+lastName;
        System.err.println(fullname);
        System.err.println(fullname.length());
        //charAt
        //for (int i=0;i<fullname.length();i++){
         //System.out.println(fullname.charAt(i));
        //Compare
        // s1>s2: will return positve value
        //s1==s2: will return 0
        //s1<s2: will return negative value
        //if(firstname.compareTo(lastName)==0){
            //System.out.println("Strings are equal");
       // }else{
        //    System.out.println("Strings are not equal");
       // }
       //Substring
       String name=fullname.substring(0, 5);
       System.out.println(name);
    //   to comment multiple line ctrl+/



    }
    
}

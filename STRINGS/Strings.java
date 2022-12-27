// import java.util.*;
public class Strings {
    public static void printLetters(String fullname){
        for ( int i=0; i<fullname.length();i++){
            System.out.print(fullname.charAt(i) + " ");
        }
        System.out.println();
    }
    public static void main (String args[]){
    //     //strings are immutable
    //     //we cannot change the string when it is declare
    //     Scanner sc = new Scanner(System.in);
    //     String number;
    //     // sc.next();
    //     number = sc.nextLine();
    //     System.out.println(number);
        //String Calculate karte samay () lagana padta hai length  ke baad q ki string ek function hota hai
        // String fullname = "TONY STARK";
        // System.out.println(fullname.length());
        //concatenation matlab jodna 
        String surname = "Yadav";
        String firstname = "Vishal";
      String fullname = surname +" "+ firstname;
    //   System.out.println(fullname.charAt(7));
    printLetters(fullname);
    }
 
}

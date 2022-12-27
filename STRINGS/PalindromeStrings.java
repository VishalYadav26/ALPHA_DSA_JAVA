public class PalindromeStrings {
    public static boolean isPalindrome(String str){
        for( int i =0; i<str.length()/2;i++){
            int n = str.length();
            if(str.charAt(i)!=str.charAt(n-1-i)) {
                //not a palindrome
                return false;
            }
        }
        return true;
        // System.out.print("String is palindrome");
    }





    public static void main(String args[]){
        String str = "racecar";
        System.out.println(isPalindrome(str));
    }
}

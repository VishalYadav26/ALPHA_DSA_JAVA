public class findPermutations {
//TC => O(n*n!)

    public static void findPermutation(String str, String ans){
        //base case
        if(str.length()==0){
            System.out.println(ans);
            return;
        }
        
        //recursion
        for(int i =0;i<str.length();i++){
            char curr = str.charAt(i);
            //"abcde" if i have to remove c then i will "ab"+"de" = "abde"
            //substring is non inclusive means exclusive therefore substring will contains upto before i
            //no need to give end length in second substring it will directly go till end n 
            String NewStr = str.substring(0,i)+str.substring(i+1);
            findPermutation(NewStr, ans+curr);
        }
    }
    public static void main(String args[]){
        String str = "abc";
        findPermutation(str,"");
    }
}

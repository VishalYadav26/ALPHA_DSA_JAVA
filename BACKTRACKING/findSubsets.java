// package BACKTRACKING;

// package BACKTRACKING;
// import BACKTRACKING.*;
public class findSubsets {
    public static void find_subsets(String str, String ans, int i){
    //base case
    if(i==str.length()){
        if(ans.length()==0){
            System.out.println("null");
        }else{
        System.out.println(ans);
        }
        return;
    }
    //recursion
    //yes choice
    find_subsets(str, ans+str.charAt(i), i+1);
    //no choice
    find_subsets(str, ans, i+1);
    }

    public static void main(String args[]){
        String str = "abc";
        find_subsets(str, "", 0);
    }
}

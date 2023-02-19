// package ARRAYLIST;
import java.util.ArrayList;
//it is something different from pairSum1
//here sorted and rotated list is mentioned
//there is pivot point from where this list is rotated
// We will use Modular % inbuilt method approach to deal with rotated array
public class PairSum2 {
    
    //Brute force
    // public static boolean pairSum1(ArrayList<Integer> list, int target){

    //     for(int i =0;i<list.size();i++){
    //         for(int j =i+1;j<list.size();j++){
    //             if(list.get(i)+list.get(j)==target){
    //                 System.out.println(i);
    //                 System.out.println(j);
    //                 return true;
    //             }
    //         }
    //     }
    //     return false;
    // }
    //2 Pointer  O(n)
    public static boolean pairSum2(ArrayList<Integer> list , int target){
        int breakingpoint =-1;
        int n =list.size();
       for(int i =0;i<list.size();i++){
        if(list.get(i)>list.get(i+1)){//breaking point
            breakingpoint =i;
            break;
        }

       }
       int lp = breakingpoint+1;//smallest
       int rp = breakingpoint;//largest
        while(lp!=rp){
            //case1
            if(list.get(lp)+list.get(rp)==target){
                return true;
            }
            //case2
            if(list.get(lp) + list.get(rp)<target){
                lp = (lp+1)%n;
            }else{
                //case3
                rp = (n+rp-1)%n;
            }
        }
        return false;
    }

    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();
        //11,15,6,8,9,10
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);

        int target = 16;
        System.out.println(pairSum2(list, target));
    }
}


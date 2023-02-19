// package ARRAYLIST;

import java.util.ArrayList;
public class RevOfAL {
    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();
        // ArrayList<String> list2 = new ArrayList<>();
        // ArrayList<Boolean> list3 = new ArrayList<>();
        //Add Element   O(1)
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        // System.out.println(list.size());

        //print Reverse arraylist O(n)
        for(int i=list.size()-1;i>=0;i--){
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
    }
}


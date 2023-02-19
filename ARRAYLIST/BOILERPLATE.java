// package ARRAYLIST;
import java.util.ArrayList;
// Operation on ArrayList
public class BOILERPLATE {
    public static void main(String args[]){
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        ArrayList<Boolean> list3 = new ArrayList<>();
        //Add Element   O(1)
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);

        System.out.println(list1);
             // To add in between //but for this TC is O(n) we require to search position
             list1.add(1,9);
             System.out.println(list1);

        //Get Element   O(1)
        int element = list1.get(2);
        System.out.println(element);

        //Delete    O(n) bcoz we have to search position from start
        list1.remove(2);
        System.out.println(list1);

        //Set
        list1.set(2,10);
        System.out.println(list1);

        //Contains
        System.out.println(list1.contains(1));
        System.out.println(list1.contains(11));
    }
}

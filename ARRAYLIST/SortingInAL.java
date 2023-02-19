// package ARRAYLIST;
import java.util.ArrayList;
import java.util.Collections;
public class SortingInAL {
    



    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(5);
        list.add(9);
        list.add(3);
        list.add(6);
        System.out.println(list);
        Collections.sort(list);//Ascending Order
        System.out.println(list);

        //Descending Order
        Collections.sort(list, Collections.reverseOrder());
        //Collections.reverseOrder() => this is Comparator functions which defines Logic 
        System.out.println(list);
    }
}

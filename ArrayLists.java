import java.util.ArrayList;
import java.util.Collections;

class ArrayLists {
    public static void main(String args[]){
        ArrayList<Integer> list= new ArrayList<Integer>();

        //add element 
        list.add(0);
        list.add(2);
        list.add(3);
        list.add(4);

        System.out.println(list);

        // get elements
        int element = list.get(0);

        System.out.println(element);

        //add el in between 
        list.add(1 ,1);
        System.out.println(list);

        // set element 
        list.set(0 ,5 );
        System.out.println(list);

        // delete element 
        list.remove(4);
        System.err.println(list);

        //list size
        int size = list.size();
        System.err.println(size);

        //loops
        for(int i=0 ; i<list.size(); i++){
            System.out.print(list.get(i));
        }
        System.out.println();
        
        //sorting 
        Collections.sort(list);
        System.out.println(list); 
    }
}
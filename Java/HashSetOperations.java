import java.util.*;
class Hset{
    public static void main(String[] args){
        HashSet<Integer> set = new HashSet<>();

        //ADDING ELEMENTS
        set.add(10) ;
        set.add(20);
        set.add(10); //since this '10' is a duplicate, it won't be inserted into the set.
        set.add(null); //possible only once

        //GETTING THE SIZE
        System.out.println(set.size()); // 3

        //MEMBERSHIP OPERATIONS
        System.out.println(set.contains(20)); //true
        System.out.println(set.contains(50)); //false

        //DELETING ELEMENTS
        set.remove(20); //deletes the element
        set.remove(99); //no error occurs if the element isn't present in the set

        //CHECKING EMPTY
        System.out.println(set.isEmpty()); //false

        //ITERATING THROUGH ELEMENTS
        //STEP - 1 : FOR-EACH LOOP
        for(Integer val : set){
            System.out.println(val);
        }

        //EMPTYING SET
        set.clear();

        //HASHSET -> ARRAYLIST
        ArrayList<Integer> list = new ArrayList<>(set);

        //SET OPERATIONS
        //UNION
        HashSet<Integer> a = new HashSet<>();
        a.add(1); a.add(2);

        HashSet<Integer> b = new HashSet<>();
        b.add(2); b.add(3);

        HashSet<Integer> union = new HashSet<>(a);
        union.addAll(b); // [1,2,3]

        //INTERSECTION
        HashSet<Integer> intersection = new HashSet<>(a);
        intersection.retainAll(b); // [2]

        //SET DIFFERENCE
        HashSet<Integer> difference = new HashSet<>(a);
        difference.removeAll(b); // [1]

        //COMPARING SETS
        System.out.println(a.equals(b)); // true if same elements
    }
}
import java.util.*;
class Alist{
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>(); // Optional to pass size in ()

        //Appending character at the end
        list.add(10);
        list.add(20);
        list.add(30);

        //Inserting at positions
        list.add(1,15);
        //list.add(index_Pos, element to be inserted)

        //Extending two lists
        //list1.addAll(list2);

        //Accessing Elements using index pos
        int x = list.get(0); //returns object specified

        //Membership operation
        list.contains(10); //returns a boolean value

        //Size
        list.size();

        //Index accessing with elements
        list.indexOf(20); 
        list.lastIndexOf(20); //In case of duplicate elements present

        //Updating a element with index
        list.set(2,25);

        //Removing an element with index
        list.remove(1);

        //Removing by object
        list.remove(Integer.valueOf(15));

        //Empty the List
        // I) list.removeAll(list2); -> Similair to list1 - list2
        // II) list.clear();

        //Removing with condition
        // list.removeIf(x -> x % 2 == 0);

        //Sorting in reverseOrder

        Collections.sort(list, Collections.reverseOrder());

        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i));
        }
    }
}
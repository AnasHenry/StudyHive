import java.util.HashMap;
class HashMp{
    public static void main(String[] args){
        HashMap<String, Integer> map = new HashMap<>();

        //PUT:
        map.put("A",12);
        map.put("B",17);

        //GET:
        System.out.println(map.get("A")); //12

        //CONTAINS:
        map.containsKey("B"); // true
        map.containsValue(12); // true

        //REMOVE:
        map.remove("B");

        //SIZE:
        System.out.println(map.size());

        //keySet: -> returns a String List of Keys in the map
        for( String s : map.keySet()){
            System.out.println(s + " => " + map.get(s));
        }

        //VALUES: -> returns an array of values in the map
        for(int v: map.values()){
            System.out.println(v);
        }
         
    }
}
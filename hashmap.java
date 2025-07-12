import java.util.HashMap;

public class hashmap {
    // hashmap contains key-value pairs
    // it is used to store data in key-value pairs
    // key is unique and value can be duplicate
    // it is implemented using hash table

    public static void main(String args[]) {
        // country(key), population (value)
        HashMap<String, Integer> map = new HashMap<>();

        // insertion operation
        map.put("India", 1400000000);
        map.put("USA", 331000000);
        map.put("China", 1440000000);

        //the rest operations 

        System.out.println(map);

    }

}
package collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapDemo {
    //MapClassesDemo.java
    public static void main(String args[]) {
        HashMap<String,Double>	hashMap 	= new HashMap();
        TreeMap<String,Double> treeMap 	= new TreeMap();

        hashMap.put("Arun", 40000.0);
        hashMap.put("Shiva", 3500.0);
        hashMap.put("Ram", 2150.0);


        treeMap.put("Arun", 40000.0);
        treeMap.put("Shiva", 3500.0);
        treeMap.put("Ram", 2150.0);

        System.out.println("HashMap "+ hashMap);
        System.out.println("TreeMap "+treeMap);

        // Getting the set of keys and iterating
        Set	set = hashMap.keySet();
        Iterator hashIterator	= set.iterator();

        System.out.println("HashMap Iteration");
        while(hashIterator.hasNext()) {
            String key = (String) hashIterator.next();
            Double value	= hashMap.get(key);
            System.out.println(key +" "+ value);
        }


        // To iterate over tree map
        Set tmset = treeMap.entrySet();
        Iterator tmItr 	= tmset.iterator();
        while(tmItr.hasNext()) {
            Map.Entry me = (Map.Entry)tmItr.next();
            System.out.println(me.getKey()+" "+me.getValue());
        }
    }
}


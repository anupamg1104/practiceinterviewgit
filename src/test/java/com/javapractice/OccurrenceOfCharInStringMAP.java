package com.javapractice;

import java.util.HashMap;
import java.util.Map;

public class OccurrenceOfCharInStringMAP {


	public static void main(String[] args) {
		Map<Character,Integer> map=new HashMap<>();
		String name="anupam gupta play";
		name=name.replace(" ", "");
		for(int i=0;i<name.length();i++) {
			char ch=name.charAt(i);
			map.put(ch, map.getOrDefault(ch, 0)+1);
		}
//		System.out.println(map.toString());

		for (Map.Entry e : map.entrySet()) {
//		Integer in=e.getClass();
			if((Integer)e.getValue()==1) {
				System.out.println((Character) e.getKey());
		}
		}

	}
}




//for (Map.Entry e : map.entrySet()) {
//if(!(e.getValue()=="")) {
//	set.add((String) e.getKey());
//}
//}



// Iterating over keys
/*
 for (String key : map.keySet()) {
    Integer value = map.get(key);
    System.out.println("Key: " + key + ", Value: " + value);
}
 */



//Iterating over values
/*
 for (Integer value : map.values()) {
    System.out.println("Value: " + value);
} 
 */



//Iterating using forEach method
//    map.forEach((key, value) -> System.out.println("Key: " + key + ", Value: " + value));

//Using forEach with a condition
/*
 map.forEach((key, value) -> {
    if (value > 2) {
        System.out.println("Key: " + key + ", Value: " + value);
    }
}); 
 */



// Using iterator over entrySet
/*
 Iterator<Map.Entry<String, Integer>> iterator = map.entrySet().iterator();

while (iterator.hasNext()) {
    Map.Entry<String, Integer> entry = iterator.next();
    System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
} 
 */




//Convert the map's entrySet to a list of map entries
//     List<Map.Entry<String, Integer>> entryList = new ArrayList<>(map.entrySet());

// Access and print the key-value pairs by index
/*
for (int i = 0; i < entryList.size(); i++) {
    Map.Entry<String, Integer> entry = entryList.get(i);
    System.out.println("Index " + i + ": Key = " + entry.getKey() + ", Value = " + entry.getValue());
} 
 */




//Convert map's key set to a list
//      List<String> keys = new ArrayList<>(map.keySet());

// Access elements by index
/*
 for (int i = 0; i < keys.size(); i++) {
    String key = keys.get(i);
    Integer value = map.get(key); // Use the key to get the value
    System.out.println("Key: " + key + ", Value: " + value);
} 
 */



//Using for-each loop to iterate over the map entries (key-value pairs)
/*
 for (Map.Entry<String, Integer> entry : map.entrySet()) {
    System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
}
 */




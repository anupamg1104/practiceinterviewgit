package com.MapExample;

import java.util.HashMap;
import java.util.Map;

public class MapPractice {
	public static void main(String[] args) {
		HashMap<String,Integer> map = new HashMap<>();
		map.put("jhsd", 56);
		map.put("jd", 6526);
		map.put("jhd", 5696);
		System.out.println(map.toString());           //{jhd=5696, jd=6526, jhsd=56}

		int n=map.get("jd");
		System.out.println(n);                 //6526

		System.out.println(map.keySet());            //[jhd, jd, jhsd]
		System.out.println(map.values());           //[5696, 6526, 56]

		System.out.println(map.containsKey("jhd"));  //true



		// Find the student with the highest marks
		String topStudent = null;
		int highestMarks = 0;
		double avg=0;
		int total=0;
		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			if (entry.getValue() > highestMarks) {
				highestMarks = entry.getValue();
				topStudent = entry.getKey();
			}
			total+=entry.getValue();
		}

		avg=total/map.size();
		System.out.println(avg);             //4092.0
		System.out.println("Top Student: " + topStudent + " with Marks: " + highestMarks);       //Top Student: jd with Marks: 6526


	}
}

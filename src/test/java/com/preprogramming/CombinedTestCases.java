
package com.preprogramming;

import org.testng.annotations.Test;
import java.util.*;
import java.util.stream.Collectors;

public class CombinedTestCases {

	// ---------- 1. Group Anagrams ----------
	public static List<List<String>> groupAnagrams(String[] strs) {
		Map<String, List<String>> map = new HashMap<>();
		for (String str : strs) {
			String sorted = sortString(str);
			map.putIfAbsent(sorted, new ArrayList<>());
			map.get(sorted).add(str);
		}
		return new ArrayList<>(map.values());
	}

	private static String sortString(String str) {
		char[] chars = str.toCharArray();
		Arrays.sort(chars);
		return new String(chars);
	}

	@Test
	public void testGroupAnagrams() {
		String[] arr = {"eat", "tea", "tan", "ate", "nat", "bat"};
		List<List<String>> result = groupAnagrams(arr);
		System.out.println("Anagram Groups: " + result);
	}

	// ---------- 2. Duplicate Words in String ----------
	public static Map<String, Long> getDuplicateWords(String sentence) {
		String[] words = sentence.toLowerCase().split("\s+");

		return Arrays.stream(words)
				.collect(Collectors.groupingBy(word -> word, Collectors.counting()))
				.entrySet()
				.stream()
				.filter(entry -> entry.getValue() > 1)
				.collect(Collectors.toMap(
						Map.Entry::getKey,
						Map.Entry::getValue,
						(a, b) -> a,
						LinkedHashMap::new
						));
	}

	@Test
	public void testDuplicateWords() {
		String sentence = "My Life My Rules My";
		Map<String, Long> duplicates = getDuplicateWords(sentence);
		System.out.println("Duplicate Words: " + duplicates);
	}

	// ---------- 3. Fibonacci Series ----------
	public static List<Integer> generateFibonacci(int n) {
		List<Integer> series = new ArrayList<>();
		int f1 = 0, f2 = 1;
		while (n-- > 0) {
			series.add(f1);
			int f3 = f1 + f2;
			f1 = f2;
			f2 = f3;
		}
		return series;
	}

	@Test
	public void testFibonacciSeries() {
		int count = 7;
		List<Integer> series = generateFibonacci(count);
		System.out.println("Fibonacci Series (" + count + " terms): " + series);
	}

	// ---------- 4. Sort Integer Array in Ascending Order ----------
	public static int[] sortArrayAscending(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		return arr;
	}

	@Test
	public void testSortArray() {
		int[] input = {30, 20, 10, 50, 40};
		int[] sorted = sortArrayAscending(input);
		System.out.println("Sorted Array: " + Arrays.toString(sorted));
	}
}

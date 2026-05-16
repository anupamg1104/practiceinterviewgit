package com.StringPractice;


public class StringChallenges1{

	// 1. Reverse a string

	// ===============================    
	// reverseString - Logic Explanation    
	public static String reverseString(String str) {    
		String reversed = "";   
		for (int i = str.length() - 1; i >= 0; i--) {    
			reversed += str.charAt(i);    
		}
		return reversed;
	}

	// 2. Palindrome

	// ===============================    // isPalindrome - Logic Explanation    
	public static boolean isPalindrome(String str) {    int start = 0, end = str.length() - 1;    while (start < end) {    if (str.charAt(start++) != str.charAt(end--)) return false;        }
	return true;
	}

	// 3. Remove duplicates

	// ===============================    // removeDuplicates - Logic Explanation    
	public static String removeDuplicates(String str) {    String result = "";    for (int i = 0; i < str.length(); i++) {    if (!result.contains(String.valueOf(str.charAt(i))))    result += str.charAt(i);        }
	return result;
	}

	// 4. First non-repeating char

	// ===============================    // firstNonRepeating - Logic Explanation    
	public static char firstNonRepeating(String str) {    for (int i = 0; i < str.length(); i++) {    char c = str.charAt(i);    if (str.indexOf(c) == str.lastIndexOf(c))    return c;        }
	return '\0';
	}

	// 5. Frequency of each char

	// ===============================    // charFrequency - Logic Explanation    
	public static void charFrequency(String str)
	{    int[] freq = new int[256];    
	for (char c : str.toCharArray()) freq[c]++;    
	for (char c : str.toCharArray()) {   
		if (freq[c] != 0)
		{    System.out.println(c + ": " + freq[c]);    
		freq[c] = 0;    // Sample Output:    // c + ": " + freq[c]           
		}
	}
	}

	// 6. Reverse each word

	// ===============================    // reverseEachWord - Logic Explanation    
	public static String reverseEachWord(String str) {    String[] words = str.split(" ");    StringBuilder result = new StringBuilder();    for (String word : words) {    result.append(new StringBuilder(word).reverse()).append(" ");        }
	return result.toString().trim();
	}

	// 7. Anagram

	// ===============================    // areAnagrams - Logic Explanation    
	public static boolean areAnagrams(String s1, String s2) {    if (s1.length() != s2.length()) return false;    int[] count = new int[256];    for (char c : s1.toCharArray()) count[c]++;    for (char c : s2.toCharArray()) count[c]--;    for (int c : count) if (c != 0) return false;    return true;    }

	// 8. Longest unique substring

	// ===============================    // longestUniqueSubstring - Logic Explanation    
	public static int longestUniqueSubstring(String str) {    int max = 0;    String current = "";    for (char c : str.toCharArray()) {    String s = String.valueOf(c);    if (current.contains(s)) {    current = current.substring(current.indexOf(s) + 1);            }
	current += s;
	max = Math.max(max, current.length());
	}
	return max;
	}

	// 9. Custom atoi

	// ===============================    // myAtoi - Logic Explanation    
	public static int myAtoi(String str) {    int res = 0, i = 0, sign = 1;    if (str.charAt(0) == '-') { sign = -1; i++; }    for (; i < str.length(); ++i) {    if (str.charAt(i) < '0' || str.charAt(i) > '9') break;    res = res * 10 + (str.charAt(i) - '0');        }
	return res * sign;
	}

	// 10. Run-length encoding

	// ===============================    // runLengthEncode - Logic Explanation    
	public static String runLengthEncode(String str) {    StringBuilder sb = new StringBuilder();    int count = 1;    for (int i = 1; i < str.length(); i++) {    if (str.charAt(i) == str.charAt(i - 1)) count++;    else {    sb.append(str.charAt(i - 1)).append(count);    count = 1;            }
	}
	sb.append(str.charAt(str.length() - 1)).append(count);
	return sb.toString();
	}

	// 11. Most frequent character

	// ===============================    // mostFrequentChar - Logic Explanation    
	public static char mostFrequentChar(String str) {    int[] count = new int[256];    for (char c : str.toCharArray()) count[c]++;    int max = 0;    char result = ' ';    for (char c : str.toCharArray()) {    if (count[c] > max) {    max = count[c];    result = c;            }
	}
	return result;
	}

	// 12. Generate all substrings

	// ===============================    // printSubstrings - Logic Explanation    
	public static void printSubstrings(String str) {    for (int i = 0; i < str.length(); i++) {    for (int j = i + 1; j <= str.length(); j++) {    System.out.println(str.substring(i, j));    // Sample Output:    // str.substring(i, j            }
	}}
	}

	// 13. Rotation check

	// ===============================    // isRotation - Logic Explanation    
	public static boolean isRotation(String s1, String s2) {    return s1.length() == s2.length() && (s1 + s1).contains(s2);    }

	// 14. Remove whitespaces

	// ===============================    // removeSpaces - Logic Explanation    
	public static String removeSpaces(String str) {    return str.replaceAll("\\s+", "");    }

	// 15. Valid shuffle

	// ===============================    // isShuffle - Logic Explanation    
	public static boolean isShuffle(String a, String b, String result) {    if (a.length() + b.length() != result.length()) return false;    int i = 0, j = 0, k = 0;    while (k < result.length()) {    if (i < a.length() && a.charAt(i) == result.charAt(k)) i++;    else if (j < b.length() && b.charAt(j) == result.charAt(k)) j++;    else return false;    k++;        }
	return true;
	}

	// 16. Title case

	// ===============================    // toTitleCase - Logic Explanation    
	public static String toTitleCase(String str) {    String[] words = str.toLowerCase().split(" ");    StringBuilder sb = new StringBuilder();    for (String word : words) {    sb.append(Character.toUpperCase(word.charAt(0))).append(word.substring(1)).append(" ");        }
	return sb.toString().trim();
	}

	// 17. Longest common prefix

	// ===============================    // longestCommonPrefix - Logic Explanation    
	public static String longestCommonPrefix(String[] strs) {    if (strs.length == 0) return "";    String prefix = strs[0];    for (int i = 1; i < strs.length; i++) {    while (!strs[i].startsWith(prefix)) {    prefix = prefix.substring(0, prefix.length() - 1);            }
	}
	return prefix;
	}

	// 18. Convert to char array manually

	// ===============================    // toCharArray - Logic Explanation    
	public static char[] toCharArray(String str) {    char[] arr = new char[str.length()];    for (int i = 0; i < str.length(); i++) arr[i] = str.charAt(i);    return arr;    }

	// 19. URL encoding

	// ===============================    // urlEncode - Logic Explanation    
	public static String urlEncode(String str) {    return str.replace(" ", "%20");    }

	// 20. Create acronym

	// ===============================    // createAcronym - Logic Explanation    
	public static String createAcronym(String str) {    String[] words = str.split(" ");    StringBuilder acronym = new StringBuilder();    for (String word : words) {    if (!word.isEmpty())    acronym.append(Character.toUpperCase(word.charAt(0)));        }
	return acronym.toString();
	}

	// 21. Contains only digits

	// ===============================    // onlyDigits - Logic Explanation    
	public static boolean onlyDigits(String str) {    return str.matches("\\d+");    }

	// 22. Count words

	// ===============================    // countWords - Logic Explanation    
	public static int countWords(String str) {    return str.trim().split("\\s+").length;    }

	// 23. Remove specific char

	// ===============================    // removeChar - Logic Explanation    
	public static String removeChar(String str, char ch) {    return str.replaceAll(String.valueOf(ch), "");    }

	// 24. Shortest word

	// ===============================    // shortestWord - Logic Explanation    
	public static String shortestWord(String str) {    String[] words = str.split(" ");    String shortest = words[0];    for (String word : words) {    if (word.length() < shortest.length()) shortest = word;        }
	return shortest;
	}

	// 25. Longest palindromic substring

	// ===============================    // longestPalindromicSubstring - Logic Explanation    
	public static String longestPalindromicSubstring(String str) {    int start = 0, maxLen = 1;    for (int i = 0; i < str.length(); i++) {    int low = i - 1;    int high = i + 1;    while (high < str.length() && str.charAt(high) == str.charAt(i)) high++;    while (low >= 0 && str.charAt(low) == str.charAt(i)) low--;    while (low >= 0 && high < str.length() && str.charAt(low) == str.charAt(high)) {    low--;    high++;            }
	int len = high - low - 1;
	if (len > maxLen) {
		maxLen = len;
		start = low + 1;
	}
	}
	return str.substring(start, start + maxLen);
	}

	public static void main(String[] args) {
		System.out.println("Reverse: " + reverseString("hello"));
		System.out.println("Palindrome: " + isPalindrome("madam"));
		System.out.println("No Duplicates: " + removeDuplicates("banana"));
		System.out.println("First Non-Repeating: " + firstNonRepeating("stress"));
		charFrequency("banana");
		System.out.println("Reverse Words: " + reverseEachWord("I am a boy"));
		System.out.println("Are Anagrams: " + areAnagrams("listen", "silent"));
		System.out.println("Longest Unique Substring Length: " + longestUniqueSubstring("abcabcbb"));
		System.out.println("Atoi: " + myAtoi("-1234"));
		System.out.println("Run-Length Encoding: " + runLengthEncode("aaabbcddd"));
		System.out.println("Most Frequent Char: " + mostFrequentChar("banana"));
		printSubstrings("abc");
		System.out.println("Is Rotation: " + isRotation("waterbottle", "erbottlewat"));
		System.out.println("No Spaces: " + removeSpaces("a b c"));
		System.out.println("Is Shuffle: " + isShuffle("abc", "def", "dabecf"));
		System.out.println("Title Case: " + toTitleCase("this is a test"));
		System.out.println("Longest Common Prefix: " + longestCommonPrefix(new String[]{"flower", "flow", "flight"}));
		System.out.println("Char Array: " + java.util.Arrays.toString(toCharArray("hello")));
		System.out.println("URL Encode: " + urlEncode("my name is"));
		System.out.println("Acronym: " + createAcronym("central processing unit"));
		System.out.println("Only Digits: " + onlyDigits("12345"));
		System.out.println("Word Count: " + countWords("I am learning Java"));
		System.out.println("Remove Char: " + removeChar("banana", 'a'));
		System.out.println("Shortest Word: " + shortestWord("I am a developer"));
		System.out.println("Longest Palindromic Substring: " + longestPalindromicSubstring("babad"));
	}
	}


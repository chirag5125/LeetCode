// Find Anagram by : convert strings into charArray
//                  : sort charArray
//                  : compare compare string, if they match they are anagrams.
// To make sets: Create a Hashmap.
//              : store sorted charArray as key and list of strings as value.
//              : check if key is present in the hashmap.
//              : If present, insert string into corresponding list; else create a new list and insert into new list.


import java.awt.List;
import java.util.*;


public class GroupAnagram {

	
	public  ArrayList<ArrayList<String>> groupAnagrams(String[] strs) {
        
		Map<String, ArrayList> listOfList = new HashMap<>();
		
		for(String s: strs) {
			char[] ar = s.toCharArray();
			Arrays.sort(ar);
			String key = String.valueOf(ar);
			
			if(!listOfList.containsKey(key)) {
				listOfList.put(key, new ArrayList<String>());
			}
			
			listOfList.get(key).add(s);
		}
		
			return new ArrayList(listOfList.values());
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] arr = {"eat", "tea", "tan", "ate", "nat", "bat"};
		GroupAnagram g = new GroupAnagram();
		System.out.println(g.groupAnagrams(arr));

	}

}

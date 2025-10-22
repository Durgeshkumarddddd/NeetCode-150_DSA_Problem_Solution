import java.util.List;
import java.util.Map;
import java.util.*;
import java.util.ArrayList;
class GroupAnagram {

    public static List<List<String>> groupAnagramsSort(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for (String str : strs) {
            char[] charArray = str.toCharArray();
            java.util.Arrays.sort(charArray);
            // first method to convert  String sortedStr = new String(charArray); // Convert sorted char array back to string
            String sortedStr = String.valueOf(charArray); // Second method to convert char array to string
            if (!map.containsKey(sortedStr)) {
                map.put(sortedStr, new ArrayList<>());
            }
            map.get(sortedStr).add(str);
        }
        return new ArrayList<>(map.values());
        
        // Second method to return the result
        // List<List<String>> result = new ArrayList<>();
        // for (List<String> group : map.values()) {
        //     result.add(group);
        List<List<String>> resultAnagram = new ArrayList<>();
        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            resultAnagram.add(entry.getValue());
        }

        
    }
    
    public static void main(String args[]) {
        String[] strs = { "eat", "tea", "tan", "ate", "nat", "bat" };
         System.out.println(groupAnagramsSort(strs));
    }
}


class ValidAnagram {
    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        int[] count = new int[26]; // Assuming only lowercase letters a-z

        // Count frequency of each character in s
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;

        }
        // Decrease frequency based on characters in t
        for (int i = 0; i < t.length(); i++) {
            count[t.charAt(i) - 'a']--;
            if (count[t.charAt(i) - 'a'] < 0) {
                return false;
            }
        }
        // for (int c : count) {
        //     if (c != 0) {
        //         return false;
        //     }
        // }

        return true;
    }

    public static void main(String[] args) {
        String s = "anagraam";
        String t = "nagaram";

        boolean isAnagram = isAnagram(s, t);
        System.out.println("Are \"" + s + "\" and \"" + t + "\" anagrams? " + isAnagram);
    }
}
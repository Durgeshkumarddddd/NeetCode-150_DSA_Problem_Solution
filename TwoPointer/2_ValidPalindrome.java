
class ValidPalindrome {
    public boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();
        for(char ch : s.toCharArray()){
            if(Character.isLetterOrDigit(ch)){
                sb.append(ch);
            }
        }
        String str = sb.toString().toLowerCase();
        String reverseStr = sb.reverse().toString().toLowerCase();
        if (str.equals(reverseStr)){
            return true ;
        }
        else {
            return false ;
        }
        // char[] c = sb.toString().toCharArray();
        
        
    }
}

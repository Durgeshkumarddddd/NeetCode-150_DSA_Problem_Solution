
import java.util.*;
// Given a number Check if it is a lucky number or not. A lucky number is a number 
// in which the sum of squares of digits at odd positions isLucky divisible by 9.

class LuckeyNumber {
    static boolean isLucky(int num) {
        int sum = 0;
        List<Integer> digit = new ArrayList<>();
        
        while (num > 0) {
            digit.add(0, num % 10); // insert at index 0 to maintain order
            num /= 10;
        }
    
        for (int i = 0; i < digit.size(); i++) {
            if (i % 2 != 0) {
                // int digit = s.charAt(i) - '0'; //Character.getNumericValue(s.charAt(i));
                int n = digit.get(i);
                sum += n * n;
            }
        }
        if ( sum % 9 == 0 ) {
            return true;
        } else {
            return false;
        }
    }
    public static void main(String args[]) {
        // String s = "1623";
        int s = 1623;
        System.out.println(isLucky(s));
    }
}

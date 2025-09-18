//1.  Brut force approach to take one element and compare with all elements if element occuree then return true else return false.
// 2. Second method is to sort the array and compare ith index to i+1th index if same then return true else return false.
// 3. Third approach is by using HashSet then can't store duplicate
import java.util.Arrays;

class findDuplicate {

    // public static boolean findDuplicate(int[] arr) {
    //     Arrays.sort(arr);

    //     for (int i = 0; i < arr.length - 1; i++) {
    //         if (arr[i] == arr[i + 1]) {
    //             System.out.println("Duplicate found: " + arr[i]);
    //             return true;
    //         }
    //     }
    //     System.out.println("No duplicates found.");
    //     return false;
    // }

    // Using HashSet
    public static boolean findDuplicate(int[] arr) {
        java.util.HashSet<Integer> set = new java.util.HashSet<>();

        for (int num : arr) {
            if (set.contains(num)) {
                System.out.println("Duplicate found: " + num);
                return true;
            }
            set.add(num);
        }
        System.out.println("No duplicates found.");
        return false;
    }
    public static void main(String args[]) {
        int arr[] = { 1, 6, 4, 3, 1 };

        boolean result = findDuplicate(arr);

    }
}
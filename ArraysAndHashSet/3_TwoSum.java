/*
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.
 * You may assume that each input would have exactly one solution, and you may not use the
 * same element twice.
 * Example: Given nums = [2, 7, 11, 15], target = 9,
 * Because nums[0] + nums[1] = 2 + 7 = 9, return [0, 1].    
 * 
 * Brut force approach is to take one element and compare with all other elements if sum is equal to target then return indices. the time complexity is O(n^2). and space complexity is O(1).
 * 
 * Second approach is to use two pointer technique after sorting the array.
 * Time complexity is O(n log n) and space complexity is O(1).
 * 
 * Third approach is to use HashMap to store the element and its index and check if target - element is present in map then return indices. 
 * Time complexity is O(n) and space complexity is O(n).   
 * 
 
 Second method is commented.
    Using second approach first sort and then use two pointer technique.
    sort the array and take two pointers one at start and other at end.
     

 */ 



class TwoSum {
    public static int[] twoSum(int arr[], int target) {
        java.util.HashMap<Integer, Integer> map = new java.util.HashMap<>();
        // for (int i = 0; i < arr.length; i++) {
        //     int complement = target - arr[i];
        //     if (map.containsKey(complement)) {
        //         return new int[] { map.get(complement), i };
        //     }
        //     map.put(arr[i], i);
        // }
        for (int i = 0; i < arr.length; i++) {
            int complement = target - arr[i];
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            map.put(arr[i], i);
        }
        return new int[] { -1, -1 }; // return -1 if no solution found

    }

    public static void main(String[] arga) {
        int arr[] = { 2, 7, 11, 15 };
        int target = 9;
       
        int result[] = twoSum(arr, target);
        System.out.println("Indices: [" + result[0] + ", " + result[1] + "]");
    }
}

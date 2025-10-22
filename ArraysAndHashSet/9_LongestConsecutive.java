import java.util.HashSet;
class LongestConsecutive {
    
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> numSet = new HashSet<>();
        // For copy value from nums[] to HashSet.

        for (int num : nums) {
            numSet.add(num);
        }
        int maxLongest = 0;
        for (int num : numSet) {

            if (!numSet.contains(num - 1)) {
                int currnum = num;
                int longest = 1;

                while (numSet.contains(currnum + 1)) {
                    longest++;
                    currnum++;
                }
                maxLongest = Math.max(longest, maxLongest);
            }
        }
        return maxLongest;

    }
    public static void main(String args[]) {
        LongestConsecutive obj = new LongestConsecutive();
        int[] nums = {100, 4, 200, 1, 3, 2};
        System.out.println(obj.longestConsecutive(nums));
    }
}

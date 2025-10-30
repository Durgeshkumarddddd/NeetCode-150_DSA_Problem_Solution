class Solution {
    public int trap(int[] height) {
        int left[] = new int[height.length];
        int right[] = new int[height.length];

        // creating the left arr 
        left[0] = height[0];
        for (int i = 1; i < left.length; i++) {
            if (height[i] > left[i - 1]) {
                left[i] = height[i];
            } else {
                left[i] = left[i - 1];
            }
        }
        // for creating the right arr
        right[right.length - 1] = height[height.length - 1];
        for (int i = height.length - 2; i >= 0; i--) {
            if (height[i] > right[i + 1]) {
                right[i] = height[i];
            } else {
                right[i] = right[i + 1];
            }
        }
        // Now find the min from each index - height ;
        int total = 0;
        for (int i = 0; i < height.length; i++) {
            total += Math.min(left[i], right[i]) - height[i];
        }

        return total;
    }

}
class TrappingRainWater {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int height[] = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println("Total water trapped is : " + sol.trap(height));
    }
}


// Problem Link :
// https://leetcode.com/problems/trapping-rain-water/description/
// TC : O(N) , SC : O(N)

// Approach : Create two arrays left and right to store the max height from left and right side respectively.
// Then iterate through the height array and find the min of left and right array at each index and subtract the height at that index to get the water trapped at that index.
// Finally, sum up all the water trapped at each index to get the total water trapped.
// Note : This is not the optimal solution, optimal solution can be done using two pointers with O(1) space.
// Refer 5_TrappingRainWater_Optimal.java for optimal solution.




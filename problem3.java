// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no


// Your code here along with comments explaining your approach
// used 3 pointers to solve where each pointer makes sure each type of color is in right position.

class Solution {
    public void sortColors(int[] nums) {
        int n = nums.length;
        int low =0; //will check for 0, will make sure anything before it and on it has zero
        int mid = 0; //will check for 1, will make sure anything between low and mid including mid will have 1
        int high = n-1; // will check for 2, anything after mid should be 2
        while(mid<=high){
            if(nums[mid] == 0){
                int temp = nums[low];
                nums[low] = nums[mid];
                nums[mid] = temp;
                mid++;
                low++;
            }else if(nums[mid] == 2){
                int temp = nums[high];
                nums[high] = nums[mid];
                nums[mid] = temp;
                high--;
            }else { // nums[mid] == 1
                mid++;
            }
        }
    }
}
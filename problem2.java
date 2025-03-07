// Time Complexity : O(n**2)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no


// Your code here along with comments explaining your approach
// fix one element from outer for loop and use 2 pointers for finding required sum of -outer element to make total sum of three elements 0.
// but first sort and for every outer and inner iteration check if previous values were same, if yes=>continue to next iteration.
// class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        int n = nums.length;
        for(int i = 0; i<n-2; i++){
            if(i!=0 && nums[i]==nums[i-1]) continue;
            int left = i+1;
            int right = n-1;
            int required = -nums[i];
            int changed = -1; //0 for left, 1 for right
            while(left<right){
                if(changed == 0 && nums[left] == nums[left-1]) {
                    left = left +1;
                    continue;
                }else if(changed == 1 && nums[right] == nums[right+1]){
                    right = right - 1;
                    continue;
                }
                int sum = nums[left] + nums[right];
                if(sum==required){
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    left = left +1;
                    changed = 0;
                }
                else if(sum<required){
                    left = left + 1;
                    changed = 0;
                }
                else {
                    right = right - 1;
                    changed = 1;
                }
            }
        }
        return result;
    }
}
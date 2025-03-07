// Time Complexity : O(n**2)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : no Time limit exceed (n**2)
// Any problem you faced while coding this : no 


// Your code here along with comments explaining your approach
// For every line calculte area with other lines after it.
class Solution {
    public int maxArea(int[] height) {
        int maxArea = 0;
        int n =height.length;
        for(int i = 0; i<n; i++){
            for(int j = i; j<n; j++){
                int currentArea = (j-i) * (Math.min(height[i], height[j]));
                if(maxArea < currentArea) maxArea = currentArea;
            }
        }
        return maxArea;
    }
}

// Time Complexity : O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no


// Your code here along with comments explaining your approach
// Check best case for every element by using 2 pointers. and move the pointer with lesser value each time
//to ensure the area is maximum as width will decrease and height will never increase, remain constant
//or decrease.
class Solution {
    public int maxArea(int[] height) {
        int maxArea = 0;
        int n =height.length;
        int left =0;
        int right = n-1;
        while(left!=right){
            int currentArea = (right-left) * Math.min(height[left],height[right]);
            if(currentArea>maxArea) maxArea = currentArea;
            if(height[left]<height[right]) left = left +1;
            else right = right - 1;
        }
        return maxArea;
    }
}
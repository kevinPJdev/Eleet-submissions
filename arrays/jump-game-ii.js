/*
  Given an array of non-negative integers nums, you are initially positioned at the first index of the array.

Each element in the array represents your maximum jump length at that position.

Your goal is to reach the last index in the minimum number of jumps.

You can assume that you can always reach the last index.

 

Example 1:

Input: nums = [2,3,1,1,4]
Output: 2
Explanation: The minimum number of jumps to reach the last index is 2. Jump 1 step from index 0 to 1, then 3 steps to the last index.
*/




/**
 * @param {number[]} nums
 * @return {number}
 */
 var jump = function(nums) {
  var l, r = 0;
  var res = 0;
  
  while(r < nums.length - 1) {
      var farthest = 0;
      for(var i= l; i< r+1; i++) {
          farthest = max(farthest, i+nums[i])
      }
      l = r+1;
      r= farthest;
      res += 1
  }
  return res
};
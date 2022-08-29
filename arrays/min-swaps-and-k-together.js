/*Given an array arr of n positive integers and a number k. One can apply a swap operation on the array any number of times, i.e choose any two index i and j (i < j) and swap arr[i] , arr[j] . Find the minimum number of swaps required to bring all the numbers less than or equal to k together, i.e. make them a contiguous subarray.

Example 1:

Input : 
arr[ ] = {2, 1, 5, 6, 3} 
K = 3
Output : 
1

*/

// Utility function to find minimum swaps
// required to club all elements less than
// or equals to k together
function minSwap(arr,  n,  k) {
     
  // Find count of elements which are
  // less than equals to k
  var count = 0;
  for (var i = 0; i < n; ++i)
      if (arr[i] <= k)
          ++count;
   
  // Find unwanted elements in current
  // window of size 'count'
  var bad = 0;
  for (var i = 0; i < count; ++i)
      if (arr[i] > k)
          ++bad;
   
  // Initialize answer with 'bad' value of
  // current window
  var ans = bad;
  for (var i = 0, j = count; j < n; ++i, ++j) {
       
      // Decrement count of previous window
      if (arr[i] > k)
          --bad;
       
      // Increment count of current window
      if (arr[j] > k)
          ++bad;
       
      // Update ans if count of 'bad'
      // is less in current window
      ans = Math.min(ans, bad);
  }
  return ans;
}

  // Driver code
  var arr=[2, 1, 5, 6, 3];
  var n =5;
  var k = 3;
  document.write(minSwap(arr, n, k) + "<br>");
   
  var arr1 = [2, 7, 9, 5, 8, 7, 4];
  n = 7;
  k = 5;
  document.write(minSwap(arr1, n, k));
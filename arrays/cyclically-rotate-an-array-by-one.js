/*Given an array, rotate the array by one position in clock-wise direction.
 
Example 1:

Input:
N = 5
A[] = {1, 2, 3, 4, 5}
Output:
5 1 2 3 4

*/


/**
 * @param {number[]} arr
 * @param {number} n
 * @returns {number[]}
*/

class Solution{
  rotate(arr,n){
      //code here
      var arr2 = [];
      //console.log(n);
      for(var i=0; i<n-1; i++) {
          //console.log(i);
          arr2[i+1] = arr[i]; 
      }
      arr2[0] = arr[n-1];
      
      return arr2;
  }
}
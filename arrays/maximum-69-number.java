/*
 You are given a positive integer num consisting only of digits 6 and 9.

Return the maximum number you can get by changing at most one digit (6 becomes 9, and 9 becomes 6).
 */

public class maximum-69-number
{

  public int maximum69Number (int num) {
    int maxNum = num;
    int tempNum;
    int origNum = num;
    int pos = 0;
    while(num!=0) {
        if(num % 10 == 6) {
            tempNum = swap69Digit(pos, origNum);
            maxNum = Math.max(maxNum, tempNum);
        };
        num = num/10;
        pos++;
    }
    return maxNum;
  }

  public int swap69Digit(int pos, int num) {
    char[] numString = String.valueOf(num).toCharArray();
    int len = numString.length - 1;
    numString[len - pos] = '9';
    return Integer.parseInt(new String(numString));
  }
}

package strings;

public class make-the-string-great
{

  public String makeGood(String s) {
      Stack<Character> stk = new Stack<>();
    
    for(char ch: s.toCharArray()){
        if(!stk.isEmpty() && Math.abs(stk.peek()-ch)==('a'-'A') ){
            stk.pop();
        } else{
            stk.push(ch);
        }
    }
    
    String ans = "";
    while(!stk.isEmpty()){
        ans = stk.pop() + ans;
    }
    
    return ans;
  }
}

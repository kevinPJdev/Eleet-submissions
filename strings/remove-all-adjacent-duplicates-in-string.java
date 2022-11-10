package strings;

public class remove-all-adjacent-duplicates-in-string
{

  public String removeDuplicates(String s) {
      char[] stringArray = s.toCharArray();
      Stack<Character> stack = new Stack<Character>();
      StringBuilder sb = new StringBuilder();
      
      //System.out.println(stringArray[0]);
      
      stack.push(stringArray[0]);
      
      //System.out.println(stack.peek());
      
      for(int i=1; i<stringArray.length; i++) {
          //System.out.println("Incoming element " +stringArray[i]);
          if(!stack.empty()) {
              //System.out.println("Top of stack " +stack.peek());
              if(stringArray[i] == stack.peek()) {
                  //System.out.println("Element popped: "+stack.peek());
                  stack.pop();
              } else {
                  stack.push(stringArray[i]);   
              }   
          } else {
              stack.push(stringArray[i]);
          }
      }
      
      while(!stack.empty()) {
          sb.append(stack.pop());
      }
      //System.out.println(stack.toString());
      return sb.reverse().toString();
  }
}

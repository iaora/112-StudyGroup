import java.util.regex.*;
import java.util.Stack;

public class Solution{
    public static char[][] TOKENS = {{'{', '}'}, {'[',']'}, {'(', ')'}};
    
    public static boolean isOpenTerm(char c){
        for(char[] array : TOKENS){
            if(array[0] == c){
                return true;
            }
        }
        return false;
    }
    
    public static boolean matches(char openTerm, char closeTerm){
        for(char[] array : TOKENS){
            if(array[0] == openTerm){
                return array[1] == closeTerm;
            }
        }
        return false;
    }
    
    public static boolean isBalanced(String expression){
        Stack<Character> stack = new Stack<Character>();
        for(char c: expression.toCharArray()){
            if (isOpenTerm(c)){
                stack.push(c);
            } else{
                if (stack.isEmpty() || !matches(stack.pop(), c)){
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }


    public static void main(String[] args){
        String s = "{[()]()}";
        // true
        System.out.println("Result: " + isBalanced(s));
        
        s = "{[()]()";
        //false
        System.out.println("Result: " + isBalanced(s));
    }
}

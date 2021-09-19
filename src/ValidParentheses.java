import java.util.Stack;

public class ValidParentheses {

    public static boolean isValid(String s) {

        Stack<Character> donen=new Stack<Character>();

        for(char c: s.toCharArray()){

            if(c=='('){
                donen.push(')');
            }
            else if(c=='{'){
                donen.push('}');
            }
            else if(c=='['){
                donen.push(']');
            }
            else if(donen.isEmpty()||donen.pop()!=c){
                return false;
            }

        }

        return donen.isEmpty();


    }
}

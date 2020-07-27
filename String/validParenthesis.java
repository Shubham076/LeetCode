import java.util.HashMap;
import java.util.Stack;

public class validParenthesis {

    public static void main(String[] args) {

        String str = "[({)]";
        boolean valid = false;

        HashMap<Character ,Character> map = new HashMap<>();
        Stack<Character> s = new Stack<>();

        map.put(')', '(');
        map.put('}', '{');
        map.put(']', '[');


        for(int i =0 ; i<str.length() ; i++){

            Character c  = str.charAt(i);

            if(map.containsKey(c)){
                // If the current character is a closing bracket.


              // Get the top element of the stack. If the stack is empty, set a dummy value of '#'
                Character topElement = s.empty()  ? '#' :s.pop();
                

            // If the mapping for this bracket doesn't match the stack's top element, return false.
                if(topElement != map.get(c)){
                valid = false;
                }

            
            }

             // If it was an opening bracket, push to the stack.
            else{
                s.push(c);
            }
        }

         // If the stack still contains elements, then it is an invalid expression.
        valid = s.empty();

        System.out.println(valid);
        
    }
    
}
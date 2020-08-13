public class validNumber {

    public static void main(String[] args) {

        String s = "5.56e6";
        System.out.println(valid(s));

    }

    public static boolean valid(String s){

            boolean digitSeen = false , eSeen = false ,dotSeen = false;
            s = s.trim();

            for(int i = 0; i < s.length() ; i++ ){
                char ch = s.charAt(i);

                if( Character.isDigit(ch)){

                    digitSeen = true;

                }
                else if( ch == 'e'){

                // there should be a character before e
                    if( eSeen || !digitSeen) return false;

                    eSeen = true;
                
                // after e we need to have digits
                    digitSeen = false;
                    
                }

                else if(ch == '.'){

                // we cant have dot after e
                    if(dotSeen || eSeen)   return false;

                    dotSeen = true;
                }

                else if(ch == '+' || ch == '-'){

                    // both signs only exist at the beginning or right after 'e'; "+1" or "1e+1";
                    if(i !=0 && s.charAt(i - 1) != 'e') return false;
                }

                // for all the characters abc
                else{
                    return false;
                }
            }

            return digitSeen;
        }
    
}
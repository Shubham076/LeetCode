import java.util.ArrayList;
import java.util.Scanner;

public class generateparenthesis {

    public static void main(String[] args) {
        
        System.out.println("Enter the value :");
        Scanner scn  = new Scanner(System.in);
        int n = scn.nextInt();
        scn.close();

        ArrayList<String> res = new ArrayList<>();
        StringBuilder s = new StringBuilder();

        generate( res , n ,s, 0 , 0);
        System.out.println(res);
    }

    // for generating balanced paranthesis

    // closedBracket should always less than or equal to openBracket

    public static void generate( ArrayList<String> res  , int n ,StringBuilder  s, int openB , int closeB ){

        if(closeB == n){

            res.add(s.toString());
            return;
        }

        else {if( openB > closeB){

            generate(res, n, s.append(')'), openB, closeB +1);
            s.deleteCharAt(s.length()-1);
    
        }

        if(openB < n){
            generate(res, n, s.append('('), openB +1, closeB);
            s.deleteCharAt(s.length()-1);
        }
    }

        
    }
    
}
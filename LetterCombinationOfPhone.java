import java.util.ArrayList;
import java.util.List;

public class LetterCombinationOfPhone {

    public static void main(String[] args) {
        String s = "23";
        ArrayList<String> result = new ArrayList<>();
        result.add("");
        
        String[] digits2letters = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","xyzw"};

        for(int i = 0 ;  i <s.length() ; i++){

           result =  combinations(digits2letters[s.charAt(i) - '0'], result);
        }

        System.out.println(result);



    }

    public static ArrayList<String> combinations(String letters , List<String> res){

        ArrayList<String> newResult = new ArrayList<>();

        for(int i = 0; i < letters.length() ; i++){

            for(String str:res){

                newResult.add(str+letters.charAt(i));
            }
        }

        return newResult;
    }


    
}
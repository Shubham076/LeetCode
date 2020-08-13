import java.util.ArrayList;


// not complete solution
public class substringWithConcatenation {

    public static void main(String[] args) {
        String s = "barfoofoobarthefoobarman";
                
        
        String[] words = {"bar","foo","the"};

        if( s == null || s.length() < 1 || words.length < 1)
        return;

        String word = "";
        String revWord = "";
        
        
        ArrayList<Integer> res = new ArrayList<>();
        
        for(String str : words){
            
            word += str;
        }
        
        for(int i = words.length-1 ; i >= 0 ; i--){
            revWord += words[i];
        }
        
        
        
        for(int i = 0; i < s.length() -word.length() ; i++ ){
            
            if(s.substring(i ,word.length()+i).equals(word)){
                res.add(i);
            }
            
            if(s.substring(i , word.length()+i).equals(revWord)){
                res.add(i);
            }
        }
        
        System.out.println(res);
    }

    
}
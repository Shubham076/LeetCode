public class implementStr {

    public static void main(String[] args) {
        
        String haystack ="hello";
        String  needle = "ll";
        int index = -1;

        for( int i = 0 ; i< haystack.length() - needle.length() ; i++){

            if(haystack.substring(i, needle.length()+i).equals(needle)){
                index = i;
            }


        }

        System.out.println(index);
    }
    
}
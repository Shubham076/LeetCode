public class countAndSay {

    public static void main(String[] args) {
        int n = 5;
        System.out.println(count(n)); 
    }

    public static String count(int n){

        if( n == 1) return "1";

        String remaining = count(n-1);
        StringBuilder res = new StringBuilder();

        for( int i = 0; i < remaining.length() ; i++){

            int count = 1;

            while( i < remaining.length()-1 && remaining.charAt(i) == remaining.charAt(i+1)){

                count++;
                i++;
            }

            res.append(""+count+remaining.charAt(i));
        }

        return res.toString();
    }
    
}
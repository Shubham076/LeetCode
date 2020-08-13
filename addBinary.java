public class addBinary {

    public static void main(String[] args) {
        
        String a = "11";
        String b = "1";

        System.out.println(add(a , b));
    }

    public static String add(String a  ,  String b){

        int carry = 0;
        int sum = 0;
        StringBuilder sb  = new StringBuilder();
        int i  = a.length() -1;
        int j = b.length() -1;

        while( i >= 0 || j >= 0){

            sum = carry;

            if( i >= 0){
                sum += a.charAt(i--) - '0';
            }

            if( j >= 0){
                sum += b.charAt(j--) - '0';
            }

            sb.insert(0, sum % 2);

            carry  = sum / 2;
        }

        if(carry > 0){
            sb.insert(0, 1);
        }

        return sb.toString();
    }
    
}
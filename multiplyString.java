public class multiplyString {

    public static void main(String[] args) {

        String num1 = "10";
        String num2 = "55";

        // if (num1.charAt(0) == '0' || num2.charAt(0) == '0') {
        //     System.out.println("0");
        //     return;
        // }
        
        multiply(num1, num2);


    }

    // using recursion nomal multiplication
    public static int Multiply(int num1  , int num2){

        if( num2 == 0){
            return 0;

        }

        if( num2 > 0){
            return num1 + Multiply(num1, num2 -1);
        }

        // in case num2 is negative
        if( num2 <  0){
            return -Multiply(num1, -num2);
        }

        return -1;
    }

    public static void multiply(String num1 , String  num2){

        
        int[] val = new int[num1.length() + num2.length()];
        StringBuilder prod = new StringBuilder();

        for (int i = num1.length() - 1; i >= 0; i--) {

            for (int j = num2.length() - 1; j >= 0; j--) {

                int mul = (num1.charAt(i) - '0') * (num2.charAt(j) - '0');
                int sum = val[i + j + 1] + mul;
                val[i + j] += sum / 10;
                val[i + j + 1] = sum % 10;
            }
        }

        for(int i :val){
            System.out.print(i+" ");
        }

        for (int i = 0; i < val.length; i++) {

            if (val[i] != 0 || prod.length() !=0 ) {
                prod.append(val[i]);
            }
                
            

        }

        System.out.println(prod.toString());

    }

}
public class divideTwoIntegers {

    public static void main(String[] args) {
        
        System.out.println(divide(-2147483648,2));
    }

    public static int divide(int divident , int divisor){

        if(divident == Integer.MIN_VALUE && divisor == -1) return Integer.MAX_VALUE;
        if(divisor == 1) return divident;

        int sign = 1;
        int quotient = 0;
        if(divident < 0 ^ divisor < 0){

            sign = -1;
        }

       

        divisor = Math.abs(divisor);
        divident = Math.abs(divident);


        while( divident - divisor >= 0){
            divident -= divisor;
            quotient++;
        }

        return (sign * quotient);
    }
    
}
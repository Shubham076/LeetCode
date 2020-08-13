public class Pow {

    public static void main(String[] args) {
        
        double x =2.00000;
        int n = -2;

        
        System.out.println(power(x , n)); 
    }

    public static double power(double x , int n){

        if( n == 0){
            return 1.00000;
        }

        double power = power(x , n /2); 
        
        if(n % 2 == 0){
            return power * power;
        }
        else{

            if( n > 0){
                return power * power * x;
            }

            else{

                return  (power * power)/x ;
            }

        
        }

    } 
    
}
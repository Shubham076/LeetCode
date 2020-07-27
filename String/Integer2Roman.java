public class Integer2Roman {

    public static void main(String[] args) {

        int num = 2249;

        String[] I =  {"" , "I","II","III","IV","V","VI","VII","VIII","IX"};
        String[] X =  {"","X","XX","XXX","XL","L","LX","LXX","LXXX","XC"};
        String[] C =  {"","C","CC","CCC","CD","D","DC","DCC","DCCC","CM"};
        String[] M = {"","M","MM","MMM"};
        
        String ans = M[num / 1000] + C[(num % 1000) / 100] + X[(num % 100) / 10] + I[num%10];
        System.out.println(ans); 
    }
    
}
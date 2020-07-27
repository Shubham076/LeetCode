public class zigzag {
    public static void main(String[] args) {

        String s = "PAYPALISHIRING";
        int rows = 3;
        StringBuilder[] sb = new StringBuilder[rows];
    
    // create four strings
        for(int i =0 ; i<rows ; i++){

            sb[i] = new StringBuilder();

        }


    int i = 0;
    while(i < s.length()){

        for(int index=0; index<rows && i<s.length() ; index++){

            sb[index].append(s.charAt(i++));
            // for vertically down
        }

        for(int index = rows-2 ; index >=1 && i< s.length() ; index--){

            sb[index].append(s.charAt(i++));
            // for obliquely up
            // why rows-2 see the example in the question
        }
    }




    for(int j=1 ; j<rows ; j++){
        sb[0].append(sb[j]);
    }


    String ans = sb[0].toString();

    System.out.println(ans);



    }

    
    
}
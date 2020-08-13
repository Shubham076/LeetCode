public class longestCommonPrefix {

    public static void main(String[] args) {
        
        String[] strs = {"flower" , "flow" , "light"};

        int index = 0;



        for(int i =0 ; i<strs[0].length() ; i++){
            Character c = strs[0].charAt(i);

            for(String s :strs){


                // if out of any of the three strings if characters doesnt match we stop as it is no longer a prefix 
                if(i >= s.length() || s.charAt(i) != c){
                    System.out.println(strs[0].substring(0,index)+" "+index);
                    return;

                    
                }

            }

            index++;
        }
        System.out.println(strs[0].substring(0,index));


        

        
    }
    
}
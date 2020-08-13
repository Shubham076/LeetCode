/**
 * stringtoInt
 */
public class stringtoInt {

    public static void main(String[] args) {

        String s = "  -34646hchfu461  hello 752";
        System.out.println(convert(s));
    }

    public static int ascii(Character s) {
        int ascii = (int) s;

        return ascii;
    }

    public static int convert(String str) {

        String s = str.trim();
        boolean negative = false;
        long out = 0;

        // for empty string
        if (s.isEmpty()) {
            return 0;
        }

        // for checking the positive or negative sign
        if (s.charAt(0) == '-') {
            negative = true;
        }

        else if (s.charAt(0) == '+') {
            negative = false;
        }

        // first character is non digit
        else if (!Character.isDigit(s.charAt(0))) {
            return 0;
        }

        else {

            out = ascii(s.charAt(0)) - ascii('0');
            // eg = ascii value of '0' = 48 ascii value of '1' = 49; 49-48 = 1

        }

        for (int i = 1; i < s.length(); i++) {

            if (Character.isDigit(s.charAt(i))) {
                out = out * 10 + (ascii(s.charAt(i)) - ascii('0'));

                // checkoing the boundary condition
                if (!negative && out > Integer.MAX_VALUE) {
                    return Integer.MAX_VALUE;
                }

                if (negative && out > Integer.MAX_VALUE) {
                    return Integer.MIN_VALUE;
                }

            }

            else {
                break;
            }
        }

        if (negative) {
            return (int) (-1 * out);
        }

        else {
            return (int) out;
        }

    }

}
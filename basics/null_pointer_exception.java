import java.io.*;

class EXCP {

    public static void main(String[] args) {

        String s = "";   // empty string

        try {
            System.out.println(getLength(s));
        } 
        catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException caught");
        }

        s = "GeeksforGeeks";

        // normal value
        try {
            System.out.println(getLength(s));
        } 
        catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException caught");
        }

        // null case
        s = null;
        try {
            System.out.println(getLength(s));
        } 
        catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException caught");
        }
    }

    // function that throws exception if string is null
    public static int getLength(String s) {
        if (s == null) {
            throw new IllegalArgumentException("Argument cannot be null");
        }
        return s.length();
    }
}

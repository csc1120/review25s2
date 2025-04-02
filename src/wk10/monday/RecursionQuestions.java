package wk10.monday;

public class RecursionQuestions {

    /**
     * Checks if the passed in String contains no digit
     * characters. An empty String should return true.
     * @param str String to test
     * @return true if the passed in String contains
     * no digit characters, else false
     */
    public static boolean noDigits(String str){
        //base
        if(str.isEmpty()){
            return true;
        } else {
            if(Character.isDigit(str.charAt(0))){
                return false;
            } else {
                return noDigits(str.substring(1));
            }
        }

        //recursive case
    }

    /**
     * Checks if the passed in String is a palindrome. A
     * String of length 1 or less should return true.
     * @param str String to check
     * @return true if the passed in String is a palindrome
     */
    public static boolean palindrome(String str){
        //base case
        if(str.length() <= 1){
            return true;
        } else {
            if(str.charAt(0) == str.charAt(str.length() - 1)){
                return palindrome(str.substring(1, str.length() - 1));
            } else {
                return false;
            }
        }
    }


}

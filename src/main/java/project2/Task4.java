package project2;
/*Check if a String is Palindrome: Determine whether a given string is a
palindrome, which means it reads the same forwards and backward. For
example, "madam" is a palindrome.*/
public class Task4 {
    public static void main(String[] args) {
        String str="Madam", revStr="";
       int  StringLength=str.length();
        for (int i =StringLength-1 ; i>=0 ; i--) {
            revStr = revStr + str.charAt(i);
        }
            if(str.equalsIgnoreCase(revStr)){
                System.out.println(str+" word is palindrome");

            }else{
                System.out.println(str +" word is not palindrome");
            }

        }

    }


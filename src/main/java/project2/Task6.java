package project2;

//Create a method to count how many vowels are present in a string
//“documentation".
public class Task6 {
    public static void main(String[] args) {
        String str = "documentation";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' ||
                    str.charAt(i) == 'o' || str.charAt(i) == 'u') {

                System.out.println(str.charAt(i));
            }
        }
    }
}

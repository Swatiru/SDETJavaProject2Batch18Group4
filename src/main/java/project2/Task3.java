package project2;

public class Task3 {
    public static void main(String[] args) {
        String str="Hello";
        String reverseStr="";
        System.out.println("original string: Hello");
        for (int i = 0; i <str.length() ; i++) {
            reverseStr=str.charAt(i)+reverseStr;

        }
        System.out.println("Reversed string: "+reverseStr);

    }
}

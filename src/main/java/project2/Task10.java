package project2;

import java.util.ArrayList;

//How can you remove all duplicates from ArrayList?
public class Task10 {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("marisa");
        names.add("poorna ");
        names.add("damala");
        names.add("damala");
        names.add("kamla");
        System.out.println("Before removal: "+names);
        for (int i = 0; i < names.size(); i++) {
            for (int j = i + 1; j < names.size(); j++) {
                if (names.get(i) == names.get(j)) {
                    names.remove(j);
                    System.out.println("after removal duplicate: "+names);
                }

            }
        }
    }}

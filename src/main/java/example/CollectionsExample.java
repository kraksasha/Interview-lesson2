package example;

import java.util.ArrayList;

public class CollectionsExample {
    public static void main(String[] args) {
        ArrayListOverride<String> listOverride = new ArrayListOverride<>();
        listOverride.add("jgdkhgd");
        listOverride.add("fdjgkdgd");
        listOverride.add("hjfshfngjnsmlkfs");
        listOverride.add("fhjjnf");
        listOverride.remove(1);
        for (int i = 0; i < listOverride.size(); i++){
            System.out.println(listOverride.get(i));
        }
    }
}

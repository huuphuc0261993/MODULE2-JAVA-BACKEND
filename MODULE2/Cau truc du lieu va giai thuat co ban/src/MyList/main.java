package MyList;

import java.util.Arrays;

public class main {
    public static <E> void main(String[] args) {
         MyList<Integer>listInteger = new MyList<Integer>();
         listInteger.add(2);
         listInteger.add(3);
        System.out.println(listInteger.get(0));

    }
}

package nnn;

import java.util.Arrays;

public class ArrayTest {

    public static void main(String[] args) {

        String[] arr = {"a", "timestamp", "nonce"};
        Arrays.sort(arr);
        for (String str : arr) {
            System.out.println(str);

        }
    }
}



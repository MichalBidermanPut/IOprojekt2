package pl.put.poznan.transformer.logic;

import java.util.Arrays;

public class ArrToStringJson extends Object {
    public static String wrapper(String[] input){
        for (int i = 0; i < input.length; i++) {
            input[i] = "\"" + input[i] + "\"";
        }
        return Arrays.toString(input);
    }
}

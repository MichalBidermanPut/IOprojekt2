package pl.put.poznan.transformer.logic;

public class CountStepsRequest implements IRequest{

    public static String getName() {
        return "policzkroki";
    }

    @Override
    public String run(String[] input) {
        return "\"" + "Ilosc krokow jest rowna " + Integer.toString(input.length) + "\"";
    }
}

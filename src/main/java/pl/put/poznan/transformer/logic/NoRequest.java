package pl.put.poznan.transformer.logic;

public class NoRequest implements IRequest {
    public String getName(){return "unknownrequest";}
    @Override
    public String run(String[] input) {
        return "\"Method not found\"";
    }
}

package pl.put.poznan.transformer.logic;

public interface IRequest {
    public static IRequest getRequest(String requestName, String[] data){
        if(CountStepsRequest.getName() == "policzkroki" && data[0] != "__GET__")
            return new CountStepsRequest();
        return new NoRequest();
    }
    public String run(String[] input);
}

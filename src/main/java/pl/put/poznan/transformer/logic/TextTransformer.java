package pl.put.poznan.transformer.logic;

import java.util.Arrays;

/**
 * This is just an example to show that the logic should be outside the REST service.
 */
public class TextTransformer {
    private final String[] scenariusz;

    public TextTransformer(String[] scenariusz){
        this.scenariusz = scenariusz;
    }

    public String transform(String command){
        String ans = IRequest.getRequest(command, scenariusz).run(scenariusz);
        return "{ \"scenario\" : " + ArrToStringJson.wrapper(scenariusz) + ", \"response\" : " + ans + "}";
    }
    public static final String tab = ">";
}

package com.example.next.databinding;

/**
 * Created by next on 17/3/17.
 */
public class DatabindingHelper {
    private  String  salulation;

    public DatabindingHelper(String salulation) {
        this.salulation = salulation;
    }


    public static DatabindingHelper get(String salulation)
    {
        return new DatabindingHelper(salulation);
    }

    public  String message(){
        return String.format("hi",salulation);
    }
}

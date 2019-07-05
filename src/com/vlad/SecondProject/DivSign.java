package com.vlad.SecondProject;

public class DivSign implements PartOfLanguage {


    private String divSign;



    public String getSDivign() {
        return divSign;
    }

    public void setDivSign(String divSign) {
        this.divSign = divSign;
    }

    public DivSign(String divSign) {
        this.divSign = divSign;
    }

    @Override
    public String get() {
        return divSign;
    }
}

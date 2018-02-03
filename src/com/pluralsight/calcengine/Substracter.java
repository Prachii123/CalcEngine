package com.pluralsight.calcengine;

public class Substracter extends CalculateBase {

    public Substracter() {}

    public Substracter(double leftVal, double rightVal) {
        super(leftVal, rightVal);
    }

    @Override
    public void calculate(){
        setResult(getLeftVal() - getRightVal());
    }
}

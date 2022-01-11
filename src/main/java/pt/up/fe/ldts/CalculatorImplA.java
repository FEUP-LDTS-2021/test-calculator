package pt.up.fe.ldts;

import pt.up.fe.ldts.exceptions.NotImplementedException;

public class CalculatorImplA implements Calculator {

    private int val = 0;

    public CalculatorImplA(int val) {
        this.val = val;
    }

    @Override
    public int adds(int x) throws NotImplementedException {
        this.val += x;
        return this.val;
    }

    @Override
    public int subtracts(int x) throws NotImplementedException {
        throw new NotImplementedException("adds not implemented yet");
    }

    @Override
    public int getVal() {
        return val;
    }
}

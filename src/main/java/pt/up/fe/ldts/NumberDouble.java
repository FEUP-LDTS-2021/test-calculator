package pt.up.fe.ldts;

import pt.up.fe.ldts.exceptions.NotImplementedException;

public class NumberDouble implements NumberOps<Double> {

    private Double val = Double.valueOf(0);

    public NumberDouble(Double val) {
        this.val = val;
    }

    @Override
    public Double adds(Double x) throws NotImplementedException {
        this.val += x;
        return this.val;
    }

    @Override
    public Double subtracts(Double x) {
        for (int i  = 0; i < x; i++) {
            this.val--;
        }
        return this.val;
    }

    @Override
    public Double getVal() {
        return val;
    }
}

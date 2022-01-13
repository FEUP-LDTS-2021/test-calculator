package pt.up.fe.ldts;

import pt.up.fe.ldts.exceptions.NotImplementedException;

public class NumberInt implements NumberOps {

    private int val = 0;

    public NumberInt(int val) {
        this.val = val;
    }

    @Override
    public int adds(int x) {
        this.val += x;
        return this.val;
    }

    @Override
    public int getVal() {
        return val;
    }
}

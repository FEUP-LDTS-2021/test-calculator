package pt.up.fe.ldts;

import pt.up.fe.ldts.exceptions.NotImplementedException;

public class NumberInt implements NumberOps<Integer> {

    private Integer val = 0;

    public NumberInt(Integer val) {
        this.val = val;
    }

    @Override
    public Integer adds(Integer x) throws NotImplementedException {
        this.val += x;
        return this.val;
    }

    @Override
    public Integer subtracts(Integer x) {
        for (int i  = 0; i < x; i++) {
            this.val--;
        }
        return this.val;
    }

    @Override
    public Integer getVal() {
        return val;
    }
}

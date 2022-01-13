package pt.up.fe.ldts;

import pt.up.fe.ldts.exceptions.NotImplementedException;

public interface NumberOps<Number> {

    public Number adds(Number x) throws NotImplementedException;

    public Number subtracts(Number x);

    public Number getVal();
}

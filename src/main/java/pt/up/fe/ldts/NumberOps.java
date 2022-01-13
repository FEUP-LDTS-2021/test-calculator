package pt.up.fe.ldts;

import pt.up.fe.ldts.exceptions.NotImplementedException;

public interface NumberOps<T> {

    public T adds(T x) throws NotImplementedException;

    public T subtracts(T x);

    public T getVal();
}

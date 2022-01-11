package pt.up.fe.ldts;

import pt.up.fe.ldts.exceptions.NotImplementedException;

public interface Calculator {

    public int adds(int x) throws NotImplementedException;

    public int subtracts(int x) throws NotImplementedException;

    public int getVal();
}

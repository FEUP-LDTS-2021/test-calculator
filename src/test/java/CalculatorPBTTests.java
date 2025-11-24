import net.jqwik.api.*;
import net.jqwik.api.constraints.Negative;
import net.jqwik.api.constraints.NotEmpty;
import net.jqwik.api.constraints.Positive;
import pt.up.fe.ldts.NumberInt;
import pt.up.fe.ldts.NumberOps;

import java.util.ArrayList;
import java.util.List;

public class CalculatorPBTTests {

    @Property
    public void testSumAssociativity(@ForAll int a, @ForAll int b, @ForAll int c) {
        //System.out.println(a + " " + b + " " + c);
        assert((a + b) + c == a + (b + c));
    }

    @Property
    public void testNullAssociativity(@ForAll int a) {
        assert(a + 0 == a);
        assert(0 + a == a);
        assert(0 + a == a + 0);
    }

    @Property(tries = 10)
    public void testDoubleReverse(@ForAll @NotEmpty List<@Positive Integer> list) {
        assert(reverseList(reverseList(list)).equals(list));
    }

    public <T> List<T> reverseList(List<T> list) {
        ArrayList<T> reversed = new ArrayList<>();
        for (T e : list) reversed.add(0, e);
        return reversed;
    }

    @Property
    public void testDivision(@ForAll @Negative int number) {
        assert(1 == number / number);
    }

    @Property
    void testSumSubtraction(@ForAll @Positive int a, @ForAll int b, @ForAll int c) {
        System.out.println(a + " " + b + " " + c);
        assert(a + b == (a-1) + (b+1));
    }

    @Property
    void testNumberIntAssociation(@ForAll int a) {
        NumberOps n = new NumberInt(2);
        assert(n.adds(a) == 2 + a);
    }

    @Property(seed = "1504236546973788414")
    public void testListSumPositive(@ForAll @NotEmpty List<@Positive Integer> list) {
        //System.out.println(list);
        assert(sum(list) > 0);
    }

    private int sum(List<Integer> list) { // this is an implementation, and should not be in the testing classes.
        int sum = 0;
        for (int e : list)
            sum += e;
        return sum;
    }

    @Provide
    Arbitrary<Integer> between_one_and_four() {
        return Arbitraries.of(1, 2, 3, 4);


    }
}

import net.jqwik.api.ForAll;
import net.jqwik.api.Property;

public class CalculatorPBTTests {

    @Property
    public void testSumAssociativity(@ForAll int a, @ForAll int b, @ForAll int c) {
        assert((a + b) + c == a + (b + c));
    }

    @Property
    public void testNullAssociativity(@ForAll int a) {
        assert(a + 0 == a);
    }
}

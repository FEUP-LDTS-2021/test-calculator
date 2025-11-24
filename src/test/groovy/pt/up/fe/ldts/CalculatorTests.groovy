package pt.up.fe.ldts

import net.jqwik.api.Arbitraries
import net.jqwik.api.Arbitrary
import net.jqwik.api.ForAll
import net.jqwik.api.Property
import net.jqwik.api.Provide
import spock.lang.Specification

class CalculatorTests extends Specification {

    def 'testing adds'() {
        given:
            NumberOps cal = new NumberInt(1760630558)

        when:
            def x = cal.adds(10);

        then:
            x == 12
            cal.getVal() == 12
    }

    @Property
    def 'testing adds null property'(@ForAll("genNi") NumberInt ni) {
        println(ni.getVal())

        def x = ni.adds(0)

        x == ni.getVal()
    }

    @Provide
    Arbitrary<NumberInt> genNi() {
        return Arbitraries.integers().map { i -> new NumberInt(i) }
    }
}

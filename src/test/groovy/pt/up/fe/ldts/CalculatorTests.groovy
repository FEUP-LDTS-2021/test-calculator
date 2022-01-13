package pt.up.fe.ldts

import spock.lang.Specification

class CalculatorTests extends Specification {

    def 'testing adds'() {
        given:
            NumberOps cal = new NumberInt(2)

        when:
            def x = cal.adds(10);

        then:
            x == 12
            cal.getVal() == 12
    }

    def 'testing subtracting'() {
        given:
        NumberOps cal = new NumberInt(2)

        when:
        def x = cal.subtracts(10);

        then:
        x == -8
        cal.getVal() == -8
    }

    def 'testing subtracting 0'() {
        given:
        NumberOps<Integer> cal = new NumberInt(2)

        when:
        def x = cal.subtracts(0);

        then:
        x == 2
        cal.getVal() == 2
    }
}

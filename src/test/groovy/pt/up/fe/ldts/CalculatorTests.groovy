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
}

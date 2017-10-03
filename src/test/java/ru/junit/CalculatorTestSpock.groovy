package ru.junit

import org.springframework.beans.factory.annotation.Autowired
import spock.lang.Shared
import spock.lang.Specification

/**
 * Created by Ник on 02.10.2017.
 */
class CalculatorTestSpock extends Specification {

    @Autowired
    Calculator calculator;

    def "GetSum"() {
        then:
        calculator.getSum(x,y)

        where:
        x | y
        1 | 1
        2 | 3

    }

    def "GetDegree"() {
        calculator.getDegree(15,4)
    }

    def "GetMultiplaction"() {
        calculator.getMultiplaction(4,5)
    }
}

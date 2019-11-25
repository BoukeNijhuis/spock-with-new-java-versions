package com.example

import spock.lang.Specification

class ApplicationTest extends Specification {

    void "test the isEven method"() {
        expect:
        new Application().isEven(input) == result
        where:
        input | result
        0     | true
        1     | false
        2     | true
    }
}

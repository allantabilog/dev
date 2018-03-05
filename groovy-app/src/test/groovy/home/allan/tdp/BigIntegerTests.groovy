package home.allan.tdp

import spock.lang.Specification

class BigIntegerTests extends Specification {
    def "test arithmetic with BigInteger"() {
        expect:
        BigInteger.TEN.add(BigInteger.ONE).equals(new BigInteger("11"))

        def n = new BigInteger("11001")

        println n.mod(BigInteger.TEN)
        println n.bitCount()
    }
}

package home.allan.tdp

class GroovyFibs {
    /**
     * TODO:
     * 1/ serialize the fibStore map
     * 2/ Use another datatype other than Long - this overflows.
     *  2a/ How does overflow work?
     *  2b/ What is a suitable datatype for storing the fibs?
     * 3/ How does BigInteger work? What sort of (practice, real-world) calculations can be done with BigInteger?
     *          How expensive are BigInteger calculations?
     *          See also:
     *          https://www.geeksforgeeks.org/large-fibonacci-numbers-java/
     *          https://www.geeksforgeeks.org/quick-ways-to-check-for-prime-and-find-next-prime-in-java/
     *          . and also look for some real-world uses of Fibonacci numbers
     *4/ Funky extensions
     *  - store the fibs in a NoSQL db ? (why???)
     *  - simulate multiple threads doing various Fib queries
     */
    static Map<BigInteger, BigInteger> fibStore = [(BigInteger.ONE): (BigInteger.ONE), (new BigInteger("2")): (BigInteger.ONE)]

    static void main(String[] args) {
        GroovyFibs gfibs = new GroovyFibs()
        gfibs.preCalculate(new BigInteger("100"))
        println fibStore.values()

    }

    void preCalculate(BigInteger N) {
        def index = new BigInteger("3")
        while (index.compareTo(N) == -1 || index.compareTo(N) == 0) {
            fibStore[index] = fibStore[index.subtract(1)].add(fibStore[index.subtract(2)])
            index = index.add(BigInteger.ONE)
        }

    }
}

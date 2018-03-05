package home.allan.numeric

List<Integer> factorise(Integer n) {
    def factors = []
    def divisor = 2

    while (n > 1) {
        if (n % divisor == 0) {
            factors << divisor
            n = (n / divisor) as Integer
        } else {
            divisor = divisor + 1
        }
    }
    return factors
}

void mainLoop() {
    println '*** Factorisation Algorithms Demo: Trial Division ***'
    def input = 0
    def reader = System.in.newReader()
    while (input != -1) {
        println "Enter a number to factorise (-1 to exit): "
        input = reader.readLine() as Integer
        if (input == -1) continue
        def factors = factorise(input).join(' x ')
        println "Factors of $input: $factors"
    }
    println "Thank you for using the factorisation program"

}

mainLoop()
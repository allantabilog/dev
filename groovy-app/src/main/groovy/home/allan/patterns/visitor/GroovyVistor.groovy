package home.allan.patterns.visitor

class GroovyVistor implements Runnable {

    void visit(Collection collection) {
        collection.each { elem ->
            visit(elem)
        }
    }

    void visit(A x) {
        println 'visiting A'
    }

    void visit(B x) {
        println 'visiting B'
    }

    void visit(C x) {
        println 'visiting C'
    }

    @Override
    void run() {
        visit([new A(), new B(), new C()])
    }

    public static void main(String[] args) {
        new GroovyVistor().run()
    }
}

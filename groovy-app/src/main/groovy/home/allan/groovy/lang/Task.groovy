package home.allan.groovy.lang

class Task {
    void apply(Map params) {
        println "Applying plugin ${params.plugin} version ${params.version}"
        println "All params: "
        params.each { key, value -> println "$key: $value" }
    }


    static void main(String[] args) {
        def task = new Task()
        task.apply plugin: 'java', version: '0.01', provider: 'amtabilog@yahoo.com', region: 'VIC'
    }
}



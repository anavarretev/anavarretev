package suma

import spock.lang.Specification

class ExampleSpec extends Specification {

    def "Sumar 2 numeros enteros"() {

        given: "Los dos numeros son 4 y 7"
        int a = 4
        int b = 7

        when:"Estos numero se deben Suma"

        int c = a+b

        then:"El resultado tiene que ser 11"

        c == 11
    }
}

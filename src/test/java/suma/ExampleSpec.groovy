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

    def "HashMap accepts null key"() {
        given:
        def map = new HashMap()

        when:
        map.put(null, "elem")

        then:
        //notThrown(NullPointerException)
        map == null
    }

    def "Par o impar"() {

        when:
             int result = b % 2
        then:
        result == 0

        where:
        a  | b
        2  | 2
        4  | 4
        6  | 6
        8  | 8
        10 | 10
    }

    def "Redondear según criterio"() {

        when:
        long redondeado = Math.round(10.4);

        then:
         redondeado == 10
    }


}


const val ADDITION = 1
const val SUBTRACTION = 2
const val MULTIPLICATION = 3
const val DIVISION = 4
const val REST = 5

fun main() {
    calculadora(21F, 10F, ADDITION)
    calculadora(21F, 10F, REST)

    val pi = 3.14159265358979323
    val formatted = "Pi: %.2f".format(pi)
    print(formatted)
}

fun calculadora (x:Float?, y:Float?, operation:Int):Float? {
    if (x == null) {
        println("\"x\" está nulo!")
        return null
    }
    if (y == null) {
        println("\"y\" está nulo!")
        return null
    }
    val resulted:Float? =
        when(operation) {
            ADDITION -> x!! + y!!
            SUBTRACTION -> x!! - y!!
            MULTIPLICATION -> x!! * y!!
            DIVISION -> x!! / y!!
            REST -> x!! % y!!
            else -> 0F
    }
    println (resulted)
    return resulted
}
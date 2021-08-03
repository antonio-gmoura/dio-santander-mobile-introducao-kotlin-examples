fun main() {
    whenExample()
    elvisOperatorExample()
}

fun whenExample() {
    println("-------------")
    println("Example: when")

    val grade = (0..10).random();
    println	(grade.getStudentStatus())

    println()
}

fun Int.getStudentStatus():String {
    println	("nota $this")

    return when(this) {
        in 0..4 -> "Reprovado"
        in 5..7 -> "Mediano"
        in 8..9 -> "Bom"
        10 -> "Excelente"
        else -> "Indefinido"
    }

    println()
}

fun elvisOperatorExample() {
    println("-----------------------")
    println("Example: Elvis operator")

    var t:Int
    var x:Int? = null
    var w:Int? = 10

    t = if (x != null) x else if (w != null) w else -1
    println(t)

    t = x ?: w ?: -1
    println(t)
}
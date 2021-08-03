fun main() {
    inExample()
    untilExample()
    downToExample()
    stepExample(1)
    inEachExample()
}

fun inExample() {
    println("-----------")
    println("Example: in")
    for (i in 0..20) {
        print("$i ")
    }
    println();
}

fun untilExample() {
    println("--------------")
    println("Example: until")
    for (i in 0 until 21) {
        print("$i ")
    }
    println()
}

fun downToExample() {
    println("---------------")
    println("Example: downTo")
    for (i in 20 downTo 0) {
        print("$i ")
    }
    println()
}

fun stepExample(num:Int) {
    println("-------------")
    println("Example: step")
    for (i in 0..20 step num) {
        print("$i ")
    }
    println()
}

fun inEachExample() {
    println("----------------")
    println("Example: in each")
    val string1 = "Kotlin Koans"
    for (l in string1) {
        print(l.uppercase() + " ")
    }
    println()
    string1.forEach { a -> print(a.uppercase() + " ") }
    println()
}

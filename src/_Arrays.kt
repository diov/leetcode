fun <T> Array<T>.printContent() {
    println(this.joinToString(prefix = "[", postfix = "]"))
}

fun IntArray.printContent() {
    println(this.joinToString(prefix = "[", postfix = "]"))
}

fun BooleanArray.printContent() {
    println(this.joinToString(prefix = "[", postfix = "]"))
}

fun Array<IntArray>.printlnMatrix() {
    forEach { it.printContent() }
}

fun Array<Any>.printContent() {
    println(this.joinToString(prefix = "[", postfix = "]"))
}

fun IntArray.printContent() {
    println(this.joinToString(prefix = "[", postfix = "]"))
}

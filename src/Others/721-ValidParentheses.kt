import java.util.*

fun main() {
    val s = "{[]}["
    println(isValid2(s))
}

fun isValid1(s: String): Boolean {
    val stack = LinkedList<Char>()
    s.forEach {
        when {
            it == '{' || it == '(' || it == '[' -> stack.add(it)
            stack.isEmpty() -> return false
            it == '}' && stack.last == '{' -> stack.removeLast()
            it == ')' && stack.last == '(' -> stack.removeLast()
            it == ']' && stack.last == '[' -> stack.removeLast()
            else -> return false
        }
    }
    return stack.isEmpty()
}

fun isValid2(s: String): Boolean {
    var cursor = 0
    val stack = CharArray(s.count())
    s.forEach {
        when {
            it == '{' || it == '(' || it == '[' -> {
                stack[cursor] = it
                cursor++
            }
            cursor == 0 -> {
                return false
            }
            it == '}' && stack[cursor - 1] == '{' -> cursor--
            it == ')' && stack[cursor - 1] == '(' -> cursor--
            it == ']' && stack[cursor - 1] == '[' -> cursor--
            else -> {
                return false
            }
        }
    }
    return cursor == 0
}

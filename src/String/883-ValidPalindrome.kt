fun main(args: Array<String>) {
    val s = "0P"
    println(isPalindrome(s))
}

fun isPalindrome(s: String): Boolean {
    if (s.isEmpty()) return true
    var i = 0
    var j = s.count() - 1

    while (i <= j) {
        if (!s[i].isLetterOrDigit()) {
            i++
            continue
        }
        if (!s[j].isLetterOrDigit()) {
            j--
            continue
        }
        if (s[i].toLowerCase() == s[j].toLowerCase()) {
            i++
            j--
            continue
        } else {
            return false
        }
    }
    return true
}

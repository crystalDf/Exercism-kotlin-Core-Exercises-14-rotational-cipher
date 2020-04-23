class RotationalCipher(private val key: Int) {

    fun encode(text: String): String =
            text.map {
                when (it) {
                    in 'A'..'Z' -> 'A' + (it - 'A' + key) % 26
                    in 'a'..'z' -> 'a' + (it - 'a' + key) % 26
                    else -> it
                }
            }.joinToString("")
}

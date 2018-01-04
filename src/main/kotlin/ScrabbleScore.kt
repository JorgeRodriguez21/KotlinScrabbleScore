object ScrabbleScore {

    val onePointLetters = arrayOf("A", "E", "I", "O", "U", "L", "N", "R", "S", "T")

    val twoPointLetters = arrayOf("D", "G")

    val threePointLetters = arrayOf("B", "C", "M", "P")

    val fourPointLetters = listOf("F", "H", "V", "W", "Y")

    val fivePointLetters = listOf("K")

    val eightPointLetters = listOf("J", "X")

    val tenPointLetters = listOf("Q", "Z")


    fun scoreWord(input: String): Int {
         return input.split("").map { getValuesForEachLetter(it.toUpperCase())}.sum()
    }

    private fun getValuesForEachLetter(letter: String): Int = when (letter) {
        in (onePointLetters) -> 1
        in (twoPointLetters) -> 2
        in (threePointLetters) -> 3
        in (fourPointLetters) -> 4
        in (fivePointLetters) -> 5
        in (eightPointLetters) -> 8
        in (tenPointLetters) -> 10
        else -> 0
    }

}
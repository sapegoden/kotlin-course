class Luhn {
}

fun isValidLuhn(number: String): Boolean {
    // Remove spaces and check if the cleaned string is valid
    val cleanedNumber = number.replace(" ", "")
    if (cleanedNumber.length <= 1 || !cleanedNumber.all { it.isDigit() }) {
        return false
    }

    // Apply Luhn algorithm
    val sum = cleanedNumber
        .reversed()
        .mapIndexed { index, char ->
            val digit = char.toString().toInt()
            if (index % 2 == 1) { // Double every second digit
                val doubled = digit * 2
                if (doubled > 9) doubled - 9 else doubled
            } else {
                digit
            }
        }.sum()

    // Check if sum is divisible by 10
    return sum % 10 == 0
}

fun main() {
    val validNumber = "4539 3195 0343 6467"
    val invalidNumber = "8273 1232 7352 0569"

    println("Is '$validNumber' valid? ${isValidLuhn(validNumber)}")
    println("Is '$invalidNumber' valid? ${isValidLuhn(invalidNumber)}")
}

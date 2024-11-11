class `Nucleotide Count` {
}

fun countNucleotides(dnaSequence: String): Map<Char, Int>? {
    // Check for invalid characters
    if (!dnaSequence.all { it in "ACGT" }) {
        println("Error: Invalid DNA sequence.")
        return null
    }

    // Initialize counts for each nucleotide
    val nucleotideCounts = mutableMapOf('A' to 0, 'C' to 0, 'G' to 0, 'T' to 0)

    // Count each nucleotide
    for (nucleotide in dnaSequence) {
        nucleotideCounts[nucleotide] = nucleotideCounts.getValue(nucleotide) + 1
    }

    return nucleotideCounts
}

fun main() {
    val dnaSequence = "GATTACA"
    val invalidSequence = "INVALID"

    val result = countNucleotides(dnaSequence)
    result?.let {
        println("Counts for '$dnaSequence': $it")
    }

    val invalidResult = countNucleotides(invalidSequence)
    invalidResult?.let {
        println("Counts for '$invalidSequence': $it")
    }
}

class DNAtranscription {
}
fun transcribeDnaToRna(dna: String): String {
    return dna.map { nucleotide ->
        when (nucleotide) {
            'G' -> 'C'
            'C' -> 'G'
            'T' -> 'A'
            'A' -> 'U'
            else -> throw IllegalArgumentException("Invalid DNA nucleotide: $nucleotide")
        }
    }.joinToString("")
}

fun main() {
    val dna = "GCTA"
    val rna = transcribeDnaToRna(dna)
    println("RNA complement of DNA $dna is: $rna")
}

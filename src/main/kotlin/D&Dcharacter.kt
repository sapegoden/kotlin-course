import kotlin.random.Random
import kotlin.math.floor


class `D&Dcharacter` {
}



class Character {
    val strength: Int = rollAbilityScore()
    val dexterity: Int = rollAbilityScore()
    val constitution: Int = rollAbilityScore()
    val intelligence: Int = rollAbilityScore()
    val wisdom: Int = rollAbilityScore()
    val charisma: Int = rollAbilityScore()

    val constitutionModifier: Int = calculateModifier(constitution)
    val hitpoints: Int = 10 + constitutionModifier

    private fun rollAbilityScore(): Int {
        val rolls = List(4) { Random.nextInt(1, 7) }
        return rolls.sortedDescending().take(3).sum()
    }

    private fun calculateModifier(score: Int): Int {
        return floor((score - 10) / 2.0).toInt()
    }

    override fun toString(): String {
        return """
            Strength: $strength
            Dexterity: $dexterity
            Constitution: $constitution
            Intelligence: $intelligence
            Wisdom: $wisdom
            Charisma: $charisma
            Constitution Modifier: $constitutionModifier
            Hitpoints: $hitpoints
        """.trimIndent()
    }
}

fun main() {
    val character = Character()
    println("Generated Character:")
    println(character)
}

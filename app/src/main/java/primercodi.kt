class primercodi {
    data class Persona(
        val name: String,
        val age: Int,
        val entreteniments: List<String>
    )

    fun botDeSeguretat(persona: Persona) {
        if (persona.name != "Wael") {
            println("Error: El nom no coincideix, accés denegat.")
            return
        } else {
            println("Nom correcte, accés permès provisionalment...")
        }

        when (persona.age) {
            in 0..17 -> {
                println("Ets menor d’edat (${persona.age}), accés denegat.")
                return
            }
            in 65..100 -> {
                println("Ets massa gran (${persona.age}), accés denegat.")
                return
            }
            in 18..64 -> {
                println("Edat vàlida (${persona.age}), accés confirmat.")
            }
            else -> {
                println("Edat fora de rang vàlid.")
                return
            }
        }

        println("Els teus entreteniments són:")
        for (entret in persona.entreteniments) {
            println("- $entret")
        }
    }

    fun main() {
        val jo = Persona(
            name = "Wael",
            age = 22,
            entreteniments = listOf("Escalada", "Videojocs", "Lectura")
        )
        botDeSeguretat(jo)
    }

}
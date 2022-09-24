package com.example.classesapplication

import android.util.Log

class SomeRandomClass {

    fun somethingShit() {

        val list = getPokeList()

        list.forEach {
            // do this for every pokemon in this list
            val firstName = it.customName

            Log.d("soss", "$firstName -- ${it.type} -- ")

            doPokemonStuff(ourVariable = it)
        }
    }

    private fun getPokeList(): List<Pokemon> {
        // create a pokemon
        val mySillyPokemon = Pokemon(
            actualPokemonName = "Pikachu",
            customName = "My Nigga",
            type = PokemonType.Electric
        )

        val someOtherPokemon = Pokemon(
            actualPokemonName = "Squirtle",
            customName = "My Turtle",
            type = PokemonType.Water
        )

        val mySillyPokemon1 = Pokemon(
            actualPokemonName = "Earthachu",
            customName = "My meho",
            type = PokemonType.Earth
        )

        val someOtherPokemon2 = Pokemon(
            actualPokemonName = "Agumon",
            customName = "Red Lizard",
            type = PokemonType.Fire
        )

        val asdf = Pokemon(
            actualPokemonName = "Human",
            customName = "DeAnthonee",
            type = PokemonType.God
        )

        val sdfadsg = Pokemon(
            actualPokemonName = "Human",
            customName = "Ronny",
            type = PokemonType.God
        )

        val pokeList = ArrayList<Pokemon>()
        pokeList.add(mySillyPokemon)
        pokeList.add(someOtherPokemon)
        pokeList.add(mySillyPokemon1)
        pokeList.add(someOtherPokemon2)
        pokeList.add(asdf)
        pokeList.add(sdfadsg)

        return pokeList
    }

    private fun doBabyStuff(baby: Baby){
        when (baby.sex){
            BabySex.Male -> {}
            BabySex.Female -> {}
        }
    }

    private fun doPokemonStuff(ourVariable: Pokemon) {
        when (ourVariable.type) {
            PokemonType.Electric -> sendPokemonToSpecialRoom(ourVariable)
            PokemonType.Fire -> sendPokemonToHeatRoom(ourVariable)
            PokemonType.Ice -> sendPokemonToPond(ourVariable)
            PokemonType.Water -> sendPokemonToPond(ourVariable)
            PokemonType.Earth -> sendPokemonToTheDark(ourVariable)
            PokemonType.Dark -> sendPokemonToTheDark(ourVariable)
            PokemonType.Grass -> sendPokemonToGarden(ourVariable)
            PokemonType.God -> doGodStuff(ourVariable)
        }

    }

    private fun doGodStuff(ourGod: Pokemon) {

    }


    private fun sendPokemonToPond(pokemon: Pokemon) {
        // do some water stuff
        val theCustomName = pokemon.customName
    }
    private fun sendPokemonToHeatRoom(pokemon: Pokemon) {}
    private fun sendPokemonToGarden(pokemon: Pokemon) {}
    private fun sendPokemonToTheDark(pokemon: Pokemon) {}
    private fun sendPokemonToSpecialRoom(pokemon: Pokemon) {}
}

data class Baby(val name:String, val sex:BabySex, val age:Int)

enum class BabySex{
    Male,
    Female
}

data class Pokemon(
    val actualPokemonName: String,
    val customName: String,
    val type: PokemonType,
)

enum class PokemonType {
    Fire,
    Ice,
    Water,
    Earth,
    Dark,
    Electric,
    Grass,
    God
}
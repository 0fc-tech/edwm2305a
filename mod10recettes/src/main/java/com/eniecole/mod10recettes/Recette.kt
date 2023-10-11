package com.eniecole.mod10recettes

data class Recette(
    val id:Long,
    val nom: String,
    val listIngredients : ArrayList<String>,
    val tpsPreparationH : Float,
    val tpsCuissonH:Float,
    val image : String,
)

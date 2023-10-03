package com.eniecole.tp

//fun main(args: Array<String>) {
//    println("Entrez le nombre de valeurs (entier) : ")
//    val nbreValeurs : Int? = readln().toIntOrNull()
//    if(nbreValeurs == null){
//        println("Un entier ! pas autre chose stp")
//        main(arrayOf())
//    }
//    val arrayValues = arrayListOf<Float>()
//    for(i in 1..nbreValeurs!!) {
//        println("Valeur :")
//        val currentValue = readln().toFloatOrNull()
//        if (currentValue == null){
//            println("Un nombre à virgule! pas autre chose stp")
//            break
//        }
//        arrayValues.add(currentValue)
//    }
//    println("La moyenne est de ${arrayValues.sum()/ nbreValeurs}")
//}


fun main(args: Array<String>){
    var noteInput : Float?
    val arrayValues = arrayListOf<Float>()
    do{
        println("Note (-1 pour terminer) ? ")
        noteInput = readln().toFloatOrNull()
        if(noteInput != null)
            arrayValues += noteInput
    }while (noteInput != -1f && noteInput != null)
    arrayValues -= -1f
    println("La moyenne est de ${arrayValues.sum()/(arrayValues.size)}")
}
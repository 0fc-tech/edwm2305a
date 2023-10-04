package com.eniecole.mod4demobinding

data class Mobilier(
    var nom: String,
    var marque : String,
    var categorie: Categorie,
    var prix: Float
)
val mobiliers = listOf(
    Mobilier("Bureau d'angle", "Ikea", Categorie.BUREAU, 199.99f),
    Mobilier("Chaise de bureau", "Herman Miller", Categorie.CHAISE, 599.99f),
    Mobilier("Table de café", "Wayfair", Categorie.TABLE, 79.99f),
    Mobilier("Canapé", "Ikea", Categorie.ESPACE_DETENTE, 299.99f),
    Mobilier("Tablette murale", "Ikea", Categorie.BUREAU, 19.99f),
    Mobilier("Fauteuil", "La-Z-Boy", Categorie.ESPACE_DETENTE, 349.99f),
    Mobilier("Ordinateur de bureau", "HP", Categorie.INFORMATIQUE, 499.99f),
    Mobilier("Table de salle à manger", "Wayfair", Categorie.TABLE, 239.99f),
    Mobilier("Chaise pliante", "Ikea", Categorie.CHAISE, 24.99f),
    Mobilier("Bureau avec rangements", "Ikea", Categorie.BUREAU, 179.99f),
    Mobilier("Lampe de bureau", "Philips", Categorie.BUREAU, 49.99f),
    Mobilier("Fauteuil gaming", "DXRacer", Categorie.CHAISE, 299.99f),
    Mobilier("Table basse", "Wayfair", Categorie.TABLE, 119.99f),
    Mobilier("Étagère", "Ikea", Categorie.BUREAU, 89.99f),
    Mobilier("Pouf", "Wayfair", Categorie.ESPACE_DETENTE, 55.99f),
    Mobilier("Imprimante", "Canon", Categorie.INFORMATIQUE, 179.99f),
    Mobilier("Bureau compact", "Ikea", Categorie.BUREAU, 129.99f),
    Mobilier("Chaise en rotin", "Wayfair", Categorie.CHAISE, 149.99f),
    Mobilier("Canapé convertible", "Ikea", Categorie.ESPACE_DETENTE, 449.99f),
    Mobilier("Laptop", "Dell", Categorie.INFORMATIQUE, 799.99f),
    Mobilier("Chaise de salle à manger", "Ikea", Categorie.CHAISE, 69.99f),
    Mobilier("Table d'appoint", "Wayfair", Categorie.TABLE, 59.99f),
    Mobilier("Pouf en cuir", "Wayfair", Categorie.ESPACE_DETENTE, 119.99f),
    Mobilier("Station de travail", "Ikea", Categorie.INFORMATIQUE, 299.99f),
    Mobilier("Bureau ajustable", "Steelcase", Categorie.BUREAU, 599.99f),
    Mobilier("Tabouret", "Ikea", Categorie.CHAISE, 34.99f),
    Mobilier("Table de chevet", "Wayfair", Categorie.TABLE, 44.99f),
    Mobilier("Fauteuil inclinable", "La-Z-Boy", Categorie.ESPACE_DETENTE, 699.99f),
    Mobilier("Écran", "Samsung", Categorie.INFORMATIQUE, 249.99f),
    Mobilier("Bureau en verre", "Wayfair", Categorie.BUREAU, 159.99f)
)

enum class Categorie{
    BUREAU, INFORMATIQUE, ESPACE_DETENTE, TABLE, CHAISE
}

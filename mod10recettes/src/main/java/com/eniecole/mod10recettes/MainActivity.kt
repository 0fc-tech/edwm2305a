package com.eniecole.mod10recettes

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val recettes = arrayListOf(
            Recette(
                id = 1,
                nom = "Spaghetti Bolognese",
                listIngredients = arrayListOf("400g de spaghetti", "300g de viande hachée", "1 oignon", "1 gousse d'ail", "400g de coulis de tomate", "Sel", "Poivre", "Huile d'olive", "Parmesan"),
                tpsPreparationH = 0.5f,
                tpsCuissonH = 1f,
                image = "lien_vers_image_spaghetti"
            ),
            Recette(
                id = 2,
                nom = "Pancakes",
                listIngredients = arrayListOf("200g de farine", "2 oeufs", "30g de beurre", "20g de sucre", "1 sachet de sucre vanillé", "1 sachet de levure", "30cl de lait"),
                tpsPreparationH = 0.2f,
                tpsCuissonH = 0.3f,
                image = "lien_vers_image_pancakes"
            ),
            Recette(
                id = 3,
                nom = "Salade César",
                listIngredients = arrayListOf("Laitue romaine", "Blancs de poulet", "Croûtons", "Parmesan", "Sauce César", "Anchovies", "Ail", "Huile d'olive"),
                tpsPreparationH = 0.2f,
                tpsCuissonH = 0.2f,
                image = "lien_vers_image_salade_cesar"
            ),
            Recette(
                id = 4,
                nom = "Brownies",
                listIngredients = arrayListOf("200g de chocolat noir", "150g de sucre", "125g de beurre", "75g de farine", "3 oeufs", "100g de noix"),
                tpsPreparationH = 0.2f,
                tpsCuissonH = 0.4f,
                image = "lien_vers_image_brownies"
            ),
            Recette(
                id = 5,
                nom = "Soupe de Potiron",
                listIngredients = arrayListOf("1 potiron", "2 pommes de terre", "1 oignon", "1 cube de bouillon de légumes", "Crème fraîche", "Sel", "Poivre", "Muscade"),
                tpsPreparationH = 0.3f,
                tpsCuissonH = 0.5f,
                image = "lien_vers_image_soupe_potiron"
            )
        )
        val rv =findViewById<RecyclerView>(R.id.recyclerViewRecettes)
        rv.layoutManager = LinearLayoutManager(this@MainActivity)
        rv.adapter = RecetteAdapter(recettes){recetteClicked->
            print(recetteClicked)
        }


    }
}
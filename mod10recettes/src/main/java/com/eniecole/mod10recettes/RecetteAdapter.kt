package com.eniecole.mod10recettes

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView.Adapter
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.eniecole.mod10recettes.databinding.TemplateRecetteBinding


class RecetteAdapter(val alRecette: ArrayList<Recette>) : Adapter<RecetteAdapter.RecetteVH>(){
    class RecetteVH(val binding: TemplateRecetteBinding) : ViewHolder(binding.root)
    //Est déclenché une seule fois pour créer notre template (réutilisé à chaque recette)
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecetteVH {
        val binding = TemplateRecetteBinding.inflate(
            LayoutInflater.from(parent.context), parent,false
        )
        return RecetteVH(binding)
    }

    //Retourne le nombre de recette à afficher dans ma RecyClerView
    override fun getItemCount(): Int = alRecette.size

    //est déclenché à chaque fois que l'on doit afficher une recette dans la RecyclerView
    override fun onBindViewHolder(holder: RecetteVH, position: Int) {
        val recetteAAfficher = alRecette[position]
        holder.binding.recette = recetteAAfficher
    }
}
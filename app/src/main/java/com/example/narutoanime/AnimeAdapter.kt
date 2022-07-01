package com.example.narutoanime

import android.app.ProgressDialog.show
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso

/**
 * @author Mingaleev D. 01.07.2022
 **/
class AnimeAdapter(
    private val parentActivity: AppCompatActivity,
    private val animes: List<Result>
) : RecyclerView.Adapter<AnimeAdapter.CustomViewHolder>() {

    inner class CustomViewHolder(view: View) : RecyclerView.ViewHolder(view)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.anime_item_layout, parent, false)
        return CustomViewHolder(view)
    }

    override fun onBindViewHolder(holder: CustomViewHolder, position: Int) {
        val anime = animes[position]
        val view = holder.itemView

        val name = view.findViewById<TextView>(R.id.name)
        val image = view.findViewById<ImageView>(R.id.image)

        name.text = anime.title
        Picasso.get().load(anime.imageUrl).into(image)

        view.setOnClickListener {
            AnimeDetailsBottomSheet(anime).apply {
                show(parentActivity.supportFragmentManager, "AnimeDetailsBottomSheet")
            }
        }
    }

    override fun getItemCount(): Int {
        return animes.size
    }
}
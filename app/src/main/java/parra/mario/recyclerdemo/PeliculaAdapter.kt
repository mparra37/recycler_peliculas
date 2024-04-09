package parra.mario.recyclerdemo

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class PeliculaAdapter(private val context: Context, private val peliculaList: List<Pelicula>) : RecyclerView.Adapter<PeliculaAdapter.PeliculaViewHolder>() {

    // ViewHolder class for layout of each item
    class PeliculaViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var imageView: ImageView = itemView.findViewById(R.id.imageView)
        var titulo: TextView = itemView.findViewById(R.id.item_titulo)
        var desc: TextView = itemView.findViewById(R.id.item_desc)
    }

    // Create new views (invoked by the layout manager)
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PeliculaViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.item_vista, parent, false)
        return PeliculaViewHolder(itemView)
    }

    // Replace the contents of a view (invoked by the layout manager)
    override fun onBindViewHolder(holder: PeliculaViewHolder, position: Int) {
        val pelicula: Pelicula = peliculaList[position]
        holder.imageView.setImageResource(pelicula.imagen)
        holder.titulo.text = pelicula.titulo
        holder.desc.text = pelicula.desc
    }

    // Return the size of your dataset (invoked by the layout manager)
    override fun getItemCount() = peliculaList.size
}
package parra.mario.recyclerdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Sample data
        val peliculas = listOf(
            Pelicula(R.drawable.duna, "Duna", "El duque Paul Atreides se une a los Fremen..."),
            Pelicula(R.drawable.godzilla, "Godzilla", "Este es una descripción de godzillla"),
            Pelicula(R.drawable.inception, "Godzilla", "Este es una descripción de inception"),
            Pelicula(R.drawable.interestellar, "Godzilla", "Este es una descripción de interestellar")

            // Add more items here
        )

        val recyclerView = findViewById<RecyclerView>(R.id.lista_vista)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = PeliculaAdapter(this, peliculas)
    }
}
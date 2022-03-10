package br.unifor.cct.solarsystem.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import br.unifor.cct.solarsystem.R
import br.unifor.cct.solarsystem.listener.PlanetItemListener
import br.unifor.cct.solarsystem.model.Planet

class PeopleAdapter(private val planet: List<Planet>): RecyclerView.Adapter<PeopleAdapter.PlanetViewHolder>() {

    class PlanetViewHolder(item: View, listener: PlanetItemListener?): RecyclerView.ViewHolder(item) {

        val mPlanetPhoto: ImageView = item.findViewById(R.id.item_planet_imageview_photo)
        val mPlanetName: TextView = item.findViewById(R.id.item_planet_textview_name)
        val mPlanetDistance: TextView = item.findViewById(R.id.item_planet_textview_distance)

        init {
            item.setOnClickListener {
                listener?.onItemClick(it, adapterPosition)
            }
        }

    }

    private var listener: PlanetItemListener? = null

    fun setOnPlanetListener(listener: PlanetItemListener) {
        this.listener = listener
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PlanetViewHolder {
        val item: View = LayoutInflater.from(parent.context).inflate(R.layout.item_planetlist, parent, false)
        return PlanetViewHolder(item, listener)
    }

    override fun onBindViewHolder(holder: PlanetViewHolder, position: Int) {
        holder.mPlanetPhoto.setImageResource(planet[position].photo)
        holder.mPlanetName.text = planet[position].name
        holder.mPlanetDistance.text = planet[position].distance
    }

    override fun getItemCount(): Int {
        return planet.size
    }
}
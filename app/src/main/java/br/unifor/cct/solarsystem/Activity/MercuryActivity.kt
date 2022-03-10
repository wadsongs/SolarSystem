package br.unifor.cct.solarsystem.Activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import br.unifor.cct.solarsystem.R
import br.unifor.cct.solarsystem.listener.PlanetItemListener
import br.unifor.cct.solarsystem.repository.PlanetRepository

class MercuryActivity : AppCompatActivity(), PlanetItemListener {

    private lateinit var mPlanetPhoto: ImageView
    private lateinit var mPlanetName: TextView
    private lateinit var mPlanetDescription: TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mercurio)

        mPlanetPhoto = findViewById(R.id.mercuryplanet_photo)
        mPlanetName = findViewById(R.id.planet_name)
        mPlanetDescription = findViewById(R.id.planet_description)

        val position = intent.getIntExtra("planet_id", -1)
        if (position != -1) {
            PlanetRepository.findAll().forEach {
                if (it.id == position + 1) {
                    mPlanetPhoto.setImageResource(it.photo)
                    mPlanetName.text = it.name
                    mPlanetDescription.text = it.desc
                }
            }
        }


    }

    override fun onItemClick(view: View, position: Int) {

    }


}
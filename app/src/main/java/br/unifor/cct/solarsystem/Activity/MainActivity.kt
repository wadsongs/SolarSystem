package br.unifor.cct.solarsystem.Activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.core.view.get
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import br.unifor.cct.solarsystem.R
import br.unifor.cct.solarsystem.adapter.PeopleAdapter
import br.unifor.cct.solarsystem.listener.PlanetItemListener
import br.unifor.cct.solarsystem.repository.PlanetRepository

class MainActivity : AppCompatActivity(), PlanetItemListener {

    private lateinit var mPlanetList: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val llm = LinearLayoutManager(this)
        val planetAdapter = PeopleAdapter(PlanetRepository.findAll())
        planetAdapter.setOnPlanetListener(this)

        mPlanetList = findViewById(R.id.main_recyclerview_planetlist)
        mPlanetList.layoutManager = LinearLayoutManager(this)
        mPlanetList.adapter = planetAdapter

    }

    override fun onItemClick(view: View, position: Int) {
        val it = Intent (this, MercuryActivity::class.java)
        it.putExtra("planet_id", position)
        startActivity(it)
    }


}
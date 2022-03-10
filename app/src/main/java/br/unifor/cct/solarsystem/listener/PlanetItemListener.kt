package br.unifor.cct.solarsystem.listener

import android.view.View
import java.text.FieldPosition

interface PlanetItemListener {

    fun onItemClick(view: View, position: Int)
}
package com.fatdevs.list.data

import com.fatdevs.list.Affirmation
import com.fatdevs.list.R

class Datasource {
  fun loadAffirmations() : List<Affirmation>{
    return listOf<Affirmation>(
      Affirmation(R.string.affirmation_1),
      Affirmation(R.string.affirmation_2),
      Affirmation(R.string.affirmation_3)
      )
  }
}
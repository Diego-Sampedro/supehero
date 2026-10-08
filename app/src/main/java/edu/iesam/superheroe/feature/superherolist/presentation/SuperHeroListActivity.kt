package edu.iesam.superheroe.feature.superherolist.presentation

import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.constraintlayout.widget.ConstraintSet
import edu.iesam.superheroe.R
import edu.iesam.superheroe.feature.superherolist.data.SuperheroeDataRepository
import edu.iesam.superheroe.feature.superherolist.data.local.SuperheroeMemLocalDataSource
import edu.iesam.superheroe.feature.superherolist.domain.GetSuperheroesUseCase
import edu.iesam.superheroe.feature.users.presentation.UserActivity

class SuperHeroListActivity: AppCompatActivity() {
    override fun onCreate(savedInstance: Bundle?){
        super.onCreate(savedInstance)
        setContentView(R.layout.activity_superherolistactivity)

        val superheroeViewModel = SuperHeroListViewModel(
            GetSuperheroesUseCase(
                SuperheroeDataRepository(SuperheroeMemLocalDataSource())
            )
        )
        Log.d(TAG, "onCreate: ${superheroeViewModel.getSuperheroes()}")

        val superHeroes = superheroeViewModel.getSuperheroes()


        findViewById<ConstraintLayout>(R.id.superheroe_item_1).findViewById<TextView>(R.id.superheroe_name).text = superHeroes[0].name
        findViewById<ConstraintLayout>(R.id.superheroe_item_1).findViewById<TextView>(R.id.superheroe_slug).text = superHeroes[0].slug

        findViewById<ConstraintLayout>(R.id.superheroe_item_2).findViewById<TextView>(R.id.superheroe_name).text = superHeroes[1].name
        findViewById<ConstraintLayout>(R.id.superheroe_item_2).findViewById<TextView>(R.id.superheroe_slug).text = superHeroes[1].slug

        findViewById<ConstraintLayout>(R.id.superheroe_item_3).findViewById<TextView>(R.id.superheroe_name).text = superHeroes[2].name
        findViewById<ConstraintLayout>(R.id.superheroe_item_3).findViewById<TextView>(R.id.superheroe_slug).text = superHeroes[2].slug

        findViewById<ConstraintLayout>(R.id.superheroe_item_4).findViewById<TextView>(R.id.superheroe_name).text = superHeroes[3].name
        findViewById<ConstraintLayout>(R.id.superheroe_item_4).findViewById<TextView>(R.id.superheroe_slug).text = superHeroes[3].slug

        findViewById<ConstraintLayout>(R.id.superheroe_item_5).findViewById<TextView>(R.id.superheroe_name).text = superHeroes[4].name
        findViewById<ConstraintLayout>(R.id.superheroe_item_5).findViewById<TextView>(R.id.superheroe_slug).text = superHeroes[4].slug

        findViewById<ConstraintLayout>(R.id.superheroe_item_6).findViewById<TextView>(R.id.superheroe_name).text = superHeroes[5].name
        findViewById<ConstraintLayout>(R.id.superheroe_item_6).findViewById<TextView>(R.id.superheroe_slug).text = superHeroes[5].slug

        findViewById<ConstraintLayout>(R.id.superheroe_item_7).findViewById<TextView>(R.id.superheroe_name).text = superHeroes[6].name
        findViewById<ConstraintLayout>(R.id.superheroe_item_7).findViewById<TextView>(R.id.superheroe_slug).text = superHeroes[6].slug

        findViewById<ConstraintLayout>(R.id.superheroe_item_8).findViewById<TextView>(R.id.superheroe_name).text = superHeroes[7].name
        findViewById<ConstraintLayout>(R.id.superheroe_item_8).findViewById<TextView>(R.id.superheroe_slug).text = superHeroes[7].slug

        findViewById<ConstraintLayout>(R.id.superheroe_item_9).findViewById<TextView>(R.id.superheroe_name).text = superHeroes[8].name
        findViewById<ConstraintLayout>(R.id.superheroe_item_9).findViewById<TextView>(R.id.superheroe_slug).text = superHeroes[8].slug

        findViewById<ConstraintLayout>(R.id.superheroe_item_10).findViewById<TextView>(R.id.superheroe_name).text = superHeroes[9].name
        findViewById<ConstraintLayout>(R.id.superheroe_item_10).findViewById<TextView>(R.id.superheroe_slug).text = superHeroes[9].slug

        findViewById<ConstraintLayout>(R.id.superheroe_item_11).findViewById<TextView>(R.id.superheroe_name).text = superHeroes[10].name
        findViewById<ConstraintLayout>(R.id.superheroe_item_11).findViewById<TextView>(R.id.superheroe_slug).text = superHeroes[10].slug

        findViewById<ConstraintLayout>(R.id.superheroe_item_12).findViewById<TextView>(R.id.superheroe_name).text = superHeroes[11].name
        findViewById<ConstraintLayout>(R.id.superheroe_item_12).findViewById<TextView>(R.id.superheroe_slug).text = superHeroes[11].slug

        findViewById<ConstraintLayout>(R.id.superheroe_item_13).findViewById<TextView>(R.id.superheroe_name).text = superHeroes[12].name
        findViewById<ConstraintLayout>(R.id.superheroe_item_13).findViewById<TextView>(R.id.superheroe_slug).text = superHeroes[12].slug

        findViewById<ConstraintLayout>(R.id.superheroe_item_14).findViewById<TextView>(R.id.superheroe_name).text = superHeroes[13].name
        findViewById<ConstraintLayout>(R.id.superheroe_item_14).findViewById<TextView>(R.id.superheroe_slug).text = superHeroes[13].slug

        findViewById<ConstraintLayout>(R.id.superheroe_item_15).findViewById<TextView>(R.id.superheroe_name).text = superHeroes[14].name
        findViewById<ConstraintLayout>(R.id.superheroe_item_15).findViewById<TextView>(R.id.superheroe_slug).text = superHeroes[14].slug

        findViewById<ConstraintLayout>(R.id.superheroe_item_16).findViewById<TextView>(R.id.superheroe_name).text = superHeroes[15].name
        findViewById<ConstraintLayout>(R.id.superheroe_item_16).findViewById<TextView>(R.id.superheroe_slug).text = superHeroes[15].slug

        findViewById<ConstraintLayout>(R.id.superheroe_item_17).findViewById<TextView>(R.id.superheroe_name).text = superHeroes[16].name
        findViewById<ConstraintLayout>(R.id.superheroe_item_17).findViewById<TextView>(R.id.superheroe_slug).text = superHeroes[16].slug

        findViewById<ConstraintLayout>(R.id.superheroe_item_18).findViewById<TextView>(R.id.superheroe_name).text = superHeroes[17].name
        findViewById<ConstraintLayout>(R.id.superheroe_item_18).findViewById<TextView>(R.id.superheroe_slug).text = superHeroes[17].slug

        findViewById<ConstraintLayout>(R.id.superheroe_item_19).findViewById<TextView>(R.id.superheroe_name).text = superHeroes[18].name
        findViewById<ConstraintLayout>(R.id.superheroe_item_19).findViewById<TextView>(R.id.superheroe_slug).text = superHeroes[18].slug

        findViewById<ConstraintLayout>(R.id.superheroe_item_20).findViewById<TextView>(R.id.superheroe_name).text = superHeroes[19].name
        findViewById<ConstraintLayout>(R.id.superheroe_item_20).findViewById<TextView>(R.id.superheroe_slug).text = superHeroes[19].slug

        /*val superheroeName2 = findViewById<TextView>(R.id.superheroe_name2)
        superheroeName2.text = superheroeViewModel.getSuperheroes()[1].name
        val superheroeSlug2 = findViewById<TextView>(R.id.superheroe_slug2)
        superheroeSlug2.text = superheroeViewModel.getSuperheroes()[1].slug*/
    }

    companion object{
        val TAG = UserActivity:: class.java.simpleName
    }
}
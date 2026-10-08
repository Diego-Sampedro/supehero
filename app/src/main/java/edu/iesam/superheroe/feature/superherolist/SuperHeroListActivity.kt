package edu.iesam.superheroe.feature.superherolist

import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import edu.iesam.superheroe.R
import edu.iesam.superheroe.feature.list.data.SuperheroeDataRepository
import edu.iesam.superheroe.feature.list.data.local.SuperheroeMemLocalDataSource
import edu.iesam.superheroe.feature.list.domain.GetSuperheroesUseCase
import edu.iesam.superheroe.feature.list.presentation.ListViewModel
import edu.iesam.superheroe.feature.users.presentation.UserActivity
import kotlinx.coroutines.selects.SelectInstance

class SuperHeroListActivity: AppCompatActivity() {
    override fun onCreate(savedInstance: Bundle?){
        super.onCreate(savedInstance)
        setContentView(R.layout.activity_superherolistactivity)

        val superheroeViewModel = ListViewModel(
            GetSuperheroesUseCase(
                SuperheroeDataRepository(SuperheroeMemLocalDataSource())
            )
        )
        Log.d(TAG, "onCreate: ${superheroeViewModel.getSuperheroes()}")

        val superheroeName1 = findViewById<TextView>(R.id.superheroe_name1)
        superheroeName1.text = superheroeViewModel.getSuperheroes()[0].name
        val superheroeSlug1 = findViewById<TextView>(R.id.superheroe_slug1)
        superheroeSlug1.text = superheroeViewModel.getSuperheroes()[0].slug

        val superheroeName2 = findViewById<TextView>(R.id.superheroe_name2)
        superheroeName2.text = superheroeViewModel.getSuperheroes()[1].name
        val superheroeSlug2 = findViewById<TextView>(R.id.superheroe_slug2)
        superheroeSlug2.text = superheroeViewModel.getSuperheroes()[1].slug

        val superheroeName3 = findViewById<TextView>(R.id.superheroe_name3)
        superheroeName3.text = superheroeViewModel.getSuperheroes()[2].name
        val superheroeSlug3 = findViewById<TextView>(R.id.superheroe_slug3)
        superheroeSlug3.text = superheroeViewModel.getSuperheroes()[2].slug
    }

    companion object{
        val TAG = UserActivity:: class.java.simpleName
    }
}
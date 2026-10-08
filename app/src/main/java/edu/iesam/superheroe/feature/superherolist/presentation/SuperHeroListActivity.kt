package edu.iesam.superheroe.feature.superherolist.presentation

import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
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

        //superheroeViewModel.getSuperheroes().forEach { superHeroe -> superHeroe.name }

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

        ///////////////////////////////////////////////////////////////////

        val superheroeName4 = findViewById<TextView>(R.id.superheroe_name4)
        superheroeName4.text = superheroeViewModel.getSuperheroes()[3].name
        val superheroeSlug4 = findViewById<TextView>(R.id.superheroe_slug4)
        superheroeSlug4.text = superheroeViewModel.getSuperheroes()[3].slug

        val superheroeName5 = findViewById<TextView>(R.id.superheroe_name5)
        superheroeName5.text = superheroeViewModel.getSuperheroes()[4].name
        val superheroeSlug5 = findViewById<TextView>(R.id.superheroe_slug5)
        superheroeSlug5.text = superheroeViewModel.getSuperheroes()[4].slug

        val superheroeName6 = findViewById<TextView>(R.id.superheroe_name6)
        superheroeName6.text = superheroeViewModel.getSuperheroes()[5].name
        val superheroeSlug6 = findViewById<TextView>(R.id.superheroe_slug6)
        superheroeSlug6.text = superheroeViewModel.getSuperheroes()[5].slug

        val superheroeName7 = findViewById<TextView>(R.id.superheroe_name7)
        superheroeName7.text = superheroeViewModel.getSuperheroes()[6].name
        val superheroeSlug7 = findViewById<TextView>(R.id.superheroe_slug7)
        superheroeSlug7.text = superheroeViewModel.getSuperheroes()[6].slug

        val superheroeName8 = findViewById<TextView>(R.id.superheroe_name8)
        superheroeName8.text = superheroeViewModel.getSuperheroes()[7].name
        val superheroeSlug8 = findViewById<TextView>(R.id.superheroe_slug8)
        superheroeSlug8.text = superheroeViewModel.getSuperheroes()[7].slug

        val superheroeName9 = findViewById<TextView>(R.id.superheroe_name9)
        superheroeName9.text = superheroeViewModel.getSuperheroes()[8].name
        val superheroeSlug9 = findViewById<TextView>(R.id.superheroe_slug9)
        superheroeSlug9.text = superheroeViewModel.getSuperheroes()[8].slug

        val superheroeName10 = findViewById<TextView>(R.id.superheroe_name10)
        superheroeName10.text = superheroeViewModel.getSuperheroes()[9].name
        val superheroeSlug10 = findViewById<TextView>(R.id.superheroe_slug10)
        superheroeSlug10.text = superheroeViewModel.getSuperheroes()[9].slug

        val superheroeName11 = findViewById<TextView>(R.id.superheroe_name11)
        superheroeName11.text = superheroeViewModel.getSuperheroes()[10].name
        val superheroeSlug11 = findViewById<TextView>(R.id.superheroe_slug11)
        superheroeSlug11.text = superheroeViewModel.getSuperheroes()[10].slug

        val superheroeName12 = findViewById<TextView>(R.id.superheroe_name12)
        superheroeName12.text = superheroeViewModel.getSuperheroes()[11].name
        val superheroeSlug12 = findViewById<TextView>(R.id.superheroe_slug12)
        superheroeSlug12.text = superheroeViewModel.getSuperheroes()[11].slug

        val superheroeName13 = findViewById<TextView>(R.id.superheroe_name13)
        superheroeName13.text = superheroeViewModel.getSuperheroes()[12].name
        val superheroeSlug13 = findViewById<TextView>(R.id.superheroe_slug13)
        superheroeSlug13.text = superheroeViewModel.getSuperheroes()[12].slug

        val superheroeName14 = findViewById<TextView>(R.id.superheroe_name14)
        superheroeName14.text = superheroeViewModel.getSuperheroes()[13].name
        val superheroeSlug14 = findViewById<TextView>(R.id.superheroe_slug14)
        superheroeSlug14.text = superheroeViewModel.getSuperheroes()[13].slug

        val superheroeName15 = findViewById<TextView>(R.id.superheroe_name15)
        superheroeName15.text = superheroeViewModel.getSuperheroes()[14].name
        val superheroeSlug15 = findViewById<TextView>(R.id.superheroe_slug15)
        superheroeSlug15.text = superheroeViewModel.getSuperheroes()[14].slug

        val superheroeName16 = findViewById<TextView>(R.id.superheroe_name16)
        superheroeName16.text = superheroeViewModel.getSuperheroes()[15].name
        val superheroeSlug16 = findViewById<TextView>(R.id.superheroe_slug16)
        superheroeSlug16.text = superheroeViewModel.getSuperheroes()[15].slug

        val superheroeName17 = findViewById<TextView>(R.id.superheroe_name17)
        superheroeName17.text = superheroeViewModel.getSuperheroes()[16].name
        val superheroeSlug17 = findViewById<TextView>(R.id.superheroe_slug17)
        superheroeSlug17.text = superheroeViewModel.getSuperheroes()[16].slug

        val superheroeName18 = findViewById<TextView>(R.id.superheroe_name18)
        superheroeName18.text = superheroeViewModel.getSuperheroes()[17].name
        val superheroeSlug18 = findViewById<TextView>(R.id.superheroe_slug18)
        superheroeSlug18.text = superheroeViewModel.getSuperheroes()[17].slug

        val superheroeName19 = findViewById<TextView>(R.id.superheroe_name19)
        superheroeName19.text = superheroeViewModel.getSuperheroes()[18].name
        val superheroeSlug19 = findViewById<TextView>(R.id.superheroe_slug19)
        superheroeSlug19.text = superheroeViewModel.getSuperheroes()[18].slug

        val superheroeName20 = findViewById<TextView>(R.id.superheroe_name20)
        superheroeName20.text = superheroeViewModel.getSuperheroes()[19].name
        val superheroeSlug20 = findViewById<TextView>(R.id.superheroe_slug20)
        superheroeSlug20.text = superheroeViewModel.getSuperheroes()[19].slug
    }

    companion object{
        val TAG = UserActivity:: class.java.simpleName
    }
}
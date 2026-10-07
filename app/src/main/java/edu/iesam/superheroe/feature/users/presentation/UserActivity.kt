package edu.iesam.superheroe.feature.users.presentation

import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import edu.iesam.superheroe.R
import edu.iesam.superheroe.feature.list.data.SuperheroeDataRepository
import edu.iesam.superheroe.feature.list.data.local.SuperheroeMemLocalDataSource
import edu.iesam.superheroe.feature.list.domain.GetSuperheroesUseCase
import edu.iesam.superheroe.feature.list.presentation.ListViewModel
import edu.iesam.superheroe.feature.users.data.UserDataRepository
import edu.iesam.superheroe.feature.users.data.local.UserMemLocalDataSource
import edu.iesam.superheroe.feature.users.domain.GetUsersUseCase

class UserActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val userViewModel = UserViewModel(GetUsersUseCase(UserDataRepository(UserMemLocalDataSource())))
        Log.d(TAG, "onCreate: ${userViewModel.getUsers()}")
        val inputName= findViewById<TextView>(R.id.input_name)
        inputName.text = userViewModel.getUsers().first().name


    }

    companion object{
        val TAG = UserActivity:: class.java.simpleName
    }
}
package com.example.axessassign.view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity

import android.os.Bundle
import android.os.Handler
import com.example.axessassign.R


/**
 * Splash Screen Activity
 */
class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        navigateToMainScreen()

    }

    /**
     * After delay of 2 seconds {@link UserListActivity} will launch
     */
    private fun navigateToMainScreen() {
        Handler().postDelayed({ startActivity(Intent(this@SplashActivity, ImagesListActivity::class.java)) }, 3000)
    }
}

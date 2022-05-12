package com.example.newsplashapiwithanimateddrawable

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        installSplashScreen().apply {
            setKeepOnScreenCondition {
                serviceCall()
            }
        }
    }
    private fun serviceCall(): Boolean {
        Thread.sleep(3000)
        return false
    }

}
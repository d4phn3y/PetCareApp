package com.example.petcare

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.service.autofill.OnClickAction
import android.view.View


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_menu1)

             fun OnClickAction(v: View) {
            setContentView(R.layout.main_menu)
        }

    }

    fun loadMain(v: View) {
        setContentView(R.layout.main_menu)
    }
    fun health(v: View) {
        setContentView(R.layout.health)
    }
    fun food (v: View) {
        setContentView(R.layout.food)

    }
    fun groot (v: View) {
        setContentView(R.layout.grooming)
    }
    fun home(v: View) {
        setContentView(R.layout.main_menu)
    }

        }


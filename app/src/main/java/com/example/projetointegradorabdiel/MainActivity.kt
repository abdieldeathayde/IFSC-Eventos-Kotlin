package com.example.projetointegradorabdiel

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import com.example.projetointegradorabdiel.R.layout.activity_main
import kotlin.properties.Delegates

class MainActivity : ComponentActivity() {
    // Renamed this property
    private var contentViewRes by Delegates.notNull<Int>()

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Assign the layout to your renamed variable
        contentViewRes = activity_main

        // Use the activity's original setContentView method
        setContentView(contentViewRes)
    }
}

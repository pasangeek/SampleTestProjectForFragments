package com.example.fragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // val  button  = findViewById<Button>(butt)


    }

    fun onClickFirst(view: View)
    {
val fragmentManager:FragmentManager = supportFragmentManager
        val fragmentTransaction:FragmentTransaction=fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.frameLayout,FirstFragment())
        fragmentTransaction.commit()

    }

    fun  onClickSecond(view: View)

    {

        val fragmentManager:FragmentManager = supportFragmentManager
        val fragmentTransaction:FragmentTransaction=fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.frameLayout,SecondFragment())
        fragmentTransaction.commit()
    }


}
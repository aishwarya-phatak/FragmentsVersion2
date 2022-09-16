package com.example.fragmentsversion2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.fragmentsversion2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var counterFragment: CounterFragment
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initFragments()
        initListeners()
    }

    private fun initFragments(){
        counterFragment = supportFragmentManager.findFragmentById(R.id.counterFragment) as CounterFragment
    }

    private fun initListeners(){
        binding.btnResetCount.setOnClickListener {

        }
    }
}
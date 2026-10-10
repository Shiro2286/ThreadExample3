package com.example.threadexample3

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.threadexample3.databinding.ActivityMainBinding


private lateinit var binding: ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnStartThread.setOnClickListener {
            startThread()
        }
    }
    private fun startThread(){
        val runnable = ExampleThread(10)
        Thread(runnable).start()
    }
}

private fun killSomeTime() {
        for (i in 1..20) {
            Thread.sleep(2000)
            println("i: $i")
        }
    }


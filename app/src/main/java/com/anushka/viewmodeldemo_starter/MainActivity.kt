package com.anushka.viewmodeldemo_starter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.get
import com.anushka.viewmodeldemo_starter.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var ViewModel: CountingViewModel
    private var count = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        ViewModel = ViewModelProvider(this).get(CountingViewModel::class.java)

        binding.countText.text = ViewModel.getCurrentCount().toString()
        binding.button.setOnClickListener {
            count++
            binding.countText.text = ViewModel.getUpdatedCount().toString()
        }
    }
}
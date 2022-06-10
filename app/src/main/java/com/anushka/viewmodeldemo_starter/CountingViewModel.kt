package com.anushka.viewmodeldemo_starter

import androidx.lifecycle.ViewModel

class CountingViewModel: ViewModel() {
    private var count = 0

    fun getCurrentCount(): Int{
        return count
    }
    fun getUpdatedCount(): Int{
        return ++count
    }
}
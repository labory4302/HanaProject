package com.example.android.guesstheword.screens.game

import android.util.Log
import androidx.lifecycle.ViewModel

class GameViewModel : ViewModel() {
    //뷰모델이 만들어질 때
    init {
        Log.i("GemeViewModel", "GameViewModel이 만들어짐!")
    }

    //뷰모델이 파괴될 때
    override fun onCleared() {
        super.onCleared()
        Log.i("GemeViewModel", "GameViewModel이 파괴됨!")
    }
}
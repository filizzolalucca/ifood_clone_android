package com.example.ifoodclone.features.login.ui

import android.os.CountDownTimer
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.ifoodclone.app.utils.BaseViewModel
import javax.inject.Inject

class SplashViewModel @Inject constructor(): BaseViewModel() {

    private val _timerInteger = MutableLiveData<Int>()
    val timerInteger:LiveData<Int> = _timerInteger

    fun changeScreen(){

        object : CountDownTimer(3000, 1000) {

            override fun onTick(millisUntilFinished: Long) {

            }

            override fun onFinish() {
                _timerInteger.value = 0
            }
        }.start()

    }

}
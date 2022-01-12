package com.example.ifoodclone.features.login.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import com.example.ifoodclone.R
import com.example.ifoodclone.app.IfoodApplication
import com.example.ifoodclone.databinding.ActivityMainBinding
import com.example.ifoodclone.features.login.di.LoginComponent
import javax.inject.Inject

private lateinit var binding:ActivityMainBinding

class SplashActivity : AppCompatActivity() {

    // Reference to the Login graph
    lateinit var loginComponent: LoginComponent

    // Fields that need to be injected by the login graph
    @Inject lateinit var viewModel: SplashViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        // Creation of the login graph using the application graph
        loginComponent = (applicationContext as IfoodApplication).appComponent.loginComponent().create()

        // Make Dagger instantiate @Inject fields in LoginActivity
        loginComponent.injectSplash(this)

        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)
        binding.lifecycleOwner = this
        setUpView()
        setUpObservable()

        changeScreen()
    }

    private fun setUpView(){
        supportActionBar?.hide()
    }

    private fun changeScreen(){
        viewModel.showLoading
        viewModel.changeScreen()

    }

    private fun setUpObservable(){
        viewModel.timerInteger.observe(this, Observer {
            viewModel.hideLoading
            val intent = Intent(this,AuthenticationActivity::class.java)
            startActivity(intent)

        })
    }

}
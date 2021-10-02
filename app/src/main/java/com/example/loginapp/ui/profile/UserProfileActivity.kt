package com.example.loginapp.ui.profile

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.view.isVisible
import com.example.loginapp.databinding.ActivityLoginProfileBinding
import com.example.loginapp.domain.User
import com.google.android.material.snackbar.Snackbar

class UserProfileActivity : AppCompatActivity(), Contract.View {
    private lateinit var binding: ActivityLoginProfileBinding

    private lateinit var presenter: UserProfilePresenter // todo

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginProfileBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initViewEnter()
        initViewRegistration()
        initViewКecover()

    }

    private fun initViewКecover() {
        binding.recoveryButton.setOnClickListener {
            Snackbar.make(binding.root, "Error", Snackbar.LENGTH_SHORT).show()
        }
    }

    private fun initViewRegistration() {
        binding.registrationButton.setOnClickListener {
            Snackbar.make(binding.root, "Error", Snackbar.LENGTH_SHORT).show()
        }
    }


    private fun initViewEnter() {
        binding.enterButton.setOnClickListener {
            Snackbar.make(binding.root, "Error", Snackbar.LENGTH_SHORT).show()
        }
    }

    override fun setState(state: Contract.ViewState) {
        binding.contentLayout.isVisible = false
        binding.progressView.isVisible = false
        binding.successImageView.isVisible = false

        when (state) {
            Contract.ViewState.LOADING -> {
                binding.progressView.isVisible = true
            }
            Contract.ViewState.IDLE -> {
                binding.contentLayout.isVisible = true
            }
            Contract.ViewState.ERROR -> {
                binding.contentLayout.isVisible = true
                Snackbar.make(binding.root, "Error!", Snackbar.LENGTH_SHORT).show()
            }
            Contract.ViewState.SUCCESS -> {
                binding.successImageView.isVisible = true
            }
        }

    }

    override fun setLoginError(errorCode: Int) {
        binding.loginEditText.setError(getErrorStringByCode(errorCode))
    }

    override fun setPasswordError(errorCode: Int) {
        binding.loginEditText.setError(getErrorStringByCode(errorCode))
    }

    override fun setUser(user: User) {
        binding.nameEditText.setText(user.name)
        binding.loginEditText.setText(user.login)
        binding.passwordEditText.setText(user.password)


    }

    //override fun setEmailError(errorCode: Int) {
    //    TODO("Not yet implemented")
    //}

    private fun getErrorStringByCode(errorCode: Int): String {
        return "Неверный логин или пароль"
    }


}
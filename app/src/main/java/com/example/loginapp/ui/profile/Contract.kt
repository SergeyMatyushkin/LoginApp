package com.example.loginapp.ui.profile

import com.example.loginapp.domain.User

class Contract {
    enum class ViewState {
        IDLE, LOADING, SUCCESS, ERROR
    }

    interface View {
        fun setState(state: ViewState)
        fun setLoginError(errorCode: Int)
        fun setPasswordError(errorCode: Int)

        //fun setEmailError(errorCode: Int)
        fun setUser(user: User)

    }

    interface Presenter {
        fun onAttach(view: View)
        fun setChangeEmail(email: String)
        fun onChangeLogin(login: String)
        fun onChangePassword(password: String)
        fun onEnter()
        fun onSave(user: User)
        fun onRegistration()
        fun onDetach()
    }
}
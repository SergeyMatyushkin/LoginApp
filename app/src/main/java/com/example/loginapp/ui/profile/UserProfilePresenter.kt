package com.example.loginapp.ui.profile


import com.example.loginapp.domain.User


class UserProfilePresenter : Contract.Presenter {

    private var user: User? = null

    override fun onAttach(view: Contract.View) {

        user?.let {
            view.setUser(it)
        }

    }

    override fun setChangeEmail(email: String) {
        TODO("Not yet implemented")
    }

    override fun onChangeLogin(login: String) {
        TODO("Not yet implemented")
    }

    override fun onChangePassword(password: String) {
        TODO("Not yet implemented")
    }

    override fun onEnter() {
        TODO("Not yet implemented")
    }

    override fun onSave(user: User) {
        TODO("Not yet implemented")
    }


    override fun onRegistration() {
        TODO("Not yet implemented")
    }


    override fun onDetach() {
        TODO("Not yet implemented")
    }

}
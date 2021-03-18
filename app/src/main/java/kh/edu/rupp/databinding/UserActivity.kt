package kh.edu.rupp.databinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import kh.edu.rupp.databinding.databinding.ActivityUserBinding

class UserActivity : AppCompatActivity() {

    private lateinit var binding: ActivityUserBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_user)
        val view = binding.root
        setContentView(view)
        initViews()
    }

    private fun initViews(){
        var user = User("user 1", "user1@gmail.com", "123456")
        binding.user = user
        binding.btnSave.setOnClickListener(View.OnClickListener {
            saveUser()
        })
    }

    private fun saveUser(){
        var username = binding.etUsername.text.toString()
        var email = binding.etEmail.text.toString()
        var password = binding.etPassword.text.toString()
        //users.add(User(username, email, password))
        //var userSize = (users as ArrayList<User>).size
        Toast.makeText(this, "1 was save successfully.", Toast.LENGTH_LONG).show()
        clearForm()
    }

    private fun clearForm(){
        binding.etUsername.text = null
        binding.etEmail.text =  null
        binding.etPassword.text = null
    }
}
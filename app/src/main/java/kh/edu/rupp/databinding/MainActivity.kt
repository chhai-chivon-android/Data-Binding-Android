package kh.edu.rupp.databinding

import androidx.databinding.DataBindingUtil
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import kh.edu.rupp.databinding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    var users: MutableList<User> = mutableListOf()
    private lateinit var linearLayoutManager: LinearLayoutManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        val view = binding.root
        linearLayoutManager = LinearLayoutManager(this)
        setContentView(view)
        initViews()
    }

    private fun initViews(){
        var user = User("user 1", "user1@gmail.com", "123456")
        binding.user = user
        binding.rvUser.layoutManager = linearLayoutManager
    }
}
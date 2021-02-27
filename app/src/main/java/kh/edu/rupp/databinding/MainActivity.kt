package kh.edu.rupp.databinding

import androidx.databinding.DataBindingUtil
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kh.edu.rupp.databinding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        val view = binding.root
        setContentView(view)
        initViews()
    }

    private fun initViews(){
        var user = User("user 1" , "user1@gmail.com")
            binding.user = user
    }
}
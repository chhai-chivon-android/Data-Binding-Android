package kh.edu.rupp.databinding

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.Bindable
import androidx.databinding.DataBindingUtil
import kh.edu.rupp.databinding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    @Bindable
    protected var mUser: User? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)

        val binding: ActivityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        val user = User("Niharika", "Software Engineer")
        binding.user = user
    }
}
package com.example.aboutme

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import com.example.aboutme.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    data class MyName(var name: String = "", var nickname: String = "")


    private lateinit var binding:ActivityMainBinding

    private val myName:MyName = MyName("Carlo Tran")

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)
        binding.myName = myName


        binding.doneButton.setOnClickListener {
            addNickname()
            fun View.hideKeyboard() {
                val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
                imm.hideSoftInputFromWindow(windowToken, 0)
            }
            it.hideKeyboard()
        }
    }

    private fun addNickname(){
        binding.apply {
            myName?.nickname = nicknameEdit.text.toString()

            invalidateAll()

            doneButton.visibility = View.GONE
            nicknameEdit.visibility = View.GONE
            nicknameText.visibility = View.VISIBLE
        }

    }



}

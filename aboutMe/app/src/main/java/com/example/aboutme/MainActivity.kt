package com.example.aboutme

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.done_button)

        button.setOnClickListener {
            addNickname()
            fun View.hideKeyboard() {
                val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
                imm.hideSoftInputFromWindow(windowToken, 0)
            }
            it.hideKeyboard()
        }
    }

    private fun addNickname(){
        val nicknameTextView = findViewById<TextView>(R.id.nickname_text)
        val nickname = findViewById<EditText>(R.id.nickname_edit)
        val button = findViewById<Button>(R.id.done_button)

        nicknameTextView.text = nickname.text.toString()
        button.visibility = View.GONE
        nickname.visibility = View.GONE
        nicknameTextView.visibility = View.VISIBLE


    }

}

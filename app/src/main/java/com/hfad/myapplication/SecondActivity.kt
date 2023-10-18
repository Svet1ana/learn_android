package com.hfad.myapplication

import android.R
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity


class SecondActivity : AppCompatActivity() {

    var key: Long = 0

    val KEY = "key"

    var key = findViewById<View>(R.id.key) as EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        if (savedInstanceState != null) {
            key = savedInstanceState.getLong(KEY)
        }

        fun nextActivity(view: View?) {
            val intent = Intent(this, ThirdActivity::class.java)
            startActivity(intent)
        }
        fun previousActivity(view: View?) {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }

    override fun onSaveInstanceState(savedInstanceState: Bundle) {
        savedInstanceState.putLong(KEY, key)
        super.onSaveInstanceState(savedInstanceState)
    }

    fun saveKey() {
        val key str = Integer.parseInt(num_page.getText().toString().trim());
        key = get - findViewById<"@+id/key">()
    }
}
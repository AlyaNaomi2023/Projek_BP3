package com.dicoding.projek

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class AboutActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)
        supportActionBar?.title = "About"

        // Tambahkan kode lain yang diperlukan, seperti mengatur foto dan teks nama serta email
    }
}

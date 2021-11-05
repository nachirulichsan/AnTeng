package com.nachirulichsan023.projectuts;

import android.app.Activity;
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_detail.*

class DetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
        imageViewDetail.setImageResource(intent.getIntExtra("gambar", R.drawable.dolalak))
        textViewNamaDetail.text = intent.getStringExtra("nama")
        textViewAsalDetail.text = intent.getStringExtra("daerah")
        textViewKetDetail.text = intent.getStringExtra("keterangan")

    }
}

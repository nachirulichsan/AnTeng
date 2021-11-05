package com.nachirulichsan023.projectuts

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {
    var data: ArrayList<DataModel>? = null
    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Inisialisasi Array
        data = ArrayList()

        //Simpan data

        data?.add(DataModel(R.drawable.dolalak,"Tari Dolalak","Purworejo","Tari tradisional Dolalak berasal dari daerah Purworejo " +
                "Kesenian yang berkembang di era penjajahan ini, berkembang luas dengan penggambaran prajurit Belanda. " +
                "Setiap penari memakai kostum yang mirip dengan serdadu-serdadu kolonial."))

        data?.add(DataModel(R.drawable.rongeng,"Tari Ronggeng","Semarang", "Tari Ronggeng diyakini sudah berkembang di kawasan Jawa Tengah sejak jaman kuno. " +
                "Hal ini tak lepas dari relief yang ada di Candi Borobudur yang berdiri di abad ke-8 Masehi, terutama di bagian relief. " +
                "Gerakan dalam Tari Ronggeng cenderung lebih ekspresif dan eksotis."))

        data?.add(DataModel(R.drawable.serimpi,"Tari Serimpi","Solo", "Tari tradisional Jawa Tengah ini cukup sakral di kalangan keraton " +
                "biasa dipertunjukkan di lingkungan kerajaan saja, untuk acara kenegaraan serta penobatan tahta sultan." +
                "Tari Serimpi di Jawa Tengah dipentaskan dengan iring-iringan musik gamelan."))

        data?.add(DataModel(R.drawable.ebed,"Jaran Lumping","Banyumas", "Tari Ebeg memiliki ciri khas dengan propertinya yang berupa boneka kuda. " +
                "Tidak seperti seni tari lain yang mempertunjukkan gerakan yang lemah gemulai," +
                "melainkan menampilkan gerakan lenggak-lenggok ikut alur musik yang dimainkan."))

        data?.add(DataModel(R.drawable.gambyong,"Tari Gambyong","Solo", "Tari Gambyong adalah kesenian tradisional yang asalnya dari Surakarta, " +
                "yang mementaskan seni tari dari perpaduan tari rakyat dan tari keraton."))

        data?.add(DataModel(R.drawable.kethek,"Tari Kethek Ogleng","Wonogiri", "Tarian tadisional asal Wonogiri ini, " +
                "asal-mulanya bercerita tentang Raden Gunung Sari yang menjelma menjadi seekor kera untuk mengelabui musuh. " +
                "Maka dari itu, tarian ini dinamakan Kethek Ogleng."))

        data?.add(DataModel(R.drawable.sintren,"Tari Sintren","Pantura", "Kesenian Tari Sintren banyak perkembang di kawasan pesisir pantai utara Jawa, " +
                "dari Jawa Tengah hingga Jawa Barat. " +
                "Seperti Brebes, Pemalang, Pekalongan, dan Banyumas."))

        data?.add(DataModel(R.drawable.bondan,"Tari Bondan","Solo", "Tari ini berasal dari wilayah Surakarta, Jawa Tengah yang bertema tentang gambaran kasih sayang seorang ibu terhadap anaknya. " +
                "Tari Bondan memiliki ciri yang cukup khas, seperti boneka bayi, " +
                "kendil, payung dan berbagai perabotan yang sering dipakai oleh ibu-ibu lainnya."))

        data?.add(DataModel(R.drawable.gambang,"Gambang Semarang","Semarang", "kesenian musik tradisional kerakyatan yang berasal dari Semarang dan merupakan gabungan dari seni musik, vokal, tari dan lawak. " +
                "Yang khas dari kesenian ini adalah alunan musik yang mengiringi gerak telapak kaki secara dinamis sesuai irama lagu. " +
                "Kesenian Gambang Semarang merupakan turunan kesenian betawi Gambang Kromong yang memang lekat dengan budaya kalangan tionghoa."))

        //Set data to Adapter
        recyclerView.adapter = DataAdapter(data, object : DataAdapter.OnClickListener{
            override fun detail(item: DataModel?) {
                val intent = Intent(this@MainActivity, DetailActivity::class.java)
                intent.putExtra("gambar", item?.gambar)
                intent.putExtra("nama", item?.nama)
                intent.putExtra("daerah", item?.daerah)
                intent.putExtra("keterangan", item?.keterangan)
                startActivity(intent)
            }

        })


    }
}
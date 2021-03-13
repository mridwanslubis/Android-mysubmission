package com.example.mysubmission

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.TextureView
import android.view.View
import android.widget.ImageView
import android.widget.TextView

class SmartphoneDetail : AppCompatActivity(){

    private lateinit var currentSmartphoneImage: ImageView
    private lateinit var merkDetail: TextView
    private lateinit var rilisDetail: TextView
    private lateinit var tipeDetail: TextView
    private lateinit var resolusiDetail: TextView
    private lateinit var chipsetDetail: TextView
    private lateinit var cpuDetail: TextView
    private lateinit var gpuDetail: TextView
    private lateinit var cardslotDetail: TextView
    private lateinit var internalDetail: TextView
    private lateinit var smartPhoneNameDetail: TextView
    private lateinit var smartphoneNameClass: String

    companion object{
        const val DATA_NAMA = "data_nama"
        const val DATA_MERK = "data_merk"
        const val DATA_GAMBAR = "data_gambar"
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_smartphone_detail)

        smartphoneNameClass = intent.getStringExtra(DATA_NAMA).toString()
        val smartphoneMerk = intent.getStringExtra(DATA_MERK)
        val smartphoneImage = intent.getIntExtra(DATA_GAMBAR, 0)
        currentSmartphoneImage = findViewById(R.id.current_smartphone)
        currentSmartphoneImage.setImageResource(smartphoneImage)
        if (smartphoneMerk != null) {
            setDetailInformation(smartphoneNameClass, smartphoneMerk)
        }
    }

    private fun setDetailInformation(smartphoneName: String, smartphoneMerk: String){

        smartPhoneNameDetail = findViewById(R.id.smartphone_nama_detail)
        smartPhoneNameDetail.text = smartphoneName.toString()

        merkDetail = findViewById(R.id.merk_detail)
        merkDetail.text = smartphoneMerk.toString()


        rilisDetail = findViewById(R.id.tv_rilis)
        tipeDetail = findViewById(R.id.tv_tipe)
        resolusiDetail = findViewById(R.id.tv_resolusi)
        chipsetDetail = findViewById(R.id.tv_chipset)
        cpuDetail = findViewById(R.id.tv_cpu)
        gpuDetail = findViewById(R.id.tv_gpu)
        cardslotDetail = findViewById(R.id.tv_cardslot)
        internalDetail = findViewById(R.id.tv_memori)

        rilisDetail.text = SmartphonesData.tanggalRilis[smartphoneName].toString()
        tipeDetail.text = SmartphonesData.typeDisplay[smartphoneName].toString()
        resolusiDetail.text = SmartphonesData.resolusiDisplay[smartphoneName].toString()
        chipsetDetail.text = SmartphonesData.resolusiDisplay[smartphoneName].toString()
        cpuDetail.text = SmartphonesData.cpuPlatform[smartphoneName].toString()
        gpuDetail.text = SmartphonesData.gpuPlatform[smartphoneName].toString()
        cardslotDetail.text = SmartphonesData.cardSlotMemory[smartphoneName].toString()
        internalDetail.text = SmartphonesData.internalMemory[smartphoneName].toString()

    }

}
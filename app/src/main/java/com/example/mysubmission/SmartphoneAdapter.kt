package com.example.mysubmission

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class SmartphoneAdapter(private val listSmartphone: ArrayList<Smartphone>): RecyclerView.Adapter<SmartphoneAdapter.ViewHolder>() {

    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {

        var imgPhoto: ImageView = itemView.findViewById(R.id.img_smartphone)
        var tvName: TextView = itemView.findViewById(R.id.tv_nama_smartphone)
        var tvMerk: TextView = itemView.findViewById(R.id.tv_merk_smartphone)

        var btnDetail: Button = itemView.findViewById(R.id.btn_detail)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.list_smartphone,parent,false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listSmartphone.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val smartphone = listSmartphone[position]

        Glide.with(holder.itemView.context)
            .load(smartphone.photo)
            .apply(RequestOptions().override(160,212))
            .into(holder.imgPhoto)

        holder.tvName.text = smartphone.name
        holder.tvMerk.text = smartphone.merk

        holder.btnDetail.setOnClickListener{

            val context = holder.btnDetail.context
            val smartphoneDetailActivity = Intent(context, SmartphoneDetail::class.java)
            smartphoneDetailActivity.putExtra(SmartphoneDetail.DATA_NAMA, smartphone.name)
            smartphoneDetailActivity.putExtra(SmartphoneDetail.DATA_GAMBAR, smartphone.photo)
            smartphoneDetailActivity.putExtra(SmartphoneDetail.DATA_MERK, smartphone.merk)
            context.startActivity(smartphoneDetailActivity)


        }
    }


}
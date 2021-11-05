package com.nachirulichsan023.projectuts

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.list_tari.view.*


class DataAdapter(val data: List<DataModel>?, val itemClick: OnClickListener) : RecyclerView.Adapter<DataAdapter.MyViewHolder>() {

    //Override fun didapatkan dari implement member
    override fun onCreateViewHolder(parent: ViewGroup, p1: Int): MyViewHolder {

        //item_list merupakan layout yang kita tambahkan
        val view = LayoutInflater.from(parent.context).inflate(R.layout.list_tari, parent, false)

        return MyViewHolder(view)

    }

    override fun getItemCount(): Int = data?.size ?: 0

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {

        val item = data?.get(position)
        holder.setData(item)

    }

    inner class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun setData(item: DataModel?) {
            //Pada list kita tidak menampilkan keterangan
            itemView.imageView.setImageResource(item?.gambar ?: R.drawable.dolalak)
            itemView.textViewNama.text = item?.nama
            itemView.textViewAsal.text = item?.daerah

            itemView.setOnClickListener {
                itemClick.detail(item)
            }
        }
    }

    interface OnClickListener {
        fun detail (item: DataModel?)
    }
}

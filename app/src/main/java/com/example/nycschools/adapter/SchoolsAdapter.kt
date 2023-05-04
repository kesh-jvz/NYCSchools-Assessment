package com.example.nycschools.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.nycschools.databinding.SchoolsItemLayoutBinding
import com.example.nycschools.schoolModel.SchoolNameModel

class SchoolsAdapter(var itemList:ArrayList<SchoolNameModel>):RecyclerView.Adapter<SchoolsAdapter.ViewHolder>() {
    var itemClick:((String) -> Unit)? = null
    inner class ViewHolder(var binding:SchoolsItemLayoutBinding):RecyclerView.ViewHolder(binding.root){
        fun bindData(schoolModelItem: SchoolNameModel){
            binding.dbnTV.text = schoolModelItem.dbn
            binding.schoolNameTV.text = schoolModelItem.schoolName

            binding.root.setOnClickListener {
                itemClick?.invoke(schoolModelItem.dbn)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
       val view = SchoolsItemLayoutBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindData(itemList[position])
    }

    override fun getItemCount(): Int {
        return itemList.size
    }
}
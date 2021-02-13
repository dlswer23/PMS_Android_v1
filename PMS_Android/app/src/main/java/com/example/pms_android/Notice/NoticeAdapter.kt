package com.example.pms_android.Notice

import android.view.View
import android.widget.LinearLayout
import androidx.recyclerview.widget.RecyclerView
import com.example.pms_android.R

abstract class NoticeAdapter: RecyclerView.Adapter<NoticeAdapter.ViewHolder>() {
    class ViewHolder(itemView: View, listener: OnNoticeItemClick?) :
        RecyclerView.ViewHolder(itemView) {
        var reposLayout: LinearLayout = itemView.findViewById(R.id.repo_list)

        init {
            itemView.setOnClickListener { view ->
                val position = adapterPosition
                listener?.onItemClick(this@ViewHolder, view, position)
            }
        }
    }
}
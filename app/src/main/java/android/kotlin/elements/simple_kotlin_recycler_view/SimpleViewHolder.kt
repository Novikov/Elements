package android.kotlin.elements.simple_kotlin_recycler_view

import android.kotlin.elements.R
import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class SimpleViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {

    var textTV:TextView = itemView.findViewById(R.id.textTextViewJavaItem)
    var indexTV:TextView = itemView.findViewById(R.id.indexTextViewJavaItem)

    fun bind(_text:String){
        textTV.text = _text
    }

}
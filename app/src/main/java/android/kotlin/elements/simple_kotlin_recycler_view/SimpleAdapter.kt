package android.kotlin.elements.simple_kotlin_recycler_view

import android.content.Context
import android.kotlin.elements.R
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class SimpleAdapter(val strings:List<String>, val parent:Context): RecyclerView.Adapter<SimpleViewHolder>() {

    companion object{
        var viewHolderCount:Int = 0
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SimpleViewHolder {
        val context:Context = parent.context
        val inflater:LayoutInflater = LayoutInflater.from(context)

        var view: View = inflater.inflate(R.layout.simple_java_recycler_view_item,parent,false)

        var simpleViewHolder:SimpleViewHolder = SimpleViewHolder(view)

        simpleViewHolder.indexTV.setText("ViewHolder indexTV: " + viewHolderCount)

        viewHolderCount++

        return simpleViewHolder

    }

    override fun onBindViewHolder(holder: SimpleViewHolder, position: Int) {
        holder.bind(strings.get(position))
    }

    override fun getItemCount(): Int {
        return strings.size
    }
}
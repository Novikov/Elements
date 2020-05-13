package android.kotlin.elements.simple_kotlin_recycler_view

import android.kotlin.elements.R
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class SimpleKotlinRecyclerViewActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_simple_kotlin_recycler_view)

        val recyclerView = findViewById<RecyclerView>(R.id.simple_kotlin_rw)

        recyclerView.layoutManager = LinearLayoutManager(this)

        val strings = ArrayList<String>()

        for(n in 1..100)
            strings.add("String number - $n")

        recyclerView.adapter = SimpleAdapter(strings,this)

    }
}

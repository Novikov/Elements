package android.kotlin.elements

import android.content.Intent
import android.kotlin.elements.simple_java_recycler_view.SimpleJavaRecyclerViewActivity
import android.kotlin.elements.simple_kotlin_recycler_view.SimpleKotlinRecyclerViewActivity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onClickJavaRecyclerView(v: View){
        val intent: Intent = Intent(this,SimpleJavaRecyclerViewActivity::class.java)
        startActivity(intent)
    }

    fun onClickKotlinRecyclerView(v: View){
        val intent: Intent = Intent(this,SimpleKotlinRecyclerViewActivity::class.java)
        startActivity(intent)
    }
}

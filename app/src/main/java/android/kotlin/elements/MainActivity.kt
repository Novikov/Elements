package android.kotlin.elements

import android.content.Intent
import android.kotlin.elements._1_simple_java_recycler_view.SimpleJavaRecyclerViewActivity
import android.kotlin.elements._2_simple_kotlin_recycler_view.SimpleKotlinRecyclerViewActivity
import android.kotlin.elements._3_fragment_interaction.FragmentInteractionActivity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity()  {

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

    fun onClickFragmentInteraction(v: View){
        val intent: Intent = Intent(this,FragmentInteractionActivity::class.java)
        startActivity(intent)
    }

}

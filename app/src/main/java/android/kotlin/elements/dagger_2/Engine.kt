package android.kotlin.elements.dagger_2

import android.content.Context
import android.widget.Toast
import javax.inject.Inject
import dagger.Lazy

//обавим аннотация dagger Inject, тем самым дадим понять dagger что эти классы должны быть внедрены при необходимости

class Engine @Inject constructor(private var fuel: Lazy<Fuel>) {
    fun start(context:Context){
        if(fuel!=null){
            Toast.makeText(context,"Started with ${fuel.get().fuelType}", Toast.LENGTH_LONG).show()
        }else{
            Toast.makeText(context,"No more fuel!", Toast.LENGTH_LONG).show()
        }
    }
}
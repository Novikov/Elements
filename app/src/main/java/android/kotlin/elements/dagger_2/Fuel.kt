package android.kotlin.elements.dagger_2

import android.kotlin.elements.BuildConfig
import javax.inject.Inject

//обавим аннотация dagger Inject, тем самым дадим понять dagger что эти классы должны быть внедрены при необходимости

class Fuel @Inject constructor() {
    val fuelType = if(BuildConfig.DEBUG){
        "benzine"
    }else{
        "diesel"
    }
}
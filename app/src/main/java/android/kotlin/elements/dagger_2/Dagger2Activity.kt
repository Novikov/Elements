package android.kotlin.elements.dagger_2

import android.kotlin.elements.R
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import javax.inject.Inject

/*Ccылки на статью -
Часть 1 - https://habr.com/ru/post/466725/
Часть 2 - https://habr.com/ru/post/466769/
*/

class Dagger2Activity : AppCompatActivity() {

    @Inject
    lateinit var car: Car

    private var engine: Engine = DaggerDaggerComponent.create().getEngine()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dagger2)

        //Если не проинжектить поле car, то приложение упадет
        DaggerDaggerComponent.create().inject(this)
        engine.start(this)

    }
}

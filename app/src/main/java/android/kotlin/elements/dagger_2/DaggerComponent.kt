package android.kotlin.elements.dagger_2

import dagger.Component


/*
* Dagger должен знать как создавать все объекты которые он должен внедрять.
* Для того чтоб перечислить все классы которые мы внедряем (Inject) -
* используется аннотация Component которая объявляется для интерфейса (DaggerComponent)
* */

@Component
interface DaggerComponent {
    fun getCar(): Car
    fun getEngine(): Engine
    fun getFuel(): Fuel

    fun inject(act: Dagger2Activity)
}
package android.kotlin.elements.dagger_2

import javax.inject.Inject
import javax.inject.Provider

class Car @Inject constructor(private var engine: Provider<Engine>) {
    var key: Key? = null
        @Inject set
}

class Key @Inject constructor()
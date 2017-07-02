package architecturecomponents.LiveData

import android.arch.lifecycle.LiveData

/**
 * Created by zorail on 02-Jul-17.
 */
class CounterData : LiveData<Int>() {

    init {
        value = 0
    }

    override fun onActive() {
        super.onActive()
    }

    override fun onInactive() {
        super.onInactive()
    }

    fun increaseCounter(){
        value = value!! + 1
    }

}
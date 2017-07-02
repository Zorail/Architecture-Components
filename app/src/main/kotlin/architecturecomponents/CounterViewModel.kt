package architecturecomponents

import android.arch.lifecycle.ViewModel

/**
 * Created by zorail on 02-Jul-17.
 */
class CounterViewModel : ViewModel() {

    var counter:Int = 0

    fun incrreaseCounter(){
        ++counter
    }
}
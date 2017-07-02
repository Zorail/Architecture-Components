package architecturecomponents.ViewModel_Livedata

import android.arch.lifecycle.ViewModel
import architecturecomponents.LiveData.CounterData

/**
 * Created by zorail on 02-Jul-17.
 */
class CounterLiveViewModel: ViewModel() {

    val counterData:CounterData = CounterData()

    fun increaseCounter(){
        counterData.increaseCounter()
    }
}
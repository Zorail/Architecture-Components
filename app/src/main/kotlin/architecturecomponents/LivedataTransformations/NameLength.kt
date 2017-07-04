package architecturecomponents.LivedataTransformations

import android.arch.lifecycle.LiveData
import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.Transformations
import android.arch.lifecycle.ViewModel

/**
 * Created by zorail on 02-Jul-17.
 */
class NameLength: ViewModel() {

    companion object {
        val input_name:MutableLiveData<String> = MutableLiveData()
        val nameCount:LiveData<Int> = Transformations.map(input_name,String::length)
    }
    fun setName(name:String){
        input_name.value = name
    }

}
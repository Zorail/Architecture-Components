package architecturecomponents.ViewModel_Livedata

import android.arch.lifecycle.LifecycleRegistry
import android.arch.lifecycle.LifecycleRegistryOwner
import android.arch.lifecycle.Observer
import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.rohan.zorail.architecturecomponents.R
import kotlinx.android.synthetic.main.activity_main.*

/**
 * Created by zorail on 02-Jul-17.
 */
class CounterLiveViewActivity:AppCompatActivity(),LifecycleRegistryOwner {


    lateinit var counterLiveModel:CounterLiveViewModel

    var registry:LifecycleRegistry = LifecycleRegistry(this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        counterLiveModel = ViewModelProviders.of(this).get(CounterLiveViewModel::class.java)

        val observer = Observer<Int>{ t -> counter.text = t.toString()}
        counterLiveModel.counterData.observe(this,observer)

        button.setOnClickListener { counterLiveModel.increaseCounter() }
    }

    override fun getLifecycle(): LifecycleRegistry {
        return registry
    }
}
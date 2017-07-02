package architecturecomponents.LiveData

import android.arch.lifecycle.LifecycleRegistry
import android.arch.lifecycle.LifecycleRegistryOwner
import android.arch.lifecycle.Observer
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.rohan.zorail.architecturecomponents.R
import kotlinx.android.synthetic.main.activity_main.*

/**
 * Created by zorail on 02-Jul-17.
 */
class LivedataActivity : AppCompatActivity(),LifecycleRegistryOwner {

    val counterData:CounterData = CounterData()

    val registry:LifecycleRegistry = LifecycleRegistry(this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val observer = Observer<Int> { t -> counter.text = t.toString() }
        counterData.observe(this,observer)

        button.setOnClickListener { counterData.increaseCounter() }
    }
    override fun getLifecycle(): LifecycleRegistry {
        return registry
    }
}
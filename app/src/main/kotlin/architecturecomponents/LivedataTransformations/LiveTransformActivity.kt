package architecturecomponents.LivedataTransformations

import android.arch.lifecycle.LifecycleRegistry
import android.arch.lifecycle.LifecycleRegistryOwner
import android.arch.lifecycle.Observer
import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.rohan.zorail.architecturecomponents.R
import kotlinx.android.synthetic.main.transform_layout.*

/**
 * Created by zorail on 02-Jul-17.
 */
class LiveTransformActivity:AppCompatActivity(),LifecycleRegistryOwner {

    val registry:LifecycleRegistry = LifecycleRegistry(this)
    lateinit var viewModel:NameLength

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.transform_layout)

        viewModel = ViewModelProviders.of(this).get(NameLength::class.java)
        val observer = Observer<Int> { t -> counter.text = t.toString() }

        NameLength.nameCount.observe(this,observer)

        button.setOnClickListener {
            val name = name.text.toString()
            viewModel.setName(name)
        }
    }

    override fun getLifecycle(): LifecycleRegistry {
        return registry
    }
}
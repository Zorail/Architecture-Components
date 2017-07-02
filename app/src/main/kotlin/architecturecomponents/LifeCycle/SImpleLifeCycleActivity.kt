package architecturecomponents.LifeCycle

import android.arch.lifecycle.LifecycleActivity
import android.os.Bundle
import com.rohan.zorail.architecturecomponents.R

/**
 * Created by zorail on 02-Jul-17.
 */
class SImpleLifeCycleActivity: LifecycleActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        SimpleLifeCycleObserver.bindInto(this)
    }
}
package architecturecomponents.LifeCycle

import android.arch.lifecycle.Lifecycle
import android.arch.lifecycle.LifecycleObserver
import android.arch.lifecycle.LifecycleOwner
import android.arch.lifecycle.OnLifecycleEvent
import android.util.Log

/**
 * Created by zorail on 02-Jul-17.
 */
class SimpleLifeCycleObserver private constructor(provider: LifecycleOwner): LifecycleObserver {

    init {
        provider.lifecycle.addObserver(this)
    }

    companion object {
        fun bindInto(provider:LifecycleOwner):SimpleLifeCycleObserver{

            return SimpleLifeCycleObserver(provider)
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    fun callOnCreate(){
        Log.d("TAG","OnCreate called")
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    fun callOnStart(){
        Log.d("TAG","OnStart called")
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    fun callOnResume(){
        Log.d("TAG","OnResume called")
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    fun  callOnPause(){
        Log.d("TAG","ONPause called")
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    fun callOnStop(){
        Log.d("TAG","OnStop called")
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    fun callOnDestroy(){
        Log.d("TAG","OnDestroy called")
    }
}
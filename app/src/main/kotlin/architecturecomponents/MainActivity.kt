package architecturecomponents

import android.arch.lifecycle.ViewModelProviders
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.rohan.zorail.architecturecomponents.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var counterViewModel: CounterViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        counterViewModel = ViewModelProviders.of(this).get(CounterViewModel::class.java)
        updateCounterValue(counterViewModel.counter)
        button.setOnClickListener {
            counterViewModel.incrreaseCounter()
            updateCounterValue(counterViewModel.counter)
        }
    }
    private fun updateCounterValue(value:Int) {
        counter.text = value.toString()
    }
}

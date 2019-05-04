package oliveira.fabio.expandablerecyclerviewexample

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        init()
    }

    private fun init() {
        initRecylerView()
    }

    private fun initRecylerView() {
        rvList.layoutManager = LinearLayoutManager(this)
        rvList.adapter = ItemsAdapter(mountList(), true)
    }

    private fun mountList() = arrayListOf<ItemVO>().apply {
        val subItemVOList = arrayListOf<SubItemVO>().apply {
            add(SubItemVO("description one", "220"))
            add(SubItemVO("description two", "120"))
            add(SubItemVO("description three", "320"))
            add(SubItemVO("description four", "420"))
            add(SubItemVO("description five", "2110"))
            add(SubItemVO("description six", "554"))
            add(SubItemVO("description seven", "346"))
            add(SubItemVO("description eight", "88"))
        }
        add(ItemVO("Title One", subItemVOList))
        add(ItemVO("Title Two", subItemVOList))
        add(ItemVO("Title Three", subItemVOList))
        add(ItemVO("Title Four", subItemVOList))
    }
}

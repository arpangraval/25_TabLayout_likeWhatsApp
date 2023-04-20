package com.example.a25_whatsapptablayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.tabs.TabLayoutMediator
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val adapter = ViewPagerAdapter(supportFragmentManager,lifecycle)
        viewpager2.adapter = adapter

TabLayoutMediator(tablayout,viewpager2){tab,position ->
    when(position){
0->{tab.text ="CHAT"
    }
    1->{
    tab.text="STATUS"
}
    2->{
    tab.text="CALLS"
}
}
    }.attach()


}
    }

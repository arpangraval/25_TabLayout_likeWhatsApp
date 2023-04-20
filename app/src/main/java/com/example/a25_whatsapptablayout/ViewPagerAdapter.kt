package com.example.a25_whatsapptablayout

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.a25_whatsapptablayout.fragments.CallFragment
import com.example.a25_whatsapptablayout.fragments.ChatFragment
import com.example.a25_whatsapptablayout.fragments.StatusFragment

class ViewPagerAdapter(fragmentManager: FragmentManager,lifecycle: Lifecycle):FragmentStateAdapter(fragmentManager, lifecycle) {
    override fun getItemCount(): Int {
       return 3
    }

    override fun createFragment(position: Int): Fragment {
return when(position){
    0->{CallFragment()}
    1->{ChatFragment()}
    2->{StatusFragment()}
    else->{ Fragment()}

    }
}
    }



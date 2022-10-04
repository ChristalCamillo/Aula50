package com.example.minhamusicafavorita_mvvm.view.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter

class DetalhePagerAdapter(
    fragmentManager: FragmentManager,
    lifecycle: Lifecycle,

) : FragmentStateAdapter(fragmentManager, lifecycle) {

    override fun getItemCount(): Int = 2

    override fun createFragment(position: Int): Fragment {
        when(position){
            0 -> return FragmentInformacoes()
            1 -> return FragmentFotos()
        }
        return FragmentFotos()
    }
}
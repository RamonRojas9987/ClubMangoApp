package org.bedu.clubmangoapp.fragments.shopping

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.google.android.material.tabs.TabLayoutMediator
import org.bedu.clubmangoapp.R
import org.bedu.clubmangoapp.adapters.HomeViewpagerAdapter
import org.bedu.clubmangoapp.databinding.FragmentHomeBinding
import org.bedu.clubmangoapp.fragments.categories.BraceletsFragment
import org.bedu.clubmangoapp.fragments.categories.EarringsFragment
import org.bedu.clubmangoapp.fragments.categories.CharmsFragment
import org.bedu.clubmangoapp.fragments.categories.MainCategoryFragment
import org.bedu.clubmangoapp.fragments.categories.NecklacesFragment
import org.bedu.clubmangoapp.fragments.categories.RingsFragment

class HomeFragment: Fragment(R.layout.fragment_home) {
    private lateinit var binding: FragmentHomeBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHomeBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val categoriesFragments = arrayListOf<Fragment>(
            MainCategoryFragment(),
            BraceletsFragment(),
            RingsFragment(),
            EarringsFragment(),
            NecklacesFragment(),
            CharmsFragment()

        )

        val viewPager2Adapter =
            HomeViewpagerAdapter(categoriesFragments, childFragmentManager, lifecycle)
        binding.viewpagerHome.adapter = viewPager2Adapter
        TabLayoutMediator(binding.tabLayout, binding.viewpagerHome){tap, position ->
            when (position){
                0 -> tap.text = "Main"
                1 -> tap.text = "Pulsos"
                2 -> tap.text = "Anillos"
                3 -> tap.text = "Cadenas"
                4 -> tap.text = "Aretes"
                5 -> tap.text = "Dijes"

            }
        }.attach()
    }
}
package com.alireza.claculatework.ui.season

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.repeatOnLifecycle
import com.alireza.claculatework.R
import com.alireza.claculatework.data.model.Fruit
import com.alireza.claculatework.data.model.Season
import com.alireza.claculatework.databinding.FragmentAddSeasonBinding
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.launch


@AndroidEntryPoint
class AddSeasonFragment : Fragment(R.layout.fragment_add_season) {

    private val viewModel:AddSeasonViewModel by viewModels()
    private var _binding : FragmentAddSeasonBinding?= null
    private val binding get() = _binding !!


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentAddSeasonBinding.inflate(layoutInflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val launch = lifecycleScope.launch {
            viewModel.addSeason(Season(0, "lemon-1400-dastchin", Fruit.Lemon, 1))
        }
       launch.start()
        if (launch.isCompleted){
            Toast.makeText(requireContext(),"Season Added" , Toast.LENGTH_LONG).show()
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }



}
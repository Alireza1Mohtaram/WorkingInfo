package com.alireza.claculatework.ui.season

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.viewModels
import androidx.lifecycle.lifecycleScope
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.alireza.claculatework.R
import com.alireza.claculatework.databinding.FragmentSeasonBinding
import com.alireza.claculatework.ui.adapter.SeasonAdapter
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch


@AndroidEntryPoint
class SeasonFragment : Fragment(R.layout.fragment_season) {

    private var _binding: FragmentSeasonBinding? = null
    private val viewModel: SeasonViewModel by viewModels()
    private val adapter: SeasonAdapter by lazy {
        SeasonAdapter() {
            //Toast.makeText(requireContext(),"${it.code}",Toast.LENGTH_LONG)
            Log.d("data", it.code.toString())
        }
    }
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentSeasonBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        initViews()
        lifecycleScope.launch {
            viewModel.getSeasons().collect {
                adapter.submitList(it)
            }
        }
        binding.fab.setOnClickListener {
            it.findNavController().navigate(R.id.action_SeasonFragment_to_addSeasonFragment)
        }

    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    fun initViews() {

        // recyclerView
        binding.recyclerView.adapter = adapter
        binding.recyclerView.layoutManager = LinearLayoutManager(requireContext())

    }
}
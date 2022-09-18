package com.alireza.claculatework.ui.day

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.alireza.claculatework.R
import com.alireza.claculatework.databinding.FragmentDayBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class DayFragment : Fragment(R.layout.fragment_day) {

    private var _binding: FragmentDayBinding? = null

    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentDayBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
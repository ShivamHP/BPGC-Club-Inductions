package com.devsoc.bpgcclubinductions.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.devsoc.bpgcclubinductions.R
import com.devsoc.bpgcclubinductions.databinding.FragmentSpecificClubBinding

class SpecificClubFragment : Fragment() {

    private lateinit var binding: FragmentSpecificClubBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_specific_club, container, false)
        return binding.root
    }
}
package com.example.probefragmente.startFragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import com.example.probefragmente.R
import com.example.probefragmente.databinding.FragmentStartBinding

class StartFragment : Fragment() {
    // Deklarieren
    lateinit var mBinding: FragmentStartBinding
    lateinit var mStartFragmentViewModel: StartFragmentViewModel
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Initialisieren
        mBinding = FragmentStartBinding.inflate(inflater, container, false)
        mBinding.lifecycleOwner = this
        mStartFragmentViewModel = ViewModelProvider(this).get(StartFragmentViewModel::class.java)
        // Verbinden
        mBinding.startFragmentViewModel = mStartFragmentViewModel
        return inflater.inflate(R.layout.fragment_start, container, false)
    }
}
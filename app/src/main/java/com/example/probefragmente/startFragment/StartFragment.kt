package com.example.probefragmente.startFragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.navigation.findNavController
import com.example.probefragmente.R
import com.example.probefragmente.databinding.FragmentStartBinding

class StartFragment : Fragment() {
    lateinit var mBinding: FragmentStartBinding
    val mStartFragmentViewModel: StartFragmentViewModel by viewModels()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        mBinding = FragmentStartBinding.inflate(inflater, container, false)
        mBinding.lifecycleOwner = viewLifecycleOwner
        mBinding.startFragmentViewModel = mStartFragmentViewModel

        // Navigation mit ButtonClick
        val mView = mBinding.root
        mBinding.buttonNavigateToSecondFragment.setOnClickListener {
            mView.findNavController().navigate(R.id.action_startFragment_to_secondFragment)
        }

        return mBinding.root
    }
}
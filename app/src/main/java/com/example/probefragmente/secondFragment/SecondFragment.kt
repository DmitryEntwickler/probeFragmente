package com.example.probefragmente.secondFragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.probefragmente.databinding.FragmentSecondBinding

class SecondFragment : Fragment() {

    lateinit var mBinding: FragmentSecondBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        mBinding = FragmentSecondBinding.inflate(inflater, container, false)
        mBinding.lifecycleOwner = this
        // die richtige View zurückgeben
        return mBinding.root
    }

}
package com.saymewhy.forfriend.testdevapp.ui.updates

import android.arch.lifecycle.ViewModelProvider
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.saymewhy.forfriend.testdevapp.R

class UpdatesFragment : Fragment() {

    companion object {
        fun newInstance() = UpdatesFragment()
    }

    private lateinit var viewModel: UpdatesViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_updates, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(
            this,
            ViewModelProvider.NewInstanceFactory()
        ).get(UpdatesViewModel::class.java)
        // TODO: Use the ViewModel
    }

}
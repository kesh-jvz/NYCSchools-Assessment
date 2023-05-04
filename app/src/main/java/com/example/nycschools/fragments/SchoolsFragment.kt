package com.example.nycschools.fragments

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.example.nycschools.adapter.SchoolsAdapter
import com.example.nycschools.databinding.FragmentSchoolsBinding
import com.example.nycschools.mvvm.viewmodel.SchoolNameViewModel
import com.example.nycschools.schoolModel.*
import com.google.gson.GsonBuilder
import com.google.gson.reflect.TypeToken
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext


@AndroidEntryPoint
class SchoolsFragment : Fragment() {
    private lateinit var binding:FragmentSchoolsBinding
    private val schoolNameViewModel:SchoolNameViewModel by viewModels()
    private var schoolsAdapter: SchoolsAdapter? = null
    private var schoolNameList:ArrayList<SchoolNameModel> = arrayListOf()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = FragmentSchoolsBinding.inflate(layoutInflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        initialization()

    }

    private fun initialization(){
        schoolNameViewModel.schoolNamesList.observe(viewLifecycleOwner){
            CoroutineScope(Dispatchers.IO).launch {
                val gson = GsonBuilder().create()
                schoolNameList = gson.fromJson(it, object :TypeToken<ArrayList<SchoolNameModel>>(){}.type)

                withContext(Dispatchers.Main){
                    schoolsAdapter = SchoolsAdapter(schoolNameList)
                    binding.schoolNameRV.adapter = schoolsAdapter
                    binding.loadingSchoolNames.visibility = View.GONE
                    schoolsAdapter?.itemClick = {dbn ->
                        val action = SchoolsFragmentDirections.actionSchoolsFragmentToSchoolsDetailFragment(dbn)
                        findNavController().navigate(action)
                    }
                }
            }



        }
    }


}
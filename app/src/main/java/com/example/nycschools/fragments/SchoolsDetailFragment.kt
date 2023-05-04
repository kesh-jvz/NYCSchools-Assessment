package com.example.nycschools.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.navArgs
import com.example.nycschools.databinding.FragmentSchoolsDetailBinding
import com.example.nycschools.mvvm.viewmodel.SchoolResultViewModel
import com.example.nycschools.schoolModel.SchoolResultModelItem
import com.google.gson.GsonBuilder
import com.google.gson.reflect.TypeToken
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

@AndroidEntryPoint
class SchoolsDetailFragment : Fragment() {
    private lateinit var binding:FragmentSchoolsDetailBinding
    private val schoolResultViewModel:SchoolResultViewModel by viewModels()
    private var schoolResultList:ArrayList<SchoolResultModelItem> = arrayListOf()
    var templist:SchoolResultModelItem? = null
    private val args:SchoolsDetailFragmentArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = FragmentSchoolsDetailBinding.inflate(layoutInflater,container,false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        initialization()

    }

    private fun initialization(){
        val dbName = args.dbn
        schoolResultViewModel.schoolDataList.observe(viewLifecycleOwner){
            CoroutineScope(Dispatchers.IO).launch {
                val gson = GsonBuilder().create()
                schoolResultList = gson.fromJson(it, object : TypeToken<ArrayList<SchoolResultModelItem>>(){}.type)
                schoolResultList.forEach { list ->
                    if (list.dbn == dbName){
                        templist = list
                    }
                }

                withContext(Dispatchers.Main){
                    binding.loadSchoolData.visibility = View.GONE
                    templist?.let {
                        binding.resultContainer.visibility = View.VISIBLE
                        binding.noDataFoundTV.visibility = View.GONE
                        binding.dbnTV.text = "DBN : ${templist?.dbn}"
                        binding.schoolNamesTV.text = "School Name : ${templist?.schoolName}"
                        binding.numOfSatTestTakers.text = "Number Of Test Takers : ${templist?.numOfSatTestTakers}"
                        binding.satCriticalReadingAvgScore.text = "Sat Critical Reading Avg Score : ${templist?.satCriticalReadingAvgScore}"
                        binding.satMathAvgScore.text = "Sat Math Avg Score : ${templist?.satMathAvgScore}"
                        binding.satWritingAvgScore.text = "Sat Writing Avg Score : ${templist?.satWritingAvgScore}"
                    }?: kotlin.run {
                        binding.resultContainer.visibility = View.GONE
                        binding.noDataFoundTV.visibility = View.VISIBLE
                    }

                }
            }

        }
    }

}
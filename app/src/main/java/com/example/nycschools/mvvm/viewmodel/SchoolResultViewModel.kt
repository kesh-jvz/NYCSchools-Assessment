package com.example.nycschools.mvvm.viewmodel

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.nycschools.mvvm.repository.SchoolNameRepository
import com.example.nycschools.mvvm.repository.SchoolResultRepository
import com.google.gson.JsonArray
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class SchoolResultViewModel @Inject constructor(var schoolResultRepository: SchoolResultRepository):ViewModel() {
    var _schoolDataList:MutableLiveData<JsonArray> = MutableLiveData()
    var schoolDataList:LiveData<JsonArray> = _schoolDataList


    init {
        loadAllSchoolData()
    }
    private fun loadAllSchoolData(){
        CoroutineScope(Dispatchers.IO).launch {
            val result = schoolResultRepository.getAllSchoolData()
            Log.d("**TAG", "loadAllSchoolNames: ${result}")
            if (result.isSuccessful){
                _schoolDataList.postValue(result.body())
            }

        }
    }

}
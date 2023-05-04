package com.example.nycschools.mvvm.viewmodel

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.nycschools.mvvm.repository.SchoolNameRepository
import com.google.gson.JsonArray
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class SchoolNameViewModel @Inject constructor(var schoolNameRepository: SchoolNameRepository):ViewModel() {
    var _schoolNameList:MutableLiveData<JsonArray> = MutableLiveData()
    var schoolNamesList:LiveData<JsonArray> = _schoolNameList


    init {
        loadAllSchoolNames()
    }
    private fun loadAllSchoolNames(){
        viewModelScope.launch(Dispatchers.IO) {
            val result = schoolNameRepository.getAllSchoolNames()
            Log.d("**TAG", "loadAllSchoolNames: ${result}")
            if (result.isSuccessful){
                _schoolNameList.postValue(result.body())
            }

        }
    }

}
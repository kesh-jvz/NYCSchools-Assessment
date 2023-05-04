package com.example.nycschools.mvvm.repository

import com.example.nycschools.interfaces.SchoolNameInterface
import com.example.nycschools.interfaces.SchoolResultInterface
import com.google.gson.JsonArray
import retrofit2.Response
import javax.inject.Inject

class SchoolResultRepository@Inject constructor(var schoolResultInterface: SchoolResultInterface) {
    suspend fun getAllSchoolData(): Response<JsonArray> {
        return schoolResultInterface.getSchoolData()
    }
}
package com.example.nycschools.mvvm.repository

import com.example.nycschools.interfaces.SchoolNameInterface
import com.google.gson.JsonArray
import retrofit2.Response
import javax.inject.Inject

class SchoolNameRepository @Inject constructor(var schoolNameInterface: SchoolNameInterface) {
    suspend fun getAllSchoolNames(): Response<JsonArray> {
        return schoolNameInterface.getSchoolNames()
    }
}
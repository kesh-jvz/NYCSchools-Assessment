package com.example.nycschools.interfaces

import com.google.gson.JsonArray
import retrofit2.Response
import retrofit2.http.GET

interface SchoolResultInterface {
    @GET("resource/f9bf-2cp4.json")
    suspend fun getSchoolData():Response<JsonArray>
}
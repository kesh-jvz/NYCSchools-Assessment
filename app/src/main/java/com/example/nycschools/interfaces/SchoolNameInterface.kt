package com.example.nycschools.interfaces

import com.google.gson.JsonArray
import retrofit2.Response
import retrofit2.http.GET

interface SchoolNameInterface {
    @GET("resource/s3k6-pzi2.json")
    suspend fun getSchoolNames():Response<JsonArray>
}
package com.example.nycschools.di

import com.example.nycschools.interfaces.SchoolNameInterface
import com.example.nycschools.interfaces.SchoolResultInterface
import com.example.nycschools.utils.ConstantsClass
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Named
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Singleton
    @Provides
    @Named("SchoolName")
    fun provideRetrofitInstance(): Retrofit {
        return Retrofit.Builder()
            .baseUrl(ConstantsClass.SCHOOL_BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    @Singleton
    @Provides
    fun provideSchoolNameApi(@Named("SchoolName") retrofit: Retrofit):SchoolNameInterface{
        return retrofit.create(SchoolNameInterface::class.java)
    }
    @Singleton
    @Provides
    fun provideResultApi(@Named("SchoolName") retrofit: Retrofit):SchoolResultInterface{
        return retrofit.create(SchoolResultInterface::class.java)
    }


}
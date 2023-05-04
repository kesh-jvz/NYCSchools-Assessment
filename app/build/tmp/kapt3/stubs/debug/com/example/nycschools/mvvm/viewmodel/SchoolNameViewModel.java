package com.example.nycschools.mvvm.viewmodel;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0015\u001a\u00020\u0016H\u0002R \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u0004R \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014\u00a8\u0006\u0017"}, d2 = {"Lcom/example/nycschools/mvvm/viewmodel/SchoolNameViewModel;", "Landroidx/lifecycle/ViewModel;", "schoolNameRepository", "Lcom/example/nycschools/mvvm/repository/SchoolNameRepository;", "(Lcom/example/nycschools/mvvm/repository/SchoolNameRepository;)V", "_schoolNameList", "Landroidx/lifecycle/MutableLiveData;", "Lcom/google/gson/JsonArray;", "get_schoolNameList", "()Landroidx/lifecycle/MutableLiveData;", "set_schoolNameList", "(Landroidx/lifecycle/MutableLiveData;)V", "getSchoolNameRepository", "()Lcom/example/nycschools/mvvm/repository/SchoolNameRepository;", "setSchoolNameRepository", "schoolNamesList", "Landroidx/lifecycle/LiveData;", "getSchoolNamesList", "()Landroidx/lifecycle/LiveData;", "setSchoolNamesList", "(Landroidx/lifecycle/LiveData;)V", "loadAllSchoolNames", "", "app_debug"})
public final class SchoolNameViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private com.example.nycschools.mvvm.repository.SchoolNameRepository schoolNameRepository;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<com.google.gson.JsonArray> _schoolNameList;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.LiveData<com.google.gson.JsonArray> schoolNamesList;
    
    @javax.inject.Inject()
    public SchoolNameViewModel(@org.jetbrains.annotations.NotNull()
    com.example.nycschools.mvvm.repository.SchoolNameRepository schoolNameRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.nycschools.mvvm.repository.SchoolNameRepository getSchoolNameRepository() {
        return null;
    }
    
    public final void setSchoolNameRepository(@org.jetbrains.annotations.NotNull()
    com.example.nycschools.mvvm.repository.SchoolNameRepository p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.google.gson.JsonArray> get_schoolNameList() {
        return null;
    }
    
    public final void set_schoolNameList(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<com.google.gson.JsonArray> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.google.gson.JsonArray> getSchoolNamesList() {
        return null;
    }
    
    public final void setSchoolNamesList(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LiveData<com.google.gson.JsonArray> p0) {
    }
    
    private final void loadAllSchoolNames() {
    }
}
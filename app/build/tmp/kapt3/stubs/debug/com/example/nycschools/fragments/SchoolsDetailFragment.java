package com.example.nycschools.fragments;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u001a\u001a\u00020\u001bH\u0002J$\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0016J\u001a\u0010$\u001a\u00020\u001b2\u0006\u0010%\u001a\u00020\u001d2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0016R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\t\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\r0\fj\b\u0012\u0004\u0012\u00020\r`\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u000f\u001a\u00020\u00108BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019\u00a8\u0006&"}, d2 = {"Lcom/example/nycschools/fragments/SchoolsDetailFragment;", "Landroidx/fragment/app/Fragment;", "()V", "args", "Lcom/example/nycschools/fragments/SchoolsDetailFragmentArgs;", "getArgs", "()Lcom/example/nycschools/fragments/SchoolsDetailFragmentArgs;", "args$delegate", "Landroidx/navigation/NavArgsLazy;", "binding", "Lcom/example/nycschools/databinding/FragmentSchoolsDetailBinding;", "schoolResultList", "Ljava/util/ArrayList;", "Lcom/example/nycschools/schoolModel/SchoolResultModelItem;", "Lkotlin/collections/ArrayList;", "schoolResultViewModel", "Lcom/example/nycschools/mvvm/viewmodel/SchoolResultViewModel;", "getSchoolResultViewModel", "()Lcom/example/nycschools/mvvm/viewmodel/SchoolResultViewModel;", "schoolResultViewModel$delegate", "Lkotlin/Lazy;", "templist", "getTemplist", "()Lcom/example/nycschools/schoolModel/SchoolResultModelItem;", "setTemplist", "(Lcom/example/nycschools/schoolModel/SchoolResultModelItem;)V", "initialization", "", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class SchoolsDetailFragment extends androidx.fragment.app.Fragment {
    private com.example.nycschools.databinding.FragmentSchoolsDetailBinding binding;
    private final kotlin.Lazy schoolResultViewModel$delegate = null;
    private java.util.ArrayList<com.example.nycschools.schoolModel.SchoolResultModelItem> schoolResultList;
    @org.jetbrains.annotations.Nullable()
    private com.example.nycschools.schoolModel.SchoolResultModelItem templist;
    private final androidx.navigation.NavArgsLazy args$delegate = null;
    
    public SchoolsDetailFragment() {
        super();
    }
    
    private final com.example.nycschools.mvvm.viewmodel.SchoolResultViewModel getSchoolResultViewModel() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.example.nycschools.schoolModel.SchoolResultModelItem getTemplist() {
        return null;
    }
    
    public final void setTemplist(@org.jetbrains.annotations.Nullable()
    com.example.nycschools.schoolModel.SchoolResultModelItem p0) {
    }
    
    private final com.example.nycschools.fragments.SchoolsDetailFragmentArgs getArgs() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void initialization() {
    }
}
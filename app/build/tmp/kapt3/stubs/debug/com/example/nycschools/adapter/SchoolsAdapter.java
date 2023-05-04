package com.example.nycschools.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u001cB\u001d\u0012\u0016\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006\u00a2\u0006\u0002\u0010\u0007J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\u001c\u0010\u0015\u001a\u00020\u000b2\n\u0010\u0016\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u0014H\u0016J\u001c\u0010\u0018\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0014H\u0016R(\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR*\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0007\u00a8\u0006\u001d"}, d2 = {"Lcom/example/nycschools/adapter/SchoolsAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/example/nycschools/adapter/SchoolsAdapter$ViewHolder;", "itemList", "Ljava/util/ArrayList;", "Lcom/example/nycschools/schoolModel/SchoolNameModel;", "Lkotlin/collections/ArrayList;", "(Ljava/util/ArrayList;)V", "itemClick", "Lkotlin/Function1;", "", "", "getItemClick", "()Lkotlin/jvm/functions/Function1;", "setItemClick", "(Lkotlin/jvm/functions/Function1;)V", "getItemList", "()Ljava/util/ArrayList;", "setItemList", "getItemCount", "", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "ViewHolder", "app_debug"})
public final class SchoolsAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.example.nycschools.adapter.SchoolsAdapter.ViewHolder> {
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<com.example.nycschools.schoolModel.SchoolNameModel> itemList;
    @org.jetbrains.annotations.Nullable()
    private kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> itemClick;
    
    public SchoolsAdapter(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.example.nycschools.schoolModel.SchoolNameModel> itemList) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.example.nycschools.schoolModel.SchoolNameModel> getItemList() {
        return null;
    }
    
    public final void setItemList(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.example.nycschools.schoolModel.SchoolNameModel> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit> getItemClick() {
        return null;
    }
    
    public final void setItemClick(@org.jetbrains.annotations.Nullable()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.example.nycschools.adapter.SchoolsAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.example.nycschools.adapter.SchoolsAdapter.ViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\r"}, d2 = {"Lcom/example/nycschools/adapter/SchoolsAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/example/nycschools/databinding/SchoolsItemLayoutBinding;", "(Lcom/example/nycschools/adapter/SchoolsAdapter;Lcom/example/nycschools/databinding/SchoolsItemLayoutBinding;)V", "getBinding", "()Lcom/example/nycschools/databinding/SchoolsItemLayoutBinding;", "setBinding", "(Lcom/example/nycschools/databinding/SchoolsItemLayoutBinding;)V", "bindData", "", "schoolModelItem", "Lcom/example/nycschools/schoolModel/SchoolNameModel;", "app_debug"})
    public final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private com.example.nycschools.databinding.SchoolsItemLayoutBinding binding;
        
        public ViewHolder(@org.jetbrains.annotations.NotNull()
        com.example.nycschools.databinding.SchoolsItemLayoutBinding binding) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.example.nycschools.databinding.SchoolsItemLayoutBinding getBinding() {
            return null;
        }
        
        public final void setBinding(@org.jetbrains.annotations.NotNull()
        com.example.nycschools.databinding.SchoolsItemLayoutBinding p0) {
        }
        
        public final void bindData(@org.jetbrains.annotations.NotNull()
        com.example.nycschools.schoolModel.SchoolNameModel schoolModelItem) {
        }
    }
}
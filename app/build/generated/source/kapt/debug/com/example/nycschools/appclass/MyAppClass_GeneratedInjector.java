package com.example.nycschools.appclass;

import dagger.hilt.InstallIn;
import dagger.hilt.codegen.OriginatingElement;
import dagger.hilt.components.SingletonComponent;
import dagger.hilt.internal.GeneratedEntryPoint;

@OriginatingElement(
    topLevelClass = MyAppClass.class
)
@GeneratedEntryPoint
@InstallIn(SingletonComponent.class)
public interface MyAppClass_GeneratedInjector {
  void injectMyAppClass(MyAppClass myAppClass);
}

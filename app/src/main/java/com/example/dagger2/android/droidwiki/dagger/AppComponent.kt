package com.example.dagger2.android.droidwiki.dagger

import com.example.dagger2.android.droidwiki.ui.homepage.HomepageActivity
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [AppModule::class, PresenterModule::class])
interface AppComponent
fun inject(target: HomepageActivity){
    
}
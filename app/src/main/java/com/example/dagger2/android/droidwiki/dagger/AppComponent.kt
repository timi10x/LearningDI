package com.example.dagger2.android.droidwiki.dagger

import com.example.dagger2.android.droidwiki.ui.homepage.HomepageActivity
import com.example.dagger2.android.droidwiki.ui.search.SearchActivity
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [AppModule::class, PresenterModule::class, NetworkModule::class, WikiModule::class])
interface AppComponent{
    fun inject(target: HomepageActivity)
    fun inject2(target: SearchActivity)
}

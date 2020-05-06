package com.example.dagger2.android.droidwiki.dagger

import com.example.dagger2.android.droidwiki.network.Homepage
import com.example.dagger2.android.droidwiki.network.Wiki
import com.example.dagger2.android.droidwiki.network.WikiApi
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class WikiModule {
    @Provides
    @Singleton
    fun provideHomePage(api: WikiApi) = Homepage(api)

    @Provides
    @Singleton
    fun provideWiki(api: WikiApi) = Wiki(api)
}
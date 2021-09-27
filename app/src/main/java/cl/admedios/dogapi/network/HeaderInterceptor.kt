package cl.admedios.dogapi.network

import android.content.Context
import cl.admedios.dogapi.util.Constants.acceptHeader
import cl.admedios.dogapi.util.Constants.applicationJson
import cl.admedios.dogapi.util.Constants.contentTypeHeader
import cl.smu.unimarcapp.data.netwok.api.RetroInstance
import cl.smu.unimarcapp.data.netwok.api.RetroService
import kotlinx.coroutines.runBlocking
import okhttp3.Interceptor
import okhttp3.Request
import okhttp3.Response

/**
 * Interceptor to add auth token to requests
 */

class HeaderInterceptor() : Interceptor {

    override fun intercept(chain: Interceptor.Chain): Response {
        val requestBuilder = chain.request().newBuilder()
        requestBuilder.addHeader(acceptHeader, applicationJson)
        requestBuilder.addHeader(contentTypeHeader, applicationJson)
        return chain.proceed(requestBuilder.build())
    }
}
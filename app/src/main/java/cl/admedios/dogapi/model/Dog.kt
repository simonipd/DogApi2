package cl.admedios.dogapi.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize


data class DogAPIResponse (
        val message: MutableList<String>,
        val status: String
)

package com.infinitelearning.savoricious.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
class ModelBahan (
    var namabahan : String? = null,
    var gambarbahan : Int = 0
        ):Parcelable
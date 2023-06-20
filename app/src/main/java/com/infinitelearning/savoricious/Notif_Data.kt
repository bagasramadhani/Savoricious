package com.infinitelearning.savoricious

import android.os.Parcel
import android.os.Parcelable

data class Notif_Data(val image:Int , val isinotif:String, val jam:String) : Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readInt(),
        parcel.readString()!!,
        parcel.readString()!!) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeInt(image)
        parcel.writeString(isinotif)
        parcel.writeString(jam)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Notif_Data> {
        override fun createFromParcel(parcel: Parcel): Notif_Data {
            return Notif_Data(parcel)
        }

        override fun newArray(size: Int): Array<Notif_Data?> {
            return arrayOfNulls(size)
        }
    }
}

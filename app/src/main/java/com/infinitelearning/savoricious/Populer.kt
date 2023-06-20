package com.infinitelearning.savoricious

import android.os.Parcel
import android.os.Parcelable

data class Populer(val gambarprofile:Int, val nama:String ,val gambarmenu:Int , val namamenu:String, val rating:String, val waktu:String, val penonton:String ) : Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readInt(),
        parcel.readString()!!,
        parcel.readInt(),
        parcel.readString()!!,
        parcel.readString()!!,
        parcel.readString()!!,
        parcel.readString()!!) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeInt(gambarprofile)
        parcel.writeString(nama)
        parcel.writeInt(gambarmenu)
        parcel.writeString(namamenu)
        parcel.writeString(rating)
        parcel.writeString(waktu)
        parcel.writeString(penonton)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Populer> {
        override fun createFromParcel(parcel: Parcel): Populer {
            return Populer(parcel)
        }

        override fun newArray(size: Int): Array<Populer?> {
            return arrayOfNulls(size)
        }
    }
}

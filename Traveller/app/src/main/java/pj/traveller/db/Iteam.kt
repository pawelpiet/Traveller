package pj.traveller.db

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "iteams")
data class Iteam(
    @PrimaryKey
    var photoUri: String,
    @ColumnInfo(name = "note")
    var note: String,
    @ColumnInfo(name = "place")
    var place: String,
    @ColumnInfo(name = "date")
    var date: String,
    @ColumnInfo(name="lat")
    var lat: Double?,
    @ColumnInfo(name="lon")
    var lon: Double?


)

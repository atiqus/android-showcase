package com.igorwojda.showcase.feature.album.data.datasource.api.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
internal data class AlbumListApiModel(
    @SerialName("album") val album: List<AlbumApiModel>,
)

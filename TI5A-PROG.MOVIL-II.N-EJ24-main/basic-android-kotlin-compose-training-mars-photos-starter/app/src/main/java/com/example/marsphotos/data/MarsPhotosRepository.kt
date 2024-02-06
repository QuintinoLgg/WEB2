package com.example.marsphotos.data

import com.example.marsphotos.model.MarsPhoto
import com.example.marsphotos.network.MarsApi

interface MarsPhotosRepository {
    suspend fun getMarsPhotos(): List<MarsPhoto>
}


class NetworkMarsPhotosRepository() : MarsPhotosRepository {
    override suspend fun getMarsPhotos(): String {
        return MarsApi.retrofitService.getPhotos()
    }
}
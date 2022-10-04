package com.example.minhamusicafavorita_mvvm.viewmodel

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.minhamusicafavorita_mvvm.model.Album
import com.example.minhamusicafavorita_mvvm.repository.AlbumRepository

class AlbumViewModel : ViewModel() {

    private val repository = AlbumRepository()
    private val _album: MutableLiveData<List<Album>> = MutableLiveData()
    val album: LiveData<List<Album>> = _album

    fun getAllAlbum() {
        try {
            _album.value = repository.getAlbumList()
        } catch (ex: Exception) {
            Log.i("Error", "------> ${ex.message}")
        }
    }
}
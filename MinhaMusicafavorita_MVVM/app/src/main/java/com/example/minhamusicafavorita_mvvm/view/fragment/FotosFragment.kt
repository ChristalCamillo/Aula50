package com.example.minhamusicafavorita_mvvm.view.fragment

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.GridLayoutManager
import com.example.minhamusicafavorita_mvvm.databinding.FragmentFotosBinding
import com.example.minhamusicafavorita_mvvm.model.Album
import com.example.minhamusicafavorita_mvvm.view.activity.AlbumActivity
import com.example.minhamusicafavorita_mvvm.view.adapter.AlbumAdapter
import com.example.minhamusicafavorita_mvvm.viewmodel.AlbumViewModel

class FotosFragment: Fragment() {

    private lateinit var binding: FragmentFotosBinding
    private var listaAlbuns = mutableListOf<Album>()

    private val viewModel: AlbumViewModel by lazy {
        ViewModelProvider(this)[AlbumViewModel::class.java]
    }
    private val adapter by lazy {
        AlbumAdapter(listaAlbuns, this::irParaDetalheAlbum)
    }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentFotosBinding.inflate(inflater, container, false)

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel.getAllAlbum()
        binding.rvAlbuns.adapter = adapter
        binding.rvAlbuns.layoutManager = GridLayoutManager(context, 2)

        observable()

    }

    fun irParaDetalheAlbum(album: Album) {
        val bundle = bundleOf("ALBUM" to album)
        val intent = Intent(context, AlbumActivity::class.java).apply {
            putExtra("BUNDLE", bundle)
        }
        startActivity(intent)
    }

    private fun observable() {
        viewModel.album.observe(this.viewLifecycleOwner) {
            adapter.atualizarListaAlbum(it)
        }
    }
}
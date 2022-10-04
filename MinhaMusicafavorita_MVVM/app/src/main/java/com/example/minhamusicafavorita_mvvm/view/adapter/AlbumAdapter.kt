package com.example.minhamusicafavorita_mvvm.view.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.minhamusicafavorita_mvvm.databinding.AlbumItemBinding
import com.example.minhamusicafavorita_mvvm.model.Album

class AlbumAdapter(
    private var listaAlbum: MutableList<Album>,
    private var clickDetalhes: (album: Album) -> Unit
) :
    RecyclerView.Adapter<AlbumAdapter.ViewHolder>() {
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ViewHolder {
        val binding = AlbumItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        val item = listaAlbum[position]
        holder.exibirDadosItensLista(item)
        holder.binding.cvItemLista.setOnClickListener {
            clickDetalhes(item)
        }

    }

    override fun getItemCount(): Int = listaAlbum.size

    class ViewHolder(val binding: AlbumItemBinding) : RecyclerView.ViewHolder(binding.root) {
        fun exibirDadosItensLista(album: Album){
            binding.ivAlbum.setImageResource(album.getImage())
        }
    }

    fun atualizarListaAlbum(novaLista: List<Album>) {
        listaAlbum.addAll(novaLista)
        notifyDataSetChanged()
    }


}
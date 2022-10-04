package com.example.minhamusicafavorita_mvvm.view.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.Toast
import com.example.minhamusicafavorita_mvvm.R
import com.example.minhamusicafavorita_mvvm.databinding.ActivityAlbumBinding
import com.example.minhamusicafavorita_mvvm.model.Album

class AlbumActivity : AppCompatActivity() {
    private lateinit var binding: ActivityAlbumBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityAlbumBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.title = "Detalhe do Album"

        val bundle = intent.getBundleExtra("BUNDLE")
        val album = bundle?.getParcelable<Album>("ALBUM")
        album?.let {
            binding.tvAlbumActivity1.text = it.getNome()
            binding.tvDetalhesAlbum.text = it.getDescricao()
            binding.tvArtista.text = getString(R.string.artista, it.getArtista())
            binding.tvLancamento.text = "Lançamento: ${it.getLancamento()}"
            binding.tvGravadora.text = "Gravadora: ${it.getGravadora()}"
            binding.tvEstudio.text = "Estudio: ${it.getEstudio()}"
            binding.tvFormato.text = "Formato: ${it.getFormato()}"
            binding.tvGenero.text = "Genero: ${it.getGenero()}"
            binding.ivFotoAlbumDetalhe.setImageResource(album.getImage())
            binding.ivCoracao.setOnClickListener {
                Toast.makeText(this, "Album adicionado aos favoritos", Toast.LENGTH_SHORT).show()
            }
        }
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId == android.R.id.home) {
            this.finish()
            return true
        }
        return super.onOptionsItemSelected(item)
    }
}
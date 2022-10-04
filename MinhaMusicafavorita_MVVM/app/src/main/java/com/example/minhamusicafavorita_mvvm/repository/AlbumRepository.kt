package com.example.minhamusicafavorita_mvvm.repository

import com.example.minhamusicafavorita_mvvm.R
import com.example.minhamusicafavorita_mvvm.model.Album

class AlbumRepository {

    fun getAlbumList(): List<Album> {
        val albumList = mutableListOf<Album>()

        albumList.add(
            Album(
                R.drawable.laurel_hell,
                "Laurel Hell",
                "Laurel Hell é o sexto álbum de estúdio do cantor e compositor nipo-americano Mitski, lançado em 4 de fevereiro de 2022, pela Dead Oceans. Patrick Hyland produziu o álbum, que se caracterizou como um disco que mistura synth-pop, indie pop e rock eletrônico.",
                "Mitski",
                2022,
                "Dead Oceans",
                "Unknow",
                "Digital",
                "Synth-pop, indie pop, electro-rock"
            )
        )

        albumList.add(
            Album(
                R.drawable.cowboy,
                "Be the Cowboy",
                "Be the Cowboy é o quinto álbum de estúdio da cantora nipo-americana Mitski. O seu lançamento ocorreu em 17 de agosto de 2018 por intermédio da gravadora Dead Oceans. Produzido pelo colaborador de longa data Patrick Hyland, o álbum amplia a paleta de Mitski com um retorno ao piano, presente em seus dois primeiros álbuns, em conjunto com sintetizadores, trompas e a guitarra que se tornou seu instrumento notável. Após seu lançamento, Be the Cowboy recebeu aclamação universal de críticos musicais, que depois a ranquearam entre os melhores álbuns de 2018. Foi precedido pelos singles, \"Geyser\", \"Nobody\" e \"Two Slow Dancers\"",
                "Mitski",
                2018,
                "Dead Oceans",
                "Unknow",
                "Cd, Digital",
                "Indie rock, art pop"
            )
        )
        albumList.add(
            Album(
                R.drawable.puberty,
                "Puberty 2",
                "Puberty 2 é o quarto álbum de estúdio do cantor e compositor de indie rock nipo-americano Mitski, lançado em 17 de junho de 2016, o primeiro lançamento pela Dead Oceans. Foi produzido pelo colaborador de longa data Patrick Hyland.",
                "Mitski",
                2016,
                "Dead Oceans",
                "Unknow",
                "LP, CD, Digital",
                "Indie rock"
            )
        )
        albumList.add(
            Album(
                R.drawable.bury_me,
                "Bury Me at Makeout Creek",
                "Bury Me at Makeout Creek é o terceiro álbum de estúdio da música de rock indie nipo-americana Mitski, lançado pela Double Double Whammy em 11 de novembro de 2014",
                "Mitski",
                2014,
                "Double Double Whammy",
                "Unknow",
                "CD, Digital",
                "Indie rock, Rock, Folk music"
            )
        )
        albumList.add(
            Album(
                R.drawable.retired,
                "Retired from Sad, New Career in Business",
                "Retired from Sad, New Career in Business é o segundo álbum de estúdio do músico nipo-americano Mitski. Mitski lançou o projeto em 1º de agosto de 2013 enquanto ainda era estudante na SUNY Purchase. O álbum foi seu projeto sênior e contou com uma orquestra de estudantes de 60 peças.",
                "Mitski",
                2013,
                "Mitski",
                "None",
                "LP",
                "Orchestral pop"
            )
        )
        albumList.add(
            Album(
                R.drawable.lush,
                "Lush",
                "Lush é o primeiro álbum de estúdio do músico nipo-americano Mitski. Mitski lançou o álbum por conta própria em 31 de janeiro de 2012 como seu projeto de primeiro ano na SUNY Purchase. Foi mixado por Scot Moriarty.",
                "Mitski",
                2012,
                "Mitski",
                "None",
                "CD",
                "Chamber pop"
            )
        )
        return albumList
    }
}
package com.aluracursos.screenmatch.modelos;

public class Serie extends Titulo {
    int temporadas;
    int episodiosPorTemporadas;
    int minutosPorEpisodio;

    @Override
    public int getDuracionEnMinutos() {
        return temporadas * episodiosPorTemporadas * minutosPorEpisodio;
    }

    public int getTemporadas() {
        return this.temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;  // Corregido: asigna el parámetro a la variable de instancia
    }

    public int getEpisodiosPorTemporadas() {
        return this.episodiosPorTemporadas;
    }

    public void setEpisodiosPorTemporadas(int episodiosPorTemporadas) {
        this.episodiosPorTemporadas = episodiosPorTemporadas;  // Corregido: asigna el parámetro a la variable de instancia
    }

    public int getMinutosPorEpisodio() {
        return this.minutosPorEpisodio;
    }

    public void setMinutosPorEpisodio(int minutosPorEpisodio) {
        this.minutosPorEpisodio = minutosPorEpisodio;  // Corregido: asigna el parámetro a la variable de instancia
    }
}

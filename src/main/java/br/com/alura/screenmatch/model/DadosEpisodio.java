package br.com.alura.screenmatch.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.Comparator;

@JsonIgnoreProperties(ignoreUnknown = true)
public record DadosEpisodio(
        @JsonAlias("Title")
        String titulo,
        @JsonAlias("Episode")
        Integer numero,
        @JsonAlias("imdRating")
        String avaliacao,
        @JsonAlias("Released")
        String dataDeLancamento) {

}

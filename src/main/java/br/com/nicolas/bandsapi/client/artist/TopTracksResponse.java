package br.com.nicolas.bandsapi.client.artist;

import java.util.List;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

import br.com.nicolas.bandsapi.model.Track;

@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public record TopTracksResponse(List<Track> tracks) {

}

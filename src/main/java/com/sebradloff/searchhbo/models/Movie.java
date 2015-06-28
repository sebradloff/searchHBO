package com.sebradloff.searchhbo.models;

/**
 * Created by sradloff on 6/7/15.
 */
public class Movie {
    private Long movie_id;
    private Long hboId;
    private String title;
    private Long releaseYear;
    private String imdbId;
    private Long rottenTomatoesId;
    private String thumbnailURL;

    public Movie(Long movie_id, Long hboId, String title, Long releaseYear, String imdbId, Long rottenTomatoesId, String thumbnailURL ){
        this.movie_id = movie_id;
        this.hboId = hboId;
        this.title = title;
        this.releaseYear = releaseYear;
        this.imdbId = imdbId;
        this.rottenTomatoesId = rottenTomatoesId;
        this.thumbnailURL = thumbnailURL;
    }


}

package com.sebradloff.searchhbo.mappers;

import com.sebradloff.searchhbo.models.Movie;
import org.apache.ibatis.annotations.One;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sradloff on 6/7/15.
 */
public interface MovieMapper {

    @Select(
            "SELECT * from movie"
    )
    @Results(value = {
            @Result(property = "movie_id"),
            @Result(property = "hboId"),
            @Result(property = "title"),
            @Result(property = "releaseYear"),
            @Result(property = "imdbId"),
            @Result(property = "rottenTomatoesId"),
            @Result(property = "thumbnailURL")
    })
    ArrayList<Movie> findAll();
}

package com.sebradloff.searchhbo.services;

import com.sebradloff.searchhbo.mappers.MovieMapper;
import com.sebradloff.searchhbo.models.Movie;
import org.apache.ibatis.session.SqlSession;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.mockito.MockitoAnnotations.initMocks;

/**
 * Created by sradloff on 6/27/15.
 */
public class MovieServiceTest {

    MovieService movieService;

    @Mock
    SqlSession sqlSession;
    @Mock
    MovieMapper movieMapper;

    @Before
    public void setUp() throws Exception {
        initMocks(this);
        when(sqlSession.getMapper(MovieMapper.class)).thenReturn(movieMapper);
        movieService = new MovieService(sqlSession);
    }

    @Test
    public void shouldFetchAllMovies(){
        //given
        Movie movie1 = new Movie(1L,1L, "Terminator", 1984L, "1234", 1L, "www.terminator.com");
        Movie movie2 = new Movie(2L,2L, "Lethal Weapon", 1987L, "1235", 2L, "www.lethal-weapon.com");
        Movie movie3 = new Movie(3L,3L, "Die Hard", 1988L, "1236", 3L, "www.die-hard.com");

        ArrayList<Movie> movies = new ArrayList<Movie>(Arrays.asList(movie1,movie2,movie3));

        //when
        when(movieMapper.findAll()).thenReturn(movies);

        ArrayList<Movie> result =  movieService.getAllMovies();

        //then

        assertEquals(movies, result);
    }

}
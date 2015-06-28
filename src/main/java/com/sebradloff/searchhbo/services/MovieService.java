package com.sebradloff.searchhbo.services;

import com.sebradloff.searchhbo.mappers.MovieMapper;
import com.sebradloff.searchhbo.mappers.MyBatisUtil;
import com.sebradloff.searchhbo.models.Movie;
import org.apache.ibatis.session.SqlSession;

import java.util.ArrayList;

/**
 * Created by sradloff on 6/27/15.
 */
public class MovieService {
    private final SqlSession sqlSession;
    private final MovieMapper movieMapper;

    public MovieService() {
        this(MyBatisUtil.getSqlSessionFactory().openSession());
    }

    public MovieService(SqlSession sqlSession) {
        this.sqlSession = sqlSession;
        this.movieMapper = sqlSession.getMapper(MovieMapper.class);
    }

    public ArrayList<Movie> getAllMovies() {
        return movieMapper.findAll();
    }
}

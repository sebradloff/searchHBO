CREATE TABLE movie (
    movie_id serial PRIMARY KEY,
    hboId INTEGER NOT NULL,
    title VARCHAR(255),
    releaseYear INTEGER,
    imdbId VARCHAR(50),
    rottenTomatoesId INTEGER,
    thumbnailURL VARCHAR(255)
);
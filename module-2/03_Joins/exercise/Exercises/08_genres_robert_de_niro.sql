-- 8. The genres of movies that Robert De Niro has appeared in that were released in 2010 or later, sorted alphabetically.
-- (6 rows)

SELECT DISTINCT genre_name
FROM genre
JOIN movie_genre ON movie_genre.genre_id = genre.genre_id
JOIN movie_actor ON movie_actor.movie_id = movie_genre.movie_id
JOIN person ON person.person_id = movie_actor.actor_id
JOIN movie ON movie.movie_id = movie_actor.movie_id
WHERE person.person_name = 'Robert De Niro' AND movie.release_date >= '01/01/2010'
ORDER BY genre_name

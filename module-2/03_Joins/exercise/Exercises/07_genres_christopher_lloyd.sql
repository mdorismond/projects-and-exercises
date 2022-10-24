-- 7. The genres of movies that Christopher Lloyd has appeared in, sorted alphabetically.
-- (8 rows) Hint: DISTINCT will prevent duplicate values in your query results.

SELECT genre_name
FROM genre
JOIN person ON genre.genre_id = person.person_id
JOIN movie ON person.person_id = movie.movie_id
WHERE person.person_name = 'Christopher LLoyd'
ORDER BY genre_name

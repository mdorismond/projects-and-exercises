-- 4. The titles and taglines of all the movies that are in the Fantasy genre. 
-- Order the results by title (A-Z).
-- (81 rows)

SELECT title, tagline
FROM movie
JOIN movie_genre ON movie.movie_id = movie_genre.movie_id
JOIN genre ON movie_genre.genre_id = genre.genre_id
WHERE genre_name = 'Fantasy'
ORDER BY title




--(INNER) JOIN: Returns records that have matching values in both tables
  --LEFT (OUTER)-- JOIN: Returns all records from the left table, and the matched records from the right table
  --RIGHT (OUTER) JOIN: Returns all records from the right table, and the matched records from the left table
  --FULL (OUTER) JOIN: Returns all records when there is a match in either left or right table

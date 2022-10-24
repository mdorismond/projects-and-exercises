-- 11. The titles of the movies in the "Star Wars Collection" ordered by release date, most recent first. 
-- (9 rows)

SELECT title
FROM movie
JOIN movie ON collection
WHERE title LIKE ('Star Wars Collection')

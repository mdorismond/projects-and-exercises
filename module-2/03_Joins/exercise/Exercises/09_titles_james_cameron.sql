-- 9. The titles of movies directed by James Cameron, sorted alphabetically.
-- (6 rows)

SELECT title
FROM movie
JOIN director_id ON person_id
JOIN

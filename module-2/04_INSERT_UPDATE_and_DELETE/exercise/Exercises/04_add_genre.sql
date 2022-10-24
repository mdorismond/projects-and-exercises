-- 4. Add a "Sports" genre to the genre table. Add the movie "Coach Carter" to the newly created genre. (1 row each)

INSERT INTO genre
VALUES (23,''Sports'')



INSERT INTO movie_genre

VALUES((select movie_id from movie where title='COACH CARTER'),23)

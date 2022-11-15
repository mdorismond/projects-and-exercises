# DAO QuizMaker
This version of QuizMaker includes two DAO implementations: one for reading from text files and one for reading from a database. Which one is used depends on whether a `DB_URL` environment variable is set or not.

Typical values for the environment variables would be:
* DB_URL = `jdbc:postgresql://localhost:5432/quiz_db`
* DB_USER = `postgres`
* DB_PASSWORD = `postgres1`

SQL for creating the database is in the `database` folder. It includes two questions for one quiz (`test_quiz`). The database design allows for questions to be associated with multiple quizzes.

After starting the program, enter a quiz name (`test_quiz` or `another_quiz`, for example) and the corresponding quiz will be loaded from a text file with that name (plus the `.txt` extension) or from the database.

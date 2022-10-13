-- INSERT

-- Add Disneyland to the park table. (It was established on 7/17/1955, has an area of 2.1 square kilometers and does not offer camping.)

INSERT INTO park (park_name, date_established, area, --)
--

-- Add Hawkins, IN (with a population of 30,000 and an area of 38.1 square kilometers) and Cicely, AK (with a popuation of 839 and an area of 11.4 square kilometers) to the city table.

INSERT INTO -- (city_name, state_abbreviation, --, -- )
VALUES ('Hawkins'---), 
	   ('Cicely'---);

-- Since Disneyland is in California (CA), add a record representing that to the park_state table.

INSERT INTO park_state (park_id, --)
SELECT park_id, --
FROM -- 
WHERE -- = '--';


-- UPDATE

-- Change the state nickname of California to "The Happiest Place on Earth."

UPDATE --
SET state_nickname = '--'
WHERE s-- = --

-- Increase the population of California by 1,000,000.

UPDATE --
SET population = --
WHERE s-- = '--';

-- Change the capital of California to Anaheim.

UPDATE --
SET capital = (SELECT city_id 
			   FROM -- 
			   WHERE city_name = '--' 
			   AND state_abbreviation = '--') 
WHERE state_abbreviation = '--';

-- Change California's nickname back to "The Golden State", reduce the population by 1,000,000, and change the capital back to Sacramento.

UPDATE --
SET state_nickname = '--',
    population = -- - --,
    capital = (SELECT city_id 
			   FROM --  
			   WHERE city_name = '--' 
			   AND state_abbreviation = '--')
WHERE state_abbreviation = '--';


-- DELETE

-- Delete Hawkins, IN from the city table.

DELETE FROM -- 
WHERE city_name = '--' AND s-- = '--';

-- Delete all cities with a population of less than 1,000 people from the city table.

DELETE FROM -- 
WHERE population --;


-- REFERENTIAL INTEGRITY

-- Try adding a city to the city table with "XX" as the state abbreviation.

INSERT INTO city (city_name, state_abbreviation, -- , --)
VALUES ('Springfield', 'XX', -- , --);

-- Try deleting California from the state table.

DELETE FROM state
WHERE s-- = '--';

-- Try deleting Disneyland from the park table. Try again after deleting its record from the park_state table.

DELETE FROM --
WHERE p-- = 'Disneyland';

DELETE FROM park_state
WHERE park_id = (SELECT park_id 
				 FROM park 
				 WHERE park_name = 'Disneyland');


-- CONSTRAINTS

-- NOT NULL constraint
-- Try adding Smallville, KS to the city table without specifying its population or area.

INSERT INTO city (city_name, --)
VALUES ('--', '--');

-- DEFAULT constraint
-- Try adding Smallville, KS again, specifying an area but not a population.

INSERT INTO city (city_name, state_abbreviation, --)
VALUES ('--', '--', 0.5);

-- Retrieve the new record to confirm it has been given a default, non-null value for population.

SELECT *
FROM --
WHERE city_name = '--';

-- UNIQUE constraint
-- Try changing California's nickname to "Vacationland" (which is already the nickname of Maine).

UPDATE state
-- --  = 'Vacationland'
WHERE state_abbreviation = '--';

-- CHECK constraint
-- Try changing the census region of Florida (FL) to "Southeast" (which is not a valid census region).

UPDATE state-- census_region = '--'
SET --
WHERE state_abbreviation = '--';


-- TRANSACTIONS

-- Delete the record for Smallville, KS within a transaction.

START TRANSACTION;
DELETE FROM city
WHERE city_name = 'Smallville' AND state_abbreviation = 'KS';
COMMIT;

-- Delete all of the records from the park_state table, but then "undo" the deletion by rolling back the transaction.

START TRAN--;
				  
-- FROM park_state;
SELECT COUNT(*) FROM --;
RO------;
SELECT COUNT(*) FROM --;

-- Update all of the cities to be in the state of Texas (TX), but then roll back the transaction.

START TRAN--;
				  
UPDATE city 
SET state_abbreviation = '--';
SELECT city_name, -- FROM city LIMIT --;
ROLL--;
SELECT city_name, -- FROM city LIMIT --;


-- Demonstrate two different SQL connections trying to access the same table where one is inside of a transaction but hasn't committed yet.
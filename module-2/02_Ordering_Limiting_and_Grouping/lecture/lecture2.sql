-- ORDERING RESULTS

-- Populations of all states from largest to smallest.
-- Note DESC in ORDER BY

SELECT state_name, population
FROM state
-- 


-- States sorted alphabetically (A-Z) within their census region. The census regions are sorted in reverse alphabetical (Z-A) order.
-- Note order of columns in the ORDER BY: census_region is the major sort, state_name the minor sort,
--   meaning it's sorted within the major column, i.e. census_region.
-- Note order of columns in the SELECT only controls order columns are returned (i.e. "displayed"), not sort order.

SELECT state_name, census_region
FROM state
-- 

-- The biggest park by area
-- Note that area isn't in the SELECT, but is used in the ORDER BY

SELECT park_name
FROM park
--  


-- LIMITING RESULTS

-- The 10 largest cities by populations
-- Note ORDER BY to sort city population from largest to smallest.
-- Note TOP 10 limits the number of results (i.e. "rows") returned. It has nothing to do with sort order, as in
--   returning the 10 "top" (i.e. largest populated) cities.

SELECT city_name, population
FROM city
-- 
--

-- The 20 oldest parks from oldest to youngest in years, sorted alphabetically by name.

-- Note use of alternative calculates and/or non-aggregate functions to calculate age of park in years. (Pick one to show students)
-- Note TOP 20 returns rows where several of the parksare the same age in years.
-- Note park_name ASC in ORDER BY means parks that are the same years in age will be returned in alphabetic
--   order within the shared age.

SELECT CURRENT_DATE - date_established AS age, park_name 
-- above difference between the two dates is given in days
--SELECT (CURRENT_DATE - date_established) / 365 AS age, park_name -- divide difference by 365 to determine years
--SELECT (date_part('year', CURRENT_DATE) - date_part('year', date_established)) AS age, park_name
--SELECT (EXTRACT(year FROM CURRENT_DATE) - EXTRACT(year FROM date_established)) AS age, park_name

FROM park
--
--



-- CONCATENATING OUTPUTS

-- All city names and their state abbreviation.
-- Note surrounding "()" on state abbreviation.
-- Note the implied default ASC in ORDER BY. In general practice, only DESC is typically specified in the
--   SQL as needed.
-- Note building strings is typically not done within the SQL. Normally, the raw values are returned, and
--   concatenating is done within the application code that requested the data from the database.

SELECT (city_name || ' (' || state_abbreviation || ')') AS city_state_abbreviation
FROM city
--

-- All park names and area
-- Note "Name: " and " Area: " in the concatenated string

SELECT -- ( "Name: " and " Area: " ) -- as park_area
FROM park
ORDER BY -- ;

-- The census region and state name of all states in the West & Midwest sorted in ascending order.
-- Note colon-space between census region and state -- "census_region: state"
-- (optional) Note alternative ORDER BY, discuss why just the column names in the ORDER BY still returns
--   the same results as using the region_and_state concatenated string alias.

SELECT (census_region || ': ' || state_name) AS region_and_state
FROM state
WHERE census_region ILIKE '%--'
ORDER BY --


-- AGGREGATE FUNCTIONS

-- Average population across all the states. Note the use of alias, common with aggregated values.

SELECT --(population) AS avg_state_population
FROM --

-- Total population in the West and South census regions

SELECT --(population) AS west_south_population
FROM state
WHERE census_region = 'West' OR -- = '--';

-- The number of cities with populations greater than 1 million

SELECT --(population) AS -- 
FROM city
WHERE -- > 

-- The number of state nicknames.
-- Note COUNT(*) is commonly used to specify a row count rather than counting a specific column.
-- Note difference in the counts. NULL state nicknames are ignored by COUNT(state_nickname).

SELECT --(state_nickname) AS nickname_count, COUNT(*) AS --
FROM state;

-- The area of the smallest and largest parks.
-- Note SQL statements aren't limited to just one aggregate function at a time.

SELECT --(area) AS smallest, --(area) AS --
FROM park;


-- GROUP BY

-- Count the number of cities in each state, ordered from most cities to least.
-- Note state_abbreviation can be included in SELECT because it's included in GROUP BY.

SELECT --(city_name) AS cities, state_abbreviation
FROM city
GROUP BY -- 
-- 


-- Determine the average park area depending upon whether parks allow camping or not.

SELECT has_camping, --(area) AS -- 
FROM park
GROUP BY -- 

-- Sum of the population of cities in each state ordered by state abbreviation.

SELECT state_abbreviation, --(population) as sum_city_population
FROM city
GROUP BY --
--


-- The smallest city population in each state ordered by city population.

SELECT state_abbreviation, --(population) AS smallest_city_population
FROM city
GROUP BY --
ORDER BY smallest_city_population;



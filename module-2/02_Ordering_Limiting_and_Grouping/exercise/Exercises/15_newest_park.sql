-- 15. The name and date established of the newest national park.
-- (1 row)
SELECT date_established, park_name
FROM park
ORDER BY park_name
LIMIT 1

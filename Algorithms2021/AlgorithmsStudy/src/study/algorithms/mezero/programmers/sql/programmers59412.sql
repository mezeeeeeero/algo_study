SELECT HOUR(DATETIME) HOUR, COUNT(DATETIME) COUNT
FROM ANIMAL_OUTS
GROUP BY HOUR(DATETIME)
HAVING HOUR BETWEEN 9 and 19
ORDER BY HOUR
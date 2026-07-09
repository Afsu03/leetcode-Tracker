-- Last updated: 7/9/2026, 9:53:48 AM
SELECT email
FROM Person
GROUP BY email
HAVING COUNT(*)>1;
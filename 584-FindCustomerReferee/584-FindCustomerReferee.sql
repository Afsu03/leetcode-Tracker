-- Last updated: 7/31/2026, 9:03:08 AM
SELECT name
FROM Customer
WHERE referee_id!=2
OR referee_id IS NULL;
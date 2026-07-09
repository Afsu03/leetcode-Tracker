-- Last updated: 7/9/2026, 9:53:53 AM
SELECT 
 p.firstname,
 p.lastname,
 a.city,
 a.state
 FROM person p
 LEFT JOIN Address a
 ON p.personId=a.personId;
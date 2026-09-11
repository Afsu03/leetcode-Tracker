-- Last updated: 9/11/2026, 2:12:25 PM
SELECT eu.unique_id, e.name
FROM Employees e
LEFT JOIN EmployeeUNI eu
ON e.id = eu.id;
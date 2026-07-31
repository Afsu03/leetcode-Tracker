-- Last updated: 7/31/2026, 9:02:08 AM
SELECT eu.unique_id, e.name
FROM Employees e
LEFT JOIN EmployeeUNI eu
ON e.id = eu.id;
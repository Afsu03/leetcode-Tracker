-- Last updated: 7/9/2026, 9:53:50 AM
SELECT e.name AS Employee
FROM Employee e
JOIN Employee m
ON e.managerID = m.id
WHERE e.salary > m.salary;
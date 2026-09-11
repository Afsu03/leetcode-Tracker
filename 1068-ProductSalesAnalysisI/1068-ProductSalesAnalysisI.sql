-- Last updated: 9/11/2026, 2:13:03 PM
SELECT p.product_name, s.year, s.price
FROM Sales s
JOIN Product p
ON s.product_id = p.product_id;
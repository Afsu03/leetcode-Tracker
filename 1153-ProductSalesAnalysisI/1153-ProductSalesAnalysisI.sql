-- Last updated: 7/31/2026, 9:02:36 AM
SELECT p.product_name, s.year, s.price
FROM Sales s
JOIN Product p
ON s.product_id = p.product_id;
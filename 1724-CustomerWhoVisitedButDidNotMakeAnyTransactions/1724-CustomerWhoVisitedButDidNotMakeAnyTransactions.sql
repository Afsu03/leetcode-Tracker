-- Last updated: 8/1/2026, 9:14:13 PM
SELECT
v.customer_id,
COUNT(*) AS count_no_trans
FROM Visits v
LEFT JOIN Transactions t
ON v.visit_id = t.visit_id
WHERE t.transaction_id IS NULL
GROUP BY v.customer_id;

-- Last updated: 9/11/2026, 2:11:44 PM
SELECT
v.customer_id,
COUNT(*) AS count_no_trans
FROM Visits v
LEFT JOIN Transactions t
ON v.visit_id = t.visit_id
WHERE t.transaction_id IS NULL
GROUP BY v.customer_id;

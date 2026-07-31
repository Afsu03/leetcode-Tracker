-- Last updated: 7/31/2026, 9:02:28 AM
SELECT DISTINCT author_id AS id
FROM Views
WHERE author_id = viewer_id
ORDER BY id;
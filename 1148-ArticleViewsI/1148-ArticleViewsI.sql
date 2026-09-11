-- Last updated: 9/11/2026, 2:12:50 PM
SELECT DISTINCT author_id AS id
FROM Views
WHERE author_id = viewer_id
ORDER BY id;
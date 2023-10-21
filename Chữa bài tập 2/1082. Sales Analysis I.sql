SELECT seller_id
FROM Sales
GROUP BY seller_id
HAVING SUM(price) = (
    SELECT SUM(price) AS sm
    FROM Sales
    GROUP BY seller_id
    ORDER BY sm DESC
    LIMIT 1
);

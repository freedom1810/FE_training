SELECT name AS warehouse_name, SUM(units * dimension) AS volume
FROM (
    SELECT product_id, Width * Length * Height AS dimension
    FROM Products
) a
JOIN Warehouse AS b ON a.product_id = b.product_id
GROUP BY name;

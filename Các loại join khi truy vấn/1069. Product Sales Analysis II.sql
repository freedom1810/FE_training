SELECT product_id, SUM(quantity) AS total_quantity
FROM Sales s
GROUP BY product_id;

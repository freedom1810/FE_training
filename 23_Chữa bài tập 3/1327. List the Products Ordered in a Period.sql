
SELECT a.product_name, SUM(unit) AS unit
FROM Products a
LEFT JOIN Orders b ON a.product_id = b.product_id
WHERE b.order_date BETWEEN '2020-02-01' AND '2020-02-29'
GROUP BY a.product_id
HAVING SUM(unit) >= 100;
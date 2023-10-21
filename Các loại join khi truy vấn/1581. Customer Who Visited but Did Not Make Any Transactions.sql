SELECT customer_id, SUM(transaction_id IS NULL) AS count_no_trans
FROM Visits
LEFT JOIN Transactions USING(visit_id)
GROUP BY customer_id
HAVING count_no_trans > 0;

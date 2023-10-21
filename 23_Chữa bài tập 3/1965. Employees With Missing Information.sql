
SELECT e.employee_id
FROM Employees e
LEFT JOIN Salaries s USING(employee_id)
WHERE salary IS NULL
UNION ALL
SELECT s.employee_id
FROM Employees e
RIGHT JOIN Salaries s USING(employee_id)
WHERE name IS NULL
ORDER BY employee_id;

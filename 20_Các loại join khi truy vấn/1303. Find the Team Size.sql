SELECT e.employee_id, (SELECT COUNT(team_id) FROM Employee WHERE e.team_id = team_id) AS team_size
FROM Employee e;

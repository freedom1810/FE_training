SELECT
	a.player_id,
	min(a.event_date) first_login
FROM
	Activity a
GROUP BY
	a.player_id;
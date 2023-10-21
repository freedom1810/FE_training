SELECT user_id, COUNT(distinct follower_id) AS followers_count
from Followers
GROUP BY user_id;
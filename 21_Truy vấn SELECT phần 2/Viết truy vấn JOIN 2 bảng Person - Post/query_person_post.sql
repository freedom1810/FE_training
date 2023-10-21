-- 1 Hiển thị các bài viết của Person làm nghề Programmer được tạo sau ngày 01/01/2023
SELECT p.*
FROM Post p
         JOIN Person u ON p.authorId = u.id
WHERE u.occupation = 'Programmer' AND p.createdAt > '2023-01-01';

-- 2 Tính tổng số lượng bài Post trong năm 2022
SELECT COUNT(*)
FROM Post
WHERE YEAR(createdAt) = 2022;

-- 3 Hiển thị thông tin người dùng có bài Post trong năm 2022
SELECT DISTINCT u.*
FROM Person u
         JOIN Post p ON u.id = p.authorId
WHERE YEAR(p.createdAt) = 2022;

-- 4 Hiển thị thông tin người dùng và title bài Post của 3 bài post mới nhất
SELECT u.*, p.title
FROM Person u
         JOIN Post p ON u.id = p.authorId
ORDER BY p.createdAt DESC
    LIMIT 3;

-- 5 nThống kê số lượng bài Post của từng người
SELECT u.name, COUNT(p.id) AS post_count
FROM Person u
         LEFT JOIN Post p ON u.id = p.authorId
GROUP BY u.name;

-- 6 Thống kê số lượng bài Post của những người ở China
SELECT u.name, COUNT(p.id) AS post_count
FROM Person u
         JOIN Post p ON u.id = p.authorId
WHERE u.country = 'China'
GROUP BY u.name;

-- 7 Thống kê số lượng bài Post của những người có sở thích Swimming trong năm 2023
SELECT u.name, COUNT(p.id) AS post_count
FROM Person u
         JOIN Post p ON u.id = p.authorId
WHERE u.interests LIKE '%Swimming%' AND YEAR(p.createdAt) = 2023
GROUP BY u.name;

-- 8 Tìm kiếm tháng có nhiều bài post nhất trong năm 2023
SELECT MONTH(createdAt) AS month, COUNT(*) AS post_count
FROM Post
WHERE YEAR(createdAt) = 2023
GROUP BY month
ORDER BY post_count DESC
    LIMIT 1;

-- 9 Tìm kiếm năm có ít bài post nhất
SELECT YEAR(createdAt) AS year, COUNT(*) AS post_count
FROM Post
GROUP BY year
ORDER BY post_count
    LIMIT 1;

-- 10 Tìm kiếm năm có nhiều bài post nhất
SELECT YEAR(createdAt) AS year, COUNT(*) AS post_count
FROM Post
GROUP BY year
ORDER BY post_count DESC
    LIMIT 1;

-- 11 Hiển thị thông tin người dùng có nhiều bài post nhất trong năm 2023
SELECT u.*, COUNT(p.id) AS post_count
FROM Person u
         JOIN Post p ON u.id = p.authorId
WHERE YEAR(p.createdAt) = 2023
GROUP BY u.name
ORDER BY post_count DESC
    LIMIT 1;

-- 11 Nếu có nhiều người cùng số lượng bài post là lớn nhất
SELECT u.*, COUNT(p.id) AS post_count
FROM Person u
         JOIN Post p ON u.id = p.authorId
WHERE YEAR(p.createdAt) = 2023
GROUP BY u.name
HAVING COUNT(p.id) = (
    SELECT MAX(post_count)
    FROM (
    SELECT COUNT(id) AS post_count
    FROM Post
    WHERE YEAR(createdAt) = 2023
    GROUP BY authorId
    ) AS PostCounts
    );


-- 12 Hiển thị thông tin những người dùng có nhiều hơn 2 bài post trong năm 2022
SELECT u.*, COUNT(p.id) AS post_count
FROM Person u
         JOIN Post p ON u.id = p.authorId
WHERE YEAR(p.createdAt) = 2022
GROUP BY u.name
HAVING post_count > 2;

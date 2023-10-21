-- Tạo bảng Post
CREATE TABLE Post (
    post_id INT AUTO_INCREMENT PRIMARY KEY,
    title VARCHAR(250),
    content TEXT,
    created DATETIME,
    author VARCHAR(100),
    category ENUM('Sport', 'Politics', 'Health', 'Tourism', 'Economy', 'Education', 'Technology', 'Science'),
    is_published BOOLEAN
);

-- Chèn ít nhất một bản ghi vào bảng Post
INSERT INTO Post (title, content, created, author, category, is_published)
VALUES ('Sample Post Title', 'This is a sample post content.', NOW(), 'John Doe', 'Sport', true);

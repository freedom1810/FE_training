-- Tạo bảng Product
CREATE TABLE Product (
    product_id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(300),
    description TEXT,
    manufacturer VARCHAR(250),
    madein VARCHAR(100),
    unit_price INT,
    category ENUM('Quần áo', 'Mỹ phẩm', 'Đồ chơi', 'Dụng cụ học tập', 'Máy tính', 'Di động', 'Điện tử dân dụng', 'Văn phòng')
);

-- Chèn ít nhất một bản ghi vào bảng Product
INSERT INTO Product (name, description, manufacturer, madein, unit_price, category)
VALUES ('Sample Product', 'This is a sample product description.', 'ABC Electronics', 'USA', 500, 'Máy tính');

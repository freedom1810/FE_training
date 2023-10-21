-- Bài tập 2: Đưa ra tên của những khách hàng đã mua hàng sau ngày 1996-08-01:
SELECT CustomerName
FROM Customers
WHERE CustomerID IN (
    SELECT CustomerID
    FROM Orders
    WHERE OrderDate > '1996-08-01'
);

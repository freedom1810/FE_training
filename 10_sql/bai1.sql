-- Bài tập 1:
-- Đưa ra tên, tên liên lạc, địa chỉ các khách hàng có tên hoặc tên liên lạc chứa Maria
-- Customers(CustomerID,	CustomerName,	ContactName,	Address	City,	PostalCode	Country)


SELECT CustomerName, ContactName, Address
FROM Customers
WHERE CustomerName LIKE '%Maria%' OR ContactName LIKE '%Maria%';
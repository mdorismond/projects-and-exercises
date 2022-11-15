SELECT * FROM customer;
SELECT * FROM vehicle;
SELECT * FROM purchase;

SELECT c.customer_id, c.customer_name, c.address, c.phone, c.emailaddress 
FROM customer c
JOIN purchase p ON c.customer_id = p.customer_id
WHERE p.purchase_id = 1;

SELECT p.purchase_id, p.customer_id, p.vehicle_id, p.purchase_date, p.vehicle_count
FROM purchase p
JOIN customer c ON p.customer_id = c.customer_id
WHERE c.customer_name = 'Amazon';

SELECT c.customer_id, c.customer_name, c.address, c.phone, c.emailaddress, 
p.purchase_date, p.vehicle_id, p.vehicle_count 
FROM customer c
JOIN purchase p ON c.customer_id = p.customer_id
WHERE c.customer_name = 'UPS';

SELECT c.customer_id, c.customer_name, c.address, c.phone, c.emailaddress, 
p.purchase_date, p.vehicle_id, v.vehicle_name, p.vehicle_count 
FROM customer c
JOIN purchase p ON c.customer_id = p.customer_id
JOIN vehicle v ON p.vehicle_id = v.vehicle_id
WHERE c.customer_name = 'UPS';

INSERT INTO customer (customer_name, address, phone, emailaddress) 
VALUES ('Walmart', '1234 consumer lane, illinois, 60131', '12345671234', 'customersupport@walmart.com');

SELECT * FROM customer;

INSERT INTO purchase (customer_id, vehicle_id, purchase_date, vehicle_count) 
VALUES (3, 3, '2022-10-29', 800);

SELECT * FROM purchase;

SELECT c.customer_id, c.customer_name, c.address, c.phone, c.emailaddress, 
p.purchase_date, p.vehicle_id, v.vehicle_name, p.vehicle_count 
FROM customer c
JOIN purchase p ON c.customer_id = p.customer_id
JOIN vehicle v ON p.vehicle_id = v.vehicle_id
WHERE c.customer_name = 'Walmart';

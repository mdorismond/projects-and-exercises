begin transaction;

drop table if exists purchase, vehicle, customer cascade;
--drop table if exists purchase;
--drop table if exists vehicle;
--drop table if exists customer;

create table customer 
(
  customer_id serial,
  customer_name varchar(50) not null,
  address varchar(100) not null,
  phone varchar(11) not null,
  emailAddress varchar(50),
  constraint pk_customer primary key (customer_id)
);

create table vehicle
(
  vehicle_id serial,
  vehicle_name varchar(20) not null,
  price int not null,
  constraint pk_vehicle primary key (vehicle_id)
);

create table purchase
(
  purchase_id serial,
  customer_id int not null,
  vehicle_id int not null,
  purchase_date timestamp not null,
  vehicle_count int not null,
  constraint pk_purchase primary key (purchase_id),
  constraint fk_purchase_customer foreign key (customer_id) references customer (customer_id),
  constraint fk_puchase_vehicle foreign key (vehicle_id) references vehicle (vehicle_id)
);

INSERT INTO customer (customer_name, address, phone, emailaddress)
VALUES ('Amazon', '410 Terry Ave N, Seattle 98109', '12062661000', 'cs-reply@amazon.com');
INSERT INTO customer (customer_name, address, phone, emailaddress)
VALUES ('UPS', '55 Glenlake Pkwy, Ne Atlanta, GA 30328', '18887425877', 'customer.service@ups.com');

INSERT INTO vehicle (vehicle_name, price) VALUES ('EDV-500', 100000);
INSERT INTO vehicle (vehicle_name, price) VALUES ('EDV-700', 120000);
INSERT INTO vehicle (vehicle_name, price) VALUES ('EDV-900', 130000);

INSERT INTO purchase (customer_id, vehicle_id, purchase_date, vehicle_count) 
VALUES (1, 1, '2022-10-28', 800);
INSERT INTO purchase (customer_id, vehicle_id, purchase_date, vehicle_count) 
VALUES (1, 2, '2022-11-03', 200);
INSERT INTO purchase (customer_id, vehicle_id, purchase_date, vehicle_count) 
VALUES (1, 3, '2022-11-05', 100);
INSERT INTO purchase (customer_id, vehicle_id, purchase_date, vehicle_count) 
VALUES (2, 3, '2022-10-29', 500);

commit;
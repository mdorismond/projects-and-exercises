--drop table customer_purchases;
--drop table art;
--drop table artists;
--drop table customers;

BEGIN TRANSACTION;

CREATE TABLE c--
(
	c--
	name --
	address -- 
	phone --

	constraint pk-- primary key (--)
);

CREATE --
(
	a--
	f--
	l--
	
	c-- pk_-- primary --
);

CREATE TABLE a--
(
	artCode-- serial,
	title --
	a--

	c--      (artCodeId),
	constraint fk_-- foreign -- (--) references artists (--)
);

CREATE --
(
	c--
	a-
	pur-- timestamp --
	pr-- money --

	c-- pk_c-- primary key (cust--, art--, pur--),
	constraint fk_-- foreign key (customerId) references -- (cu--),
	constraint fk-- (artCodeId) references art(--)
);


COMMIT TRANSACTION;




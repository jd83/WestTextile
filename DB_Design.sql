#CREATE DATABASE west_textile;

CREATE TABLE user
(
user_id INT NOT NULL,
user_name VARCHAR(20) NOT NULL, 
display_name VARCHAR(30) NOT NULL, 
password VARBINARY(20) NOT NULL,
qq_number INT,
career VARCHAR(20),
age INT,
identity_id VARBINARY(20),
indate DATE NOT NULL,
note VARCHAR(100),
PRIMARY KEY(user_id)
)ENGINE=InnoDB DEFAULT CHARSET=gb2312;

CREATE TABLE shops
(
shop_id INT NOT NULL,
shop_name VARCHAR(20) NOT NULL,
shop_type VARCHAR(10) NOT NULL,
shop_square DEC(5,2) DEFAULT 000.00,
shop_price INT DEFAULT 0,
build_number INT,
floor_number INT,
user_id INT,
note VARCHAR(100),
PRIMARY KEY(shop_id)
)ENGINE=InnoDB DEFAULT CHARSET=gb2312;

CREATE TABLE event
(
event_id INT NOT NULL,
event_title VARCHAR(100) NOT NULL,
event_address VARCHAR(100) NOT NULL,
event_date DATE NOT NULL,
event_content VARCHAR(500),
part_member_count INT,
PRIMARY KEY(event_id)
)ENGINE=InnoDB DEFAULT CHARSET=gb2312;
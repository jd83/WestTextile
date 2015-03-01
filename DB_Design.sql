#CREATE DATABASE west_textile;

CREATE TABLE user
(
userid INT AUTO_INCREMENT,
isadmin TINYINT(1) default 0,
isvalidate TINYINT(1) default 0,
username VARCHAR(20) NOT NULL, 
displayname VARCHAR(30) NOT NULL, 
password VARCHAR(30) NOT NULL,
qqnumber INT,
career VARCHAR(20),
name VARCHAR(20),
sex CHAR(2),
age INT,
identityid VARCHAR(20),
indate timestamp default current_timestamp,
note VARCHAR(100),
PRIMARY KEY(userid)
)ENGINE=InnoDB DEFAULT CHARSET=gb2312;

CREATE TABLE shops
(
shopid INT AUTO_INCREMENT,
shopname VARCHAR(20) NOT NULL,
shoptype VARCHAR(10) NOT NULL,
shopsquare DEC(5,2) DEFAULT 000.00,
shopprice  DEC(10,2),
shopamount INT DEFAULT 0,
buildnumber INT,
floornumber INT,
username VARCHAR(20), 
note VARCHAR(100),
indate timestamp default current_timestamp,
PRIMARY KEY(shopid)
)ENGINE=InnoDB DEFAULT CHARSET=gb2312;

CREATE TABLE event
(
eventid INT AUTO_INCREMENT,
eventtitle VARCHAR(100) NOT NULL,
eventaddress VARCHAR(100) NOT NULL,
eventdate DATETIME NOT NULL,
eventcontent VARCHAR(500),
partmember_count INT,
indate timestamp default current_timestamp,
PRIMARY KEY(eventid)
)ENGINE=InnoDB DEFAULT CHARSET=gb2312;
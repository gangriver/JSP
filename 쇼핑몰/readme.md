#DB

CREATE TABLE review (
	purchase_num VARCHAR(30),
	product_num VARCHAR(10),
	review_date DATE,
	score integer,
	review_content varchar(2000),
	member_Id VARCHAR(15)
	);

create table employees(
	emp_num 	varchar(30) ,
	EMP_ID  	VARCHAR(10) NOT NULL ,
	EMP_PW  	VARCHAR(200) NOT NULL ,
	EMP_NAME  	VARCHAR(50)  NOT NULL ,
	EMP_ADDR  	VARCHAR(200) NOT NULL ,
	EMP_ADDR_detail	VARCHAR(30) ,
	EMP_post	VARCHAR(6) NOT NULL ,
	EMP_PHONE   VARCHAR(13)  NOT NULL ,
	emp_jumin 	varchar(14) NOT NULL ,
	EMP_EMAIL   VARCHAR(200) NOT null,
	emp_enter_date Date NOT null
	);


CREATE TABLE purchase (
	purchase_num VARCHAR(30),
	purchase_date DATE not null,
	purchase_price integer not null,
	delivery_addr varchar(200),
	delivery_addr_detail varchar(30),
	delivery_post varchar(6),
	delivery_phone VARCHAR(13),
	message VARCHAR(200),
	purchase_status VARCHAR(20),
	member_Num VARCHAR(30)
	);

CREATE TABLE product_inquire (
inquire_num NUMBER GENERATED ALWAYS as IDENTITY(START with 1 INCREMENT by 1)
	product_Num VARCHAR(10),
	member_Num varchar(30),
	inquire_subject VARCHAR(100) not null,
	inquire_content VARCHAR(2000) not null,
	inquire_kind VARCHAR(20) not null,
	inquire_date date not null,
	inquire_answer VARCHAR(2000) ,
	inquire_answer_date date,
	emp_num varchar(30) 
	);

CREATE TABLE product (
	product_num VARCHAR(10),
	product_name VARCHAR(100) not null ,
	product_price integer not null,
	product_content VARCHAR(2000) not null,
	product_main_store VARCHAR(500)not null,
	product_main_store_img VARCHAR(500)not null,
	product_images VARCHAR(500) ,
	product_images_img VARCHAR(500) ,
	delivery_cost integer default 0,
	visit_count integer default 0,
	emp_num varchar(30) ,
	product_regist date not null,
	update_emp_num varchar(30),
	product_update_date date
	);

CREATE TABLE members (
	member_Num VARCHAR(30),
	member_Id VARCHAR(15) NOT NULL,
	member_Pw VARCHAR(200) NOT NULL,
	member_Name VARCHAR(15) NOT NULL,
	member_addr VARCHAR(200) NOT NULL,
	member_addr_detail VARCHAR(30) ,
	member_post VARCHAR(6) NOT NULL,
	member_phone1 VARCHAR(13) NOT NULL,
	member_phone2 VARCHAR(13),
	member_regist DATE NOT NULL, 
	member_birth DATE NOT NULL, 
	gender CHAR(1)  NOT NULL,
	member_email VARCHAR(100) NOT NULL,
	member_email_conf CHAR(1)
    );

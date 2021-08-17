CREATE TABLE PRODUCT3 (
	PRODUCT_ID VARCHAR2(15) PRIMARY KEY,
	P_NAME VARCHAR2(15) NOT NULL,
	PRICE NUMBER(20) NOT NULL,
	DESCRIPTION VARCHAR2(30),
	STOCK NUMBER(15) NOT NULL
);

DROP TABLE PRODUCT3;
SELECT * FROM PRODUCT3;

INSERT INTO PRODUCT3
VALUES('nb_ss7','삼성노트북',1570000,'시리즈7',10);

INSERT INTO PRODUCT3
VALUES('nb_ama4','맥북에어',1200000,'xcode4',20);

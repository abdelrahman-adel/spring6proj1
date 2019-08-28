CREATE TABLE PERSON (
	ID INTEGER NOT NULL,
	NAME VARCHAR(255) NOT NULL,
	LOCATION VARCHAR(255),
	BIRTH_DATE TIMESTAMP,
	PRIMARY KEY (ID)
);

INSERT INTO PERSON	(ID, NAME, LOCATION, BIRTH_DATE)
VALUES	(100001, 'Abd-Elrahman Adel', 'Egypt', '1994-08-07 00:00:00');

INSERT INTO PERSON	(ID, NAME, LOCATION, BIRTH_DATE)
VALUES	(100002, 'Ahmed Osama', 'UK', '1991-04-22 00:00:00');

INSERT INTO PERSON	(ID, NAME, LOCATION, BIRTH_DATE)
VALUES	(100003, 'Lotfi', 'USA', '1979-11-17 00:00:00');

INSERT INTO PERSON	(ID, NAME, LOCATION, BIRTH_DATE)
VALUES	(100004, 'Mohamed Sameh', 'Sudan', '1993-01-10 00:00:00');

COMMIT;

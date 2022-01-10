CREATE TABLE BOOK (    ISBN VARCHAR(32) NOT NULL UNIQUE PRIMARY KEY,
                        TITLE VARCHAR(60) NOT NULL UNIQUE,
                        AUTHOR VARCHAR(60) NOT NULL,
                        PRICE DECIMAL (6,2) NOT NULL,
			QUANTITY INTEGER NOT NULL);

INSERT INTO BOOK(ISBN, TITLE, AUTHOR, PRICE, QUANTITY) VALUES('9780671820862', 'Captain America: Holocaust For Hire', 'Joseph Silva', 29.90, 20);

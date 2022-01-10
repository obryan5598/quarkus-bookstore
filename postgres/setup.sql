DROP TABLE IF EXISTS BOOK;

GRANT ALL PRIVILEGES ON ALL TABLES IN SCHEMA public TO "testUser";
GRANT ALL PRIVILEGES ON ALL SEQUENCES IN SCHEMA public TO "testUser";

CREATE TABLE BOOK (     ID SERIAL PRIMARY KEY,
		   	ISBN VARCHAR(32) NOT NULL UNIQUE,
                        TITLE VARCHAR(60) NOT NULL UNIQUE,
                        AUTHOR VARCHAR(60) NOT NULL,
                        PRICE DECIMAL (6,2) NOT NULL,
			QUANTITY INTEGER NOT NULL);

/* For a complete list refer to https://en.wikipedia.org/wiki/List_of_novels_based_on_comics */

INSERT INTO BOOK(ISBN, TITLE, AUTHOR, PRICE, QUANTITY) VALUES('9780671820862', 'Captain America: Holocaust For Hire', 'Joseph Silva', 29.90, 20);
INSERT INTO BOOK(ISBN, TITLE, AUTHOR, PRICE, QUANTITY) VALUES('9780671820855', 'The Incredible Hulk: Cry of the Beast', 'Richard S. Meyers', 24.90, 30);
INSERT INTO BOOK(ISBN, TITLE, AUTHOR, PRICE, QUANTITY) VALUES('9780671820893', 'Iron Man: And Call My Killer...MODOK!', 'William Rotsler', 20.90, 22);
INSERT INTO BOOK(ISBN, TITLE, AUTHOR, PRICE, QUANTITY) VALUES('9780399140020', 'Spider-Man: The Venom Factor', 'Diane Duane', 18.90, 18);


ALTER TABLE BOOK OWNER TO "testUser";

INSERT INTO library_db.author (id, name, date_of_birth) VALUES (1, 'Ali Mohammad', '1980-11-20');
INSERT INTO library_db.author (id, name, date_of_birth) VALUES (2, 'Berfin Flora', '2001-06-11');


INSERT INTO library_db.book (id, title, price) VALUES (1, '1984', 200);
INSERT INTO library_db.book (id, title, price) VALUES (2, 'Communist Manifesto', 100);
INSERT INTO library_db.book (id, title, price) VALUES (3, 'Anti-Duhring', 150);

INSERT INTO library_db.authors_books (author_id, book_id) VALUES (1, 1);
INSERT INTO library_db.authors_books (author_id, book_id) VALUES (2, 1);
INSERT INTO library_db.authors_books (author_id, book_id) VALUES (1, 2);
INSERT INTO library_db.authors_books (author_id, book_id) VALUES (2, 3);

SELECT * FROM library.books;
#1. Retrieve the titles and publication dates of all books written by a specific author.
select title,publication_date from library.books where author_id=3;

#2. Retrieve the names of authors who have written books in a specific genre.
select author_name from library.authors  where id in(select id from library.geners where id=3);

#3. Retrieve the number of available books for each genre.
select genre_id,available from library.books;

#4. Retrieve the titles of books that have been borrowed by a specific member.
select b.title from  library.books b  join library.members m on b.book_id=m.id  where m.id= 4 ;

#5. Retrieve the names of members who have borrowed books in a specific genre.
select m.member_name from library.members m join library.books b on b.genre_id=m.id where b.genre_id=1 group by m.member_name ;

#6. Retrieve the titles of books that have not been reviewed.
select b.title from library.books b join library.reviews r on b.book_id = r.review_id  group by  b.title;

#7. Retrieve the member names and loan dates for books that were borrowed within a specific date range.
select m.member_name,l.loan_date from library.members m join library.loans l where loan_date='2023-06-07' group by m.member_name;

#8. Retrieve the average rating for books written by a specific author.
select r.book_id ,avg(r.rating ) from library.reviews r join library.authors a on r.book_id=a.id  where a.id=5 group by r.book_id  ;

#9. Retrieve the titles of books that have been reviewed with a rating higher than a specific value.
SELECT title FROM library.books WHERE book_id  in (SELECT book_id FROM library.reviews WHERE rating >4) ORDER BY title;

#10. Retrieve the member names and their corresponding loan dates for books with a specific publication year
select m.member_name,l.loan_date from library.members m join library.books b join library.loans l where publication_date = '2012-06-05';

 


 
 


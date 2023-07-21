DELIMITER //
CREATE PROCEDURE library.get_books_review_rating(in book_id_p INT, in rating_p INT,out total_books_review_p INT, out avg_book_rating_p INT)
BEGIN
 select sum(review_id) into total_books_review_p from library.reviews where book_id=book_id_p;
 select avg(rating) into avg_book_rating_p from library.reviews where book_id= book_id_p group by rating_p;

END //

set @total_books_review_p=0;
set @avg_book_rating_p=0;
call library.get_books_review_rating(1,3,@total_books_review_p,@avg_book_rating_p);
select @total_books_review_p,@avg_book_rating_p;
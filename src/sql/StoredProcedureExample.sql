DELIMITER //
CREATE PROCEDURE sakila.get_n_top_rented_films(in num_param INT)
BEGIN 
select f.film_id,f.title,count(r.rental_id) as rental_count from sakila.film f inner join sakila.inventory i on f.film_id=i.film_id 
inner join sakila.rental r on i.inventory_id=r.inventory_id group by f.film_id,f.title order by rental_count desc limit num_param;

END //

call sakila.get_n_top_rented_films(10);

DELIMITER //
CREATE PROCEDURE sakila.get_customer_rental_revenue(in customer_id_p INT, out rental_count_p INT,out total_revenue_p DECIMAL(10,2))
BEGIN
select count(rental_id) into rental_count_p from sakila.rental where customer_id=customer_id_p;
select sum(amount) into total_revenue_p from sakila.payment p inner join sakila.rental r on p.rental_id=r.rental_id 
where r.customer_id=customer_id_p;
END //


set @rental_count=0;
set @total_revenue=0.0;
call sakila.get_customer_rental_revenue(1,@rental_count,@total_revenue);
select @rental_count,@total_revenue;





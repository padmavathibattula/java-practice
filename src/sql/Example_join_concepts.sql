select count(*) from sakila.actor;# 200
select count(*) from sakila.film;# 1000
select count(*) from sakila.film_actor;# 5462 joining table
select a.first_name,a.last_name,count(f.title) total_movies  from sakila.actor a  inner join sakila.film_actor fa on a.actor_id=fa.actor_id 
inner join sakila.film f on f.film_id=fa.film_id group by a.first_name,a.last_name order by total_movies desc limit 3 ;# 5462


select count(*) from sakila.language;# 6
select count(*) from sakila.film;# 1000
select count(*) from sakila.language l inner join sakila.film f on l.language_id=f.language_id; # 1000
select * from sakila.language l left join sakila.film f  on l.language_id=f.language_id where f.film_id is null; # 1005=1000(inner join)+5(left join)records
select count(*) from sakila.language l right join sakila.film f on l.language_id= f.language_id;# 1000=1000(inner join)+0(ouer join)records
select count(*) from sakila.language l cross join sakila.film f ; # 6000 =6*1000 left table*right table


select * from sakila.language l left join sakila.film f  on l.language_id=f.language_id union 
select * from sakila.language l right join sakila.film f on l.language_id= f.language_id ; # 1005=inner join(1000)+left(5) +right(0)
                                                                                           # inner join(500)+left(510-500)+right(610-500)=
                                                                                                     #500+10+110=620
create database music_library;
use music_library;
create table artists(
artist_id INT Primary Key Auto_Increment,
name  VARCHAR(100) Not Null); 

create table genres(
genre_id INT Primary Key Auto_Increment,
name  VARCHAR(50)  Not Null);

create table playlists(
playlist_id  INT  Primary Key Auto_Increment,
   name VARCHAR(100) Not Null);
   
create table albums(
album_id INT  Primary Key Auto_Increment,
 title  VARCHAR(100) Not Null,
 release_date DATE Not Null,
  artist_id  INT Not Null, 
  Foreign Key(artist_id)references artists(artist_id));
  
  create table songs(
song_id  INT Primary Key Auto_Increment,
title  VARCHAR(100) Not Null,
duration INT Not Null,
genre VARCHAR(50),
album_id INT Not Null,
name VARCHAR(100) Not Null,
 Foreign Key(album_id)references albums(album_id)); 
 
 create table playlist_songs(
 playlist_song_id INT Primary Key Auto_Increment,
 playlist_id  INT Not Null,
 song_id INT Not Null,
 Foreign Key(playlist_id)references playlists(playlist_id ),
 Foreign Key (song_id)references songs(song_id));

  
insert into artists( name)
values
   ('John Smith'),
   ('Alice Johnson'),
   ('Robert Davis');
   
insert into albums(artist_id,title,release_date)
  values
   (1,'Album One','2020-05-10'),
   (1,'Album Two','2018-02-15'),
   (2,'Debut Album','2019-09-20'),
   (3,'Collection','2021-11-30');
   
insert into songs(album_id,title,name,duration,genre)
   values
   (1,'Song One','Tumsey Pyaar Karke',240,'Pop'),
   (1,'Song Two','Kuch Baatien',180,'Rock'),
   (2,'Song Three','Doobey',210,'Pop'),
   (3,'Debut Song','Raatan Lambiyan',195,'Electronic'),
   (3,'Another Song','Barsaat Ki Dhun',220,'Rock'),
   (4,'Collection Song','Ranjhaa',275,'Pop');
   
   insert into playlists(name)
   values
   ('Workout'),
   ('Chill'),
   ('Party');
   
insert into playlist_songs( playlist_id,song_id)
  values
   (1,1),
   (1,3),
   (1,5),
   (2,2),
   (2,4),
   (3,1),
   (3,2),
   (3,6);
   
insert into genres(name)
   values
   ('Pop'),
   ('Rock'),
   ('Electronic');
   
select * from artists;
select title from albums;
select name from songs;
select name from  artists where artist_id in(select artist_id from albums where release_date='2020-05-10' );
select title from albums where release_date like '2020%';

select name,genre from songs where genre='pop';
select name,duration from songs where duration>200;
select title,artist_id from albums where artist_id in (select artist_id  from artists where artist_id=1);
select name from artists  where gener in(select gener from songs where gener='Rock');
select name from songs where name in(select name from playlists where name='party');

SELECT * FROM music_library.songs;
select album_id from songs where genre='Pop' ; 
select name from artists where artist_id in
(select artist_id from albums where album_id in
(select album_id from songs where genre='Electronic'));

select name from artists where artist_id in
(select artist_id from albums where album_id in
(select album_id from songs where genre='Rock'));

SELECT * FROM music_library.playlist_songs;
select * from songs where song_id in
(select song_id from playlist_songs where playlist_id in
(select playlist_id from playlists where name='Party'));




  

 

 
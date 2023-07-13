SELECT * FROM music_library.albums;
#1. Retrieve the names of all artists who have released albums in a specific genre.
select a.name from music_library.artists a join music_library.songs s where genre='Rock' group by a.name;

#2. Retrieve the titles of albums released within a specific date range.
select title from music_library.albums where release_date='2018-02-15';
#3. Retrieve the titles of songs with a duration greater than a specific value from a specific album.
SELECT title FROM music_library.songs WHERE duration >275 in (SELECT album_id FROM music_library.songs where album_id=1 ) ORDER BY title;

#4. Retrieve the names of playlists that contain a specific song.
select name from music_library.playlists where playlist_id in(select song_id from music_library.playlist_songs where song_id=1);
#5. Retrieve the total duration of all songs in a specific genre.
select duration,count(duration)total_duration from music_library.songs where genre='Rock' group by duration;

#6. Retrieve the names of artists who have songs in more than one genre.
SELECT a.artist_id, a.name, COUNT(*) songs_id
FROM music_library.songs s JOIN music_library.artists a ON a.artist_id = s.album_id
GROUP BY a.artist_id, a.name
HAVING COUNT(*) > 1;

#7. Retrieve the titles of albums with the most number of songs.
select title,count(*)album_id from music_library.songs group by title;

#8. Retrieve the names of artists who have songs in all available genres
select name from music_library.artists where artist_id in
(select artist_id from music_library.albums where album_id in
(select album_id from music_library.songs genre));

#9. Retrieve the titles of albums that have at least one song from each genre


#10. Retrieve the names of playlists that have more than a specific number of songs
SELECT p.name, count(*)songs_id FROM music_library.playlists p join music_library.playlist_songs ps on p.playlist_id=ps.song_id  where song_id=1  group by p.name having COUNT(*) > 1;



 




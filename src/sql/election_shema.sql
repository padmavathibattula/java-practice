create database election;

use election;

create table candidate(
candidate_id INT primary key Auto_increment,
candidate_name varchar(100) Not null,
party_name varchar(100) Not null,
constituency varchar(200) Not null,
cast  varchar(100) not null);


insert into candidate(candidate_name,party_name,constituency,cast)
values
('John Smith','Independent','Constituency A','oc'),
('Jane Doe','Green Party','Constituency B','Bc'),
('Michael Johnson','Liberal Party','Constituency C','sc'),
('Sarah Brown','Conservative Party','Constituency D','st');

create table voters(
voter_id INt primary key Auto_increment,
voter_name varchar(200) not null,
voted_address varchar(200) not null,
voter_constituency varchar(100) not null);

insert into voters(voter_name,voted_address,voter_constituency)
values
('Robert Johnson','123 Main St','Constituency A'),
('Emily Davis','456 Elm St','Constituency B'),
('William Smith','789 Oak St','Constituency C'),
('Sophia Wilson','321 Maple St','Constituency D'),
('Michael Anderson','567 Pine St','Constituency A'),
('Olivia Martin','890 Cedar St','Constituency B'),
('Ethan Taylor','432 Birch St','Constituency C'),
('Ava Rodriguez','765 Walnut St','Constituency D'),
('Liam Clark','234 Spruce St','Constituency A'),
('Sophia Martinez','567 Fir St','Constituency B');

create table votes(
vote_id INT primary key Auto_increment,
voter_id INT Not null,
candidate_id INT Not null,
 Foreign Key(voter_id)references voters(voter_id ),
 Foreign Key (candidate_id)references candidate(candidate_id));
 
 insert into votes(voter_id,candidate_id)
values
(1,2),
(2,3),
(3,1),
(4,4),
(5,1),
(6,2),
(7,3),
(8,4),
(9,2),
(10,1),
(1,4),
(2,1),
(3,3),
(4,2),
(5,4);


create table results(
total_votes INT not null,
candidate_id INT not null,
Foreign Key (candidate_id)references candidate(candidate_id));

insert into results(candidate_id,total_votes)
values
(1,4),
(2,4),
(3,3),
(4,4);

select candidate_name from candidate;
select voter_name,voted_address from voters;
select candidate_id, count(total_votes) from results group by candidate_id;
select candidate_id,max(total_votes) from results group by  candidate_id ;
select candidate_name,party_name from candidate where constituency='constituencyA' in (select candidate_id  from candidate where candidate_id=1);
select voter_id,voter_constituency from voters;


 









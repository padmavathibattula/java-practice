create database election;
use election;

create table candidate(
candidate_id INT primary key Auto_increment,
candidate_name varchar(100) Not null,
party_name varchar(100) Not null,
constituency varchar(200) Not null);

insert into candidate(candidate_name,party_name,constituency)
values
('John Smith','Independent','Constituency A'),
('Jane Doe','Green Party','Constituency B'),
('Michael Johnson','Liberal Party','Constituency C'),
('Sarah Brown','Conservative Party','Constituency D');

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

#1. Retrieve the names of all candidates running in the election.
select candidate_name from election.candidate;

#2. Retrieve the names and addresses of all registered voters
select voter_name,voted_address from election.voters;

#3. Retrieve the total number of votes cast for each candidate. 
select * from election.results;

#4. Retrieve the constituency of a specific candidate.
select constituency from election.candidate where candidate_id = 2;

#5. Retrieve the number of voters registered in each constituency
select voter_constituency,count(voter_id)total_votes from election.voters group by voter_constituency;

#6. Retrieve the names of candidates and their corresponding party names in a specific constituency.
 select candidate_name,party_name from election.candidate where constituency='Constituency B';
 
 #7. Retrieve the candidate with the highest number of votes.
 select candidate_id, count(voter_id)total_votes from election.votes group by candidate_id having total_votes=
 (select max(total_votes) from (select candidate_id, count(voter_id)total_votes from election.votes group by candidate_id) t);
 
 #8. Retrieve the voter who cast the maximum number of votes.
 select voter_id, count(vote_id) total_votes from election.votes group by voter_id having total_votes=
 (select max(total_votes) from (select voter_id, count(vote_id) total_votes from election.votes group by voter_id) t);
 
 #9. Retrieve the total number of votes cast in each constituency.
 select c.constituency,count(vote_id) total_votes from election.candidate c  join election. votes v on c.candidate_id=v.candidate_id group by c.constituency ; 
 
#10. Retrieve the candidate who received the highest number of votes in a specific constituency.
 select c.candidate_id,count(vote_id) total_votes from election.candidate c  join election.votes v on c.candidate_id=v.candidate_id 
 where c.constituency='Constituency D' group by c.candidate_id;


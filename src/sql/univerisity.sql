CREATE SCHEMA university;
use university;
CREATE TABLE students(
    id INT PRIMARY KEY AUTO_INCREMENT,
    first_name VARCHAR(50) NOT NULL,
  last_name VARCHAR(50) NOT NULL,
  email VARCHAR(100) NOT NULL,
  date_of_birth date NOT NULL
  );

select * from students;

INSERT INTO students (first_name, last_name, email, date_of_birth)
VALUES
  ('John', 'Doe', 'johndoe@example.com','2000-05-10' ),
  ('Jane', 'Smith', 'janesmith@example.com', '1999-09-15'),
  ('Michael', 'Johnson', 'michaeljohnson@example.com', '2001-02-28'),
  ('Emily', 'Williams', 'emilywilliams@example.com', '2002-11-20'),
  ('David', 'Brown', 'davidbrown@example.com', '2003-07-08');
  
CREATE TABLE courses(
   id INT PRIMARY KEY AUTO_INCREMENT,
    course_name varchar(50) not null,
	instructor varchar(50) not null,
     credits  integer not null);

insert into courses(course_name,instructor,credits)
values
('Mathematics','Dr. Johnson',3),
('Physics','Prof. Smith',4),
('Computer' 'Science.Dr', 'Williams',5),
('English','Lecturer Brown',3),
('Chemistry','Prof. Davis',4);

drop table enrollments;
CREATE TABLE entrollments(
id INT PRIMARY KEY AUTO_INCREMENT,
student_id INT NOT NULL,
course_id INT NOT NULL,
enrollment_date date NOT NULL,
FOREIGN KEY(student_id)REFERENCES students(id),
FOREIGN KEy(course_id)REFERENCES courses(id)
);

insert into entrollments(student_id,course_id,enrollment_date)
values
(1,1,'2022-09-01'),
(1,3,'2022-09-01'),
(2,2,'2022-09-05'),
(3,1,'2022-09-08'),
(4,4,'2022-09-08'),
(5,2,'2022-09-10'),
(5,3,'2022-09-10');


select * from entrollments;

select * from university.students where id=1;

select * from university.entrollments where student_id=2;

select * from university.entrollments where course_id=3;







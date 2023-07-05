CREATE SCHEMA employee;# create database
use employee;
CREATE TABLE departments (
  id INT PRIMARY KEY AUTO_INCREMENT,
  name VARCHAR(50) NOT NULL
);# create table table_name(column_name data_type constraint_name,...)
INSERT INTO departments (name)
VALUES
  ('IT'),
  ('HR'),
  ('Sales'),
  ('Marketing');# insert into table_name(column_name ) values('value1'),('value2'),('value3'),...

select * from departments;

CREATE TABLE employees (
  id INT PRIMARY KEY AUTO_INCREMENT,
  first_name VARCHAR(50) NOT NULL,
  last_name VARCHAR(50) NOT NULL,
  email VARCHAR(100) NOT NULL,
  department_id INT NOT NULL,
  salary DECIMAL(10, 2) NOT NULL,
  FOREIGN KEY (department_id) REFERENCES departments(id)# create foreignkey 
);# create table tabble_name(column_name data_type constraint_name,...,foreign key(column_name) references table_name(column_name_primarykey),...
 
 
 select * from employees;
 
INSERT INTO employees (first_name, last_name, email, department_id, salary)
VALUES
  ('John', 'Doe', 'johndoe@example.com', 1, 5000.00),
  ('Jane', 'Smith', 'janesmith@example.com', 2, 6000.00),
  ('Michael', 'Johnson', 'michaeljohnson@example.com', 3, 5500.00),
  ('Emily', 'Williams', 'emilywilliams@example.com', 4, 5200.00),
  ('David', 'Brown', 'davidbrown@example.com', 1, 4800.00),
  ('Sarah', 'Davis', 'sarahdavis@example.com', 3, 5800.00),
  ('Robert', 'Miller', 'robertmiller@example.com',2,6200.00),
  ('Jennifer', 'Taylor', 'jennifertaylor@example.com', 4, 5400.00);# alter
  
insert into employees (first_name, last_name, email, department_id, salary)
values('padma', 'battula', 'battula.padmavathi@gmail.com', 4, 23000.00);

CREATE TABLE attendance (
  id INT PRIMARY KEY AUTO_INCREMENT,
  employee_id INT NOT NULL,
  check_in DATETIME NOT NULL,
  check_out DATETIME,
  FOREIGN KEY (employee_id) REFERENCES employees(id)
);

select * from attendance;

INSERT INTO attendance (employee_id, check_in, check_out)
VALUES
  (1, '2023-07-01 09:00:00', '2023-07-01 17:00:00'),
  (2, '2023-07-01 08:30:00', '2023-07-01 16:30:00'),
  (3, '2023-07-01 09:15:00', '2023-07-01 17:15:00'),
  (4, '2023-07-01 08:45:00', '2023-07-01 16:45:00'),
  (5, '2023-07-02 09:30:00', '2023-07-02 17:30:00'),
  (6, '2023-07-02 09:15:00', '2023-07-02 17:15:00'),
  (7, '2023-07-02 08:45:00', '2023-07-02 16:45:00'),
  (8, '2023-07-02 08:30:00', '2023-07-02 16:30:00');
  
  CREATE TABLE salaries (
  id INT PRIMARY KEY AUTO_INCREMENT,
  employee_id INT NOT NULL,
  salary DECIMAL(10, 2) NOT NULL,
  effective_date DATE NOT NULL,
  FOREIGN KEY (employee_id) REFERENCES employees(id)
);

INSERT INTO salaries (employee_id, salary, effective_date)
VALUES
  (1, 5000.00, '2023-01-01'),
  (2, 6000.00, '2023-01-01'),
  (3, 5500.00, '2023-01-01'),
  (4, 5200.00, '2023-01-01'),
  (5, 4800.00, '2023-01-01'),
  (6, 5800.00, '2023-01-01'),
  (7, 6200.00, '2023-01-01'),
  (8, 5400.00, '2023-01-01');
  
select * from salaries;



 
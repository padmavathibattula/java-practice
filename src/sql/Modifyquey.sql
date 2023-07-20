SELECT * FROM university.entrollments;
select course_name,first_name,last_name,email,enrollment_date from university.courses c inner join university.entrollments e on c.id=e.course_id 
inner join university.students s on e.student_id=s.id;
select course_name from university.courses where course_name='Mathematics';

create view university.student_entrollments_vw as
select s.first_name,s.last_name,s.email,c.course_name,e.enrollment_date from university.courses c inner join university.entrollments e on c.id=e.course_id 
inner join university.students s on e.student_id=s.id;
select course_name from university.courses where course_name='Mathematics';

DELIMITER //
CREATE FUNCTION university.get_instructor_by_course_name(course_Name_param VARCHAR(255))
RETURNS varchar(255)
READS SQL DATA
BEGIN
DECLARE instructor_name varchar(255);
select instructor INTO instructor_name 
from university.courses
where course_Name=course_Name_param
Limit 1;
RETURN instructor_name;
END //

DELIMITER //
select university.get_instructor_by_course_name('Mathematics') from dual;
SELECT * FROM university.entrollments;
select course_name,first_name,last_name,email,enrollment_date from university.courses c inner join university.entrollments e on c.id=e.course_id 
inner join university.students s on e.student_id=s.id;
select course_name from university.courses where course_name='Mathematics';

create view university.university_entrollments_vw as
select course_name,first_name,last_name,email,enrollment_date from university.courses c inner join university.entrollments e on c.id=e.course_id 
inner join university.students s on e.student_id=s.id;
select course_name from university.courses where course_name='Mathematics';

DELIMITER //
CREATE FUNCTION university.get_course_Name_by_Name(course_Name_param VARCHAR(255))
RETURNS varchar(255)
READS SQL DATA
BEGIN
DECLARE course_Name varchar(255);
select course_Name INTO course_Name 
from university.courses
where course_Name=course_Name_param
Limit 1;
RETURN course_NAME;
END //

DELIMITER //
select university.get_courses_Name_by_Name('Mathematics') from dual;



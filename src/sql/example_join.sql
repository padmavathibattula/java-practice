SELECT * FROM employee.attendance;
select a.employee_id,a.check_in from employee.attendance a INNER JOIN employee.departments d  on a.id=d.id;
SELECT COUNT(*) FROM (
    SELECT COUNT(a.employee_id) AS actCount FROM employee.attendance a
    INNER JOIN employee.departments d ON a.id = d.id
    GROUP BY a.id
) t;

select a.employee_id,a.check_in from employee.attendance a left join employee.departments d on a.id=d.id;
select count(*) from(
select count(a.employee_id) as actCount from employee.attendance a left join employee.departments d on a.id=d.id group by a.id)t;

select a.employee_id,a.check_in from employee.attendance a right join employee.departments d on a.id=d.id;
select count(*) from(
select count(a.employee_id) as actCount from employee.attendance a right join employee.departments d on a.id=d.id group by a.id)t;
SELECT attendance.employee_id FROM employee.attendance LEFT OUTER JOIN  employee.departments
        ON attendance.employee_id = departments.id
    UNION
    SELECT attendance.employee_id FROM employee.attendance RIGHT OUTER JOIN employee.departments
        ON attendance.employee_id  = departments.id;
SELECT COUNT(*) FROM 
(
    SELECT attendance.employee_id FROM employee.attendance LEFT OUTER JOIN  employee.departments
        ON attendance.employee_id = departments.id
    UNION
    SELECT attendance.employee_id FROM employee.attendance RIGHT OUTER JOIN employee.departments
        ON attendance.employee_id  = departments.id
) attendance;



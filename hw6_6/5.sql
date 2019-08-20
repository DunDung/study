select  d.department_name, MAX(salary), MIN(salary), MAX(salary)-MIN(salary)
from departments d
inner join employees e
on d.department_id = e.department_id
group by d.department_name;

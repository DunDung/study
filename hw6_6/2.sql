select e.last_name, e.first_name, count(j.employee_id) "COUNT(JOB_HISTORY)"
from employees e
inner join job_history j
on e.employee_id = j.employee_id
group by e.last_name, first_name, j.employee_id;
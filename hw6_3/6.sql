select job_id, min(salary) 
from employees
group by job_id
having count(employee_id) >= 5;
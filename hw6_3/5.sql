select department_id, sum(salary)
from employees
where salary <= 5000
group by department_id;
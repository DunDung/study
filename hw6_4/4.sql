select to_char(salary,'$999999') salary, last_name, to_char(hire_date, 'YYYY-MM-DD') hire_date
from employees
where salary >= 20000
order by salary desc;
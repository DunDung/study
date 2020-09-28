select e.last_name "LAST_NAME", e.hire_date, m.last_name "LAST_NAME", m.hire_date
from employees e
inner join employees m
on e.manager_id = m.employee_id
where e.hire_date < m.hire_date;
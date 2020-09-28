select  count(DISTINCT m.employee_id)
from employees e
inner join employees m
on e.manager_id = m.employee_id;

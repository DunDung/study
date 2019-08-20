select e.employee_id "EMP#", e.first_name || ' ' || e.last_name "EMP_NAME", m.employee_id "MANAGER#", m.first_name || ' ' || m.last_name "MANAGER_NAME"
from employees e
left join employees m
on e.manager_id = m.employee_id;
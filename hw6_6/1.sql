select d.department_name, l.location_id, l.street_address, l.city, l.state_province
from departments d
inner join locations l
on d.location_id = l.location_id;
select last_name "Lname", phone_number "Pnumber" from employees
where department_id = (select department_id from departments
where department_name = 'IT');

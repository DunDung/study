select j.job_title, Count(e.job_id) "COUNT(SAME_JOB)"
from employees e
inner join jobs j
on e.job_id = j.job_id
group by j.job_title, e.job_id;
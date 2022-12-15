select *
from Customer
where firstName like 'A%';

select *
from Customer
where country = 'Ukraine';

select *
from Customer
where sex = 'male';

select *
from Customer
where country = 'USA' and dateOfBirth < '2000-01-01';

delete
from Customer
where country = 'Russia';

select firstName
from Customer
group by firstName;

select *
from Customer
order by dateOfBirth desc;
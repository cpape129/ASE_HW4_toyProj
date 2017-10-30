revoke all on toyProjDB.* from 'springuser'@'localhost';
grant select, insert, delete, update on toyProjDB.* to 'springuser'@'localhost';

create view toyProjDB.user_roles as
	select 
	id as user_role_id,
	id as username,
	'ROLE_USER' as role
	from toyProjDB.user;



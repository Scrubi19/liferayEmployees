create table liferay_banks (
	bank_id LONG not null primary key,
	bank_name VARCHAR(75) null,
	bik VARCHAR(75) null,
	bank_address VARCHAR(75) null
);

create table liferay_employees (
	employee_id LONG not null primary key,
	lastname VARCHAR(75) null,
	firstname VARCHAR(75) null,
	middlename VARCHAR(75) null,
	gender VARCHAR(75) null,
	date_of_birth VARCHAR(75) null,
	date_of_employment VARCHAR(75) null,
	position_id LONG,
	salary LONG,
	work_phonenumber VARCHAR(75) null,
	mobile_phonenumber VARCHAR(75) null,
	bank_id LONG,
	archive_status BOOLEAN
);

create table liferay_positions (
	position_id LONG not null primary key,
	position_name VARCHAR(75) null,
	archive_status BOOLEAN
);


create table User(
	id int primary key auto_increment,
	name varchar(255),
	password varchar(255)
);

create table Card(
	id int primary key auto_increment,
	leftside int,
	rightside int,
	result int
);


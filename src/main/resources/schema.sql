create table if not exists t_user (
	id bigint,
	username varchar(50) not null,
	password varchar(255) not null,
	nickname varchar(50) not null,
	avatar varchar(255) not null,
	age int not null,
	mobile bigint not null,
	mail varchar(50) not null,
	address varchar(255) not null,
    create_at timestamp not null
);
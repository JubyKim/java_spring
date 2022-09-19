-- CREATE TABLE userinfo (
--                                id INT NOT NULL,
--                                name VARCHAR(50) NOT NULL,
--                                email VARCHAR(50),
--                                createdAt DATETIME,
--                                updatedAt DATETIME
-- );

call next value for hibernate_sequence;
insert into users (`id`, `name`, `email`) values (1, 'martin', 'martin@fastcampus.com');

call next value for hibernate_sequence;
insert into users (`id`, `name`, `email`) values (2, 'dennis', 'dennis@fastcampus.com');

call next value for hibernate_sequence;
insert into users (`id`, `name`, `email`) values (3, 'sophia', 'sophia@slowcampus.com');

call next value for hibernate_sequence;
insert into users (`id`, `name`, `email`,) values (4, 'james', 'james@slowcampus.com');

-- call next value for hibernate_sequence;
insert into users (`id`, `name`, `email`) values (5, 'martin', 'martin@another.com');

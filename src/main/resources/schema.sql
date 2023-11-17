create table if not exists wfh_request (
    id bigint auto_increment primary key,
    from_date varchar(255),
    to_date varchar(255),
    from_time varchar(255),
    to_time varchar(255)
);
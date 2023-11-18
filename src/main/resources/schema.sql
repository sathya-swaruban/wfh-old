create table if not exists wfh_request (
    id bigint auto_increment primary key,
    from_date date,
    to_date date,
    from_time time,
    to_time time
);
create table if not exists wfh_request (
    id bigint auto_increment primary key,
    from_date_time timestamp,
    to_date_time timestamp
);
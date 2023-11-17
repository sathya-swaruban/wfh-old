create table if not exists wfh_request (
    id bigint auto_increment primary key,
    start_date varchar(255),
    end_date varchar(255),
    start_time varchar(255),
    end_time varchar(255)
);
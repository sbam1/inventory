create table aisle
(
    aisle_id       bigint       not null
        primary key,
    aisle_number   bigint       not null,
    name           varchar(255) null,
    section        varchar(255) null,
    total_rack     int          not null,
    fk_category_id bigint       null,
    constraint FK7wq01hfkcsimvdo80s18etuq0
        foreign key (fk_category_id) references category (category_id)
);
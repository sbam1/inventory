-- auto-generated definition
create table item
(
    item_id       bigint       not null
        primary key,
    color         varchar(255) null,
    description   varchar(255) null,
    name          varchar(255) null,
    price         double       not null,
    size          varchar(255) null,
    sku           varchar(255) null,
    weight        double       not null,
    fk_pallet_id  bigint       null,
    fk_product_id bigint       null,
    constraint FK1c9op7jtla2k9i6ianh0pca4v
        foreign key (fk_pallet_id) references rack (rack_id),
    constraint FK89btsie9vfpq2vvctghkgnj6k
        foreign key (fk_product_id) references product (product_id)
);


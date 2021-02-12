create table product
(
    product_id     bigint       not null
        primary key,
    description    varchar(255) null,
    name           varchar(255) null,
    fk_category_id bigint       null,
    fk_supply_id   bigint       null,
    constraint FKpxqa5fj6hpcc9mew356eoj68d
        foreign key (fk_category_id) references category (category_id),
    constraint FKrol5ym17195tinp8uex7vvjfu
        foreign key (fk_supply_id) references supply (supply_id)
);

INSERT INTO online_shopping_inventory.product (product_id, description, name, fk_category_id, fk_supply_id) VALUES (1, 'apple iphone', 'iphone', 1, 2);
INSERT INTO online_shopping_inventory.product (product_id, description, name, fk_category_id, fk_supply_id) VALUES (2, 'apple laptops ', 'mackbook', 1, 1);
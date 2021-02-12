create table supply
(
    supply_id      bigint       not null
        primary key,
    description    varchar(255) null,
    quantity       bigint       not null,
    supply_date    datetime     null,
    fk_brand_id    bigint       null,
    fk_supplier_id bigint       null,
    constraint FK3nwa7mqgo8tubty64e0pxjlsb
        foreign key (fk_supplier_id) references supplier (supplier_id),
    constraint FK5yh20jd82ltxsh21ugiuqnkrq
        foreign key (fk_brand_id) references brand (brand_id)
);

INSERT INTO online_shopping_inventory.supply (supply_id, description, quantity, supply_date, fk_brand_id, fk_supplier_id) VALUES (1, 'apple laptops suppliers', 100, '2021-02-11 20:21:26', 1, 1);
INSERT INTO online_shopping_inventory.supply (supply_id, description, quantity, supply_date, fk_brand_id, fk_supplier_id) VALUES (2, 'apple iphone suppliers', 400, '2021-02-11 20:22:21', 1, 1);
INSERT INTO online_shopping_inventory.supply (supply_id, description, quantity, supply_date, fk_brand_id, fk_supplier_id) VALUES (3, 'ohio organic foods', 200, '2021-02-11 20:23:37', 8, 2);
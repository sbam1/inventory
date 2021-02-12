create table supplier
(
    supplier_id bigint       not null
        primary key,
    description varchar(255) null,
    name        varchar(255) null
);

INSERT INTO online_shopping_inventory.supplier (supplier_id, description, name) VALUES (1, 'electronic device supplier', 'bamSuppliers');
INSERT INTO online_shopping_inventory.supplier (supplier_id, description, name) VALUES (2, 'ohio organic foods supplier', 'ohioFoods');
INSERT INTO online_shopping_inventory.supplier (supplier_id, description, name) VALUES (3, 'medicine supplier', 'medSuppliers');
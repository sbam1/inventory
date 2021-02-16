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
INSERT INTO online_shopping_inventory.supplier (supplier_id, description, name) VALUES (4, 'smart home supplier', 'SmartHome');
INSERT INTO online_shopping_inventory.supplier (supplier_id, description, name) VALUES (5, 'Digital product supplier ', 'Digital Workd');
INSERT INTO online_shopping_inventory.supplier (supplier_id, description, name) VALUES (6, 'Designers Best Choice cloth suupplier.', 'yourNextBrand');
INSERT INTO online_shopping_inventory.supplier (supplier_id, description, name) VALUES (7, 'your next furniture supplier', 'My Furniture');
INSERT INTO online_shopping_inventory.supplier (supplier_id, description, name) VALUES (8, 'car dealers best choice ', 'myCarDealer');
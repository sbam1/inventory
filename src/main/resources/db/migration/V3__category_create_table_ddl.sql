create table category
(
    category_id bigint       not null
        primary key,
    description varchar(255) null,
    name        varchar(255) null
);

INSERT INTO online_shopping_inventory.category (category_id, description, name) VALUES (1, 'Laptop', 'Laptop');
INSERT INTO online_shopping_inventory.category (category_id, description, name) VALUES (2, 'mobiles', 'Mobile');
INSERT INTO online_shopping_inventory.category (category_id, description, name) VALUES (3, 'grocery', 'Grocery');
INSERT INTO online_shopping_inventory.category (category_id, description, name) VALUES (4, 'medicine', 'Medicine');
INSERT INTO online_shopping_inventory.category (category_id, description, name) VALUES (5, 'cloths', 'Cloth');
INSERT INTO online_shopping_inventory.category (category_id, description, name) VALUES (6, 'shoe', 'Shoe');
INSERT INTO online_shopping_inventory.category (category_id, description, name) VALUES (7, 'furniture ', 'Furniture');
INSERT INTO online_shopping_inventory.category (category_id, description, name) VALUES (8, 'kitchen', 'Kitchen');
INSERT INTO online_shopping_inventory.category (category_id, description, name) VALUES (9, 'baby', 'Baby');
INSERT INTO online_shopping_inventory.category (category_id, description, name) VALUES (10, 'Smart Watch', 'Smart Watch');
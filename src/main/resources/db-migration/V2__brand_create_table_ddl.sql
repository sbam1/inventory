create table brand
(
    brand_id    bigint       not null
        primary key,
    description varchar(255) null,
    name        varchar(255) null
);

INSERT INTO online_shopping_inventory.brand (brand_id, description, name) VALUES (1, 'best electronic goods with high quality', 'Apple');
INSERT INTO online_shopping_inventory.brand (brand_id, description, name) VALUES (2, 'best software service with cloud', 'Microsoft');
INSERT INTO online_shopping_inventory.brand (brand_id, description, name) VALUES (3, 'awesome service with innovative mindset', 'Google');
INSERT INTO online_shopping_inventory.brand (brand_id, description, name) VALUES (4, 'future of car industry', 'Tesla');
INSERT INTO online_shopping_inventory.brand (brand_id, description, name) VALUES (5, 'online payment system for stores', 'Square');
INSERT INTO online_shopping_inventory.brand (brand_id, description, name) VALUES (6, 'best electronics with affordable prise', 'LG');
INSERT INTO online_shopping_inventory.brand (brand_id, description, name) VALUES (7, 'amazing electronics with high quality', 'Sony');
INSERT INTO online_shopping_inventory.brand (brand_id, description, name) VALUES (8, 'best Organic foods', 'Local Farm');
INSERT INTO online_shopping_inventory.brand (brand_id, description, name) VALUES (9, 'local pottery and vegetables', 'Ohio Farms');
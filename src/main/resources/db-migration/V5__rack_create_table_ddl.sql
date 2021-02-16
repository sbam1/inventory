create table rack
(
    rack_id     bigint not null
        primary key,
    rack_number int    not null,
    total_items int    not null,
    total_size  int    not null,
    aisle_id    bigint null,
    constraint FKi14rochdugpj3jd2blw2elf22
        foreign key (aisle_id) references aisle (aisle_id)
);

INSERT INTO online_shopping_inventory.rack (rack_id, rack_number, total_items, total_size, aisle_id) VALUES (1, 1, 0, 20, 1);
INSERT INTO online_shopping_inventory.rack (rack_id, rack_number, total_items, total_size, aisle_id) VALUES (2, 2, 0, 20, 1);
INSERT INTO online_shopping_inventory.rack (rack_id, rack_number, total_items, total_size, aisle_id) VALUES (3, 3, 0, 20, 1);
INSERT INTO online_shopping_inventory.rack (rack_id, rack_number, total_items, total_size, aisle_id) VALUES (4, 4, 0, 20, 1);
INSERT INTO online_shopping_inventory.rack (rack_id, rack_number, total_items, total_size, aisle_id) VALUES (5, 5, 0, 20, 1);
INSERT INTO online_shopping_inventory.rack (rack_id, rack_number, total_items, total_size, aisle_id) VALUES (6, 6, 0, 20, 1);
INSERT INTO online_shopping_inventory.rack (rack_id, rack_number, total_items, total_size, aisle_id) VALUES (7, 7, 0, 20, 1);
INSERT INTO online_shopping_inventory.rack (rack_id, rack_number, total_items, total_size, aisle_id) VALUES (8, 8, 0, 20, 1);
INSERT INTO online_shopping_inventory.rack (rack_id, rack_number, total_items, total_size, aisle_id) VALUES (9, 9, 0, 20, 1);
INSERT INTO online_shopping_inventory.rack (rack_id, rack_number, total_items, total_size, aisle_id) VALUES (10, 10, 0, 20, 1);
INSERT INTO online_shopping_inventory.rack (rack_id, rack_number, total_items, total_size, aisle_id) VALUES (11, 11, 0, 20, 2);
INSERT INTO online_shopping_inventory.rack (rack_id, rack_number, total_items, total_size, aisle_id) VALUES (12, 12, 0, 20, 2);
INSERT INTO online_shopping_inventory.rack (rack_id, rack_number, total_items, total_size, aisle_id) VALUES (13, 13, 0, 20, 2);
INSERT INTO online_shopping_inventory.rack (rack_id, rack_number, total_items, total_size, aisle_id) VALUES (14, 14, 0, 20, 2);
INSERT INTO online_shopping_inventory.rack (rack_id, rack_number, total_items, total_size, aisle_id) VALUES (15, 15, 0, 20, 2);
INSERT INTO online_shopping_inventory.rack (rack_id, rack_number, total_items, total_size, aisle_id) VALUES (16, 16, 0, 20, 2);
INSERT INTO online_shopping_inventory.rack (rack_id, rack_number, total_items, total_size, aisle_id) VALUES (17, 17, 0, 20, 2);
INSERT INTO online_shopping_inventory.rack (rack_id, rack_number, total_items, total_size, aisle_id) VALUES (18, 18, 0, 20, 2);
INSERT INTO online_shopping_inventory.rack (rack_id, rack_number, total_items, total_size, aisle_id) VALUES (19, 19, 0, 20, 2);
INSERT INTO online_shopping_inventory.rack (rack_id, rack_number, total_items, total_size, aisle_id) VALUES (20, 20, 0, 20, 2);
INSERT INTO online_shopping_inventory.rack (rack_id, rack_number, total_items, total_size, aisle_id) VALUES (21, 21, 0, 20, 3);
INSERT INTO online_shopping_inventory.rack (rack_id, rack_number, total_items, total_size, aisle_id) VALUES (22, 22, 0, 20, 3);
INSERT INTO online_shopping_inventory.rack (rack_id, rack_number, total_items, total_size, aisle_id) VALUES (23, 23, 0, 20, 3);
INSERT INTO online_shopping_inventory.rack (rack_id, rack_number, total_items, total_size, aisle_id) VALUES (24, 24, 0, 20, 3);
INSERT INTO online_shopping_inventory.rack (rack_id, rack_number, total_items, total_size, aisle_id) VALUES (25, 25, 0, 20, 3);
INSERT INTO online_shopping_inventory.rack (rack_id, rack_number, total_items, total_size, aisle_id) VALUES (26, 26, 0, 20, 3);
INSERT INTO online_shopping_inventory.rack (rack_id, rack_number, total_items, total_size, aisle_id) VALUES (27, 27, 0, 20, 3);
INSERT INTO online_shopping_inventory.rack (rack_id, rack_number, total_items, total_size, aisle_id) VALUES (28, 28, 0, 20, 3);
INSERT INTO online_shopping_inventory.rack (rack_id, rack_number, total_items, total_size, aisle_id) VALUES (29, 29, 0, 20, 3);
INSERT INTO online_shopping_inventory.rack (rack_id, rack_number, total_items, total_size, aisle_id) VALUES (30, 30, 0, 20, 3);
INSERT INTO online_shopping_inventory.rack (rack_id, rack_number, total_items, total_size, aisle_id) VALUES (31, 31, 0, 20, 4);
INSERT INTO online_shopping_inventory.rack (rack_id, rack_number, total_items, total_size, aisle_id) VALUES (32, 32, 0, 20, 4);
INSERT INTO online_shopping_inventory.rack (rack_id, rack_number, total_items, total_size, aisle_id) VALUES (33, 33, 0, 20, 4);
INSERT INTO online_shopping_inventory.rack (rack_id, rack_number, total_items, total_size, aisle_id) VALUES (34, 34, 0, 20, 4);
INSERT INTO online_shopping_inventory.rack (rack_id, rack_number, total_items, total_size, aisle_id) VALUES (35, 35, 0, 20, 4);
INSERT INTO online_shopping_inventory.rack (rack_id, rack_number, total_items, total_size, aisle_id) VALUES (36, 36, 0, 20, 4);
INSERT INTO online_shopping_inventory.rack (rack_id, rack_number, total_items, total_size, aisle_id) VALUES (37, 37, 0, 20, 4);
INSERT INTO online_shopping_inventory.rack (rack_id, rack_number, total_items, total_size, aisle_id) VALUES (38, 38, 0, 20, 4);
INSERT INTO online_shopping_inventory.rack (rack_id, rack_number, total_items, total_size, aisle_id) VALUES (39, 39, 0, 20, 4);
INSERT INTO online_shopping_inventory.rack (rack_id, rack_number, total_items, total_size, aisle_id) VALUES (40, 40, 0, 20, 4);
INSERT INTO online_shopping_inventory.rack (rack_id, rack_number, total_items, total_size, aisle_id) VALUES (41, 41, 0, 20, 5);
INSERT INTO online_shopping_inventory.rack (rack_id, rack_number, total_items, total_size, aisle_id) VALUES (42, 42, 0, 20, 5);
INSERT INTO online_shopping_inventory.rack (rack_id, rack_number, total_items, total_size, aisle_id) VALUES (43, 43, 0, 20, 5);
INSERT INTO online_shopping_inventory.rack (rack_id, rack_number, total_items, total_size, aisle_id) VALUES (44, 44, 0, 20, 5);
INSERT INTO online_shopping_inventory.rack (rack_id, rack_number, total_items, total_size, aisle_id) VALUES (45, 45, 0, 20, 5);
INSERT INTO online_shopping_inventory.rack (rack_id, rack_number, total_items, total_size, aisle_id) VALUES (46, 46, 0, 20, 5);
INSERT INTO online_shopping_inventory.rack (rack_id, rack_number, total_items, total_size, aisle_id) VALUES (47, 47, 0, 20, 5);
INSERT INTO online_shopping_inventory.rack (rack_id, rack_number, total_items, total_size, aisle_id) VALUES (48, 48, 0, 20, 5);
INSERT INTO online_shopping_inventory.rack (rack_id, rack_number, total_items, total_size, aisle_id) VALUES (49, 49, 0, 20, 5);
INSERT INTO online_shopping_inventory.rack (rack_id, rack_number, total_items, total_size, aisle_id) VALUES (50, 50, 0, 20, 5);
INSERT INTO online_shopping_inventory.rack (rack_id, rack_number, total_items, total_size, aisle_id) VALUES (51, 51, 0, 20, 6);
INSERT INTO online_shopping_inventory.rack (rack_id, rack_number, total_items, total_size, aisle_id) VALUES (52, 52, 0, 20, 6);
INSERT INTO online_shopping_inventory.rack (rack_id, rack_number, total_items, total_size, aisle_id) VALUES (53, 53, 0, 20, 6);
INSERT INTO online_shopping_inventory.rack (rack_id, rack_number, total_items, total_size, aisle_id) VALUES (54, 54, 0, 20, 6);
INSERT INTO online_shopping_inventory.rack (rack_id, rack_number, total_items, total_size, aisle_id) VALUES (55, 55, 0, 20, 6);
INSERT INTO online_shopping_inventory.rack (rack_id, rack_number, total_items, total_size, aisle_id) VALUES (56, 56, 0, 20, 6);
INSERT INTO online_shopping_inventory.rack (rack_id, rack_number, total_items, total_size, aisle_id) VALUES (57, 57, 0, 20, 6);
INSERT INTO online_shopping_inventory.rack (rack_id, rack_number, total_items, total_size, aisle_id) VALUES (58, 58, 0, 20, 6);
INSERT INTO online_shopping_inventory.rack (rack_id, rack_number, total_items, total_size, aisle_id) VALUES (59, 59, 0, 20, 6);
INSERT INTO online_shopping_inventory.rack (rack_id, rack_number, total_items, total_size, aisle_id) VALUES (60, 60, 0, 20, 6);
INSERT INTO online_shopping_inventory.rack (rack_id, rack_number, total_items, total_size, aisle_id) VALUES (61, 61, 0, 20, 7);
INSERT INTO online_shopping_inventory.rack (rack_id, rack_number, total_items, total_size, aisle_id) VALUES (62, 62, 0, 20, 7);
INSERT INTO online_shopping_inventory.rack (rack_id, rack_number, total_items, total_size, aisle_id) VALUES (63, 63, 0, 20, 7);
INSERT INTO online_shopping_inventory.rack (rack_id, rack_number, total_items, total_size, aisle_id) VALUES (64, 64, 0, 20, 7);
INSERT INTO online_shopping_inventory.rack (rack_id, rack_number, total_items, total_size, aisle_id) VALUES (65, 65, 0, 20, 7);
INSERT INTO online_shopping_inventory.rack (rack_id, rack_number, total_items, total_size, aisle_id) VALUES (66, 66, 0, 20, 7);
INSERT INTO online_shopping_inventory.rack (rack_id, rack_number, total_items, total_size, aisle_id) VALUES (67, 67, 0, 20, 7);
INSERT INTO online_shopping_inventory.rack (rack_id, rack_number, total_items, total_size, aisle_id) VALUES (68, 68, 0, 20, 7);
INSERT INTO online_shopping_inventory.rack (rack_id, rack_number, total_items, total_size, aisle_id) VALUES (69, 69, 0, 20, 7);
INSERT INTO online_shopping_inventory.rack (rack_id, rack_number, total_items, total_size, aisle_id) VALUES (70, 70, 0, 20, 7);
INSERT INTO online_shopping_inventory.rack (rack_id, rack_number, total_items, total_size, aisle_id) VALUES (71, 71, 0, 20, 8);
INSERT INTO online_shopping_inventory.rack (rack_id, rack_number, total_items, total_size, aisle_id) VALUES (72, 72, 0, 20, 8);
INSERT INTO online_shopping_inventory.rack (rack_id, rack_number, total_items, total_size, aisle_id) VALUES (73, 73, 0, 20, 8);
INSERT INTO online_shopping_inventory.rack (rack_id, rack_number, total_items, total_size, aisle_id) VALUES (74, 74, 0, 20, 8);
INSERT INTO online_shopping_inventory.rack (rack_id, rack_number, total_items, total_size, aisle_id) VALUES (75, 75, 0, 20, 8);
INSERT INTO online_shopping_inventory.rack (rack_id, rack_number, total_items, total_size, aisle_id) VALUES (76, 76, 0, 20, 8);
INSERT INTO online_shopping_inventory.rack (rack_id, rack_number, total_items, total_size, aisle_id) VALUES (77, 77, 0, 20, 8);
INSERT INTO online_shopping_inventory.rack (rack_id, rack_number, total_items, total_size, aisle_id) VALUES (78, 78, 0, 20, 8);
INSERT INTO online_shopping_inventory.rack (rack_id, rack_number, total_items, total_size, aisle_id) VALUES (79, 79, 0, 20, 8);
INSERT INTO online_shopping_inventory.rack (rack_id, rack_number, total_items, total_size, aisle_id) VALUES (80, 80, 0, 20, 8);
INSERT INTO online_shopping_inventory.rack (rack_id, rack_number, total_items, total_size, aisle_id) VALUES (81, 81, 0, 20, 9);
INSERT INTO online_shopping_inventory.rack (rack_id, rack_number, total_items, total_size, aisle_id) VALUES (82, 82, 0, 20, 9);
INSERT INTO online_shopping_inventory.rack (rack_id, rack_number, total_items, total_size, aisle_id) VALUES (83, 83, 0, 20, 9);
INSERT INTO online_shopping_inventory.rack (rack_id, rack_number, total_items, total_size, aisle_id) VALUES (84, 84, 0, 20, 9);
INSERT INTO online_shopping_inventory.rack (rack_id, rack_number, total_items, total_size, aisle_id) VALUES (85, 85, 0, 20, 9);
INSERT INTO online_shopping_inventory.rack (rack_id, rack_number, total_items, total_size, aisle_id) VALUES (86, 86, 0, 20, 9);
INSERT INTO online_shopping_inventory.rack (rack_id, rack_number, total_items, total_size, aisle_id) VALUES (87, 87, 0, 20, 9);
INSERT INTO online_shopping_inventory.rack (rack_id, rack_number, total_items, total_size, aisle_id) VALUES (88, 88, 0, 20, 9);
INSERT INTO online_shopping_inventory.rack (rack_id, rack_number, total_items, total_size, aisle_id) VALUES (89, 89, 0, 20, 9);
INSERT INTO online_shopping_inventory.rack (rack_id, rack_number, total_items, total_size, aisle_id) VALUES (90, 90, 0, 20, 9);
INSERT INTO online_shopping_inventory.rack (rack_id, rack_number, total_items, total_size, aisle_id) VALUES (101, 101, 0, 50, 10);
INSERT INTO online_shopping_inventory.rack (rack_id, rack_number, total_items, total_size, aisle_id) VALUES (102, 102, 0, 50, 10);
INSERT INTO online_shopping_inventory.rack (rack_id, rack_number, total_items, total_size, aisle_id) VALUES (103, 103, 0, 50, 10);
INSERT INTO online_shopping_inventory.rack (rack_id, rack_number, total_items, total_size, aisle_id) VALUES (104, 104, 0, 50, 10);
INSERT INTO online_shopping_inventory.rack (rack_id, rack_number, total_items, total_size, aisle_id) VALUES (105, 105, 0, 50, 10);
INSERT INTO online_shopping_inventory.rack (rack_id, rack_number, total_items, total_size, aisle_id) VALUES (106, 106, 0, 50, 10);
INSERT INTO online_shopping_inventory.rack (rack_id, rack_number, total_items, total_size, aisle_id) VALUES (107, 107, 0, 50, 10);
INSERT INTO online_shopping_inventory.rack (rack_id, rack_number, total_items, total_size, aisle_id) VALUES (108, 108, 0, 50, 10);
INSERT INTO online_shopping_inventory.rack (rack_id, rack_number, total_items, total_size, aisle_id) VALUES (109, 109, 0, 50, 10);
INSERT INTO online_shopping_inventory.rack (rack_id, rack_number, total_items, total_size, aisle_id) VALUES (110, 110, 0, 50, 10);
INSERT INTO online_shopping_inventory.rack (rack_id, rack_number, total_items, total_size, aisle_id) VALUES (111, 111, 0, 50, 11);
INSERT INTO online_shopping_inventory.rack (rack_id, rack_number, total_items, total_size, aisle_id) VALUES (112, 112, 0, 50, 11);
INSERT INTO online_shopping_inventory.rack (rack_id, rack_number, total_items, total_size, aisle_id) VALUES (113, 113, 0, 50, 11);
INSERT INTO online_shopping_inventory.rack (rack_id, rack_number, total_items, total_size, aisle_id) VALUES (114, 114, 0, 50, 11);
INSERT INTO online_shopping_inventory.rack (rack_id, rack_number, total_items, total_size, aisle_id) VALUES (115, 115, 0, 50, 11);
INSERT INTO online_shopping_inventory.rack (rack_id, rack_number, total_items, total_size, aisle_id) VALUES (116, 116, 0, 50, 11);
INSERT INTO online_shopping_inventory.rack (rack_id, rack_number, total_items, total_size, aisle_id) VALUES (117, 117, 0, 50, 11);
INSERT INTO online_shopping_inventory.rack (rack_id, rack_number, total_items, total_size, aisle_id) VALUES (118, 118, 0, 50, 11);
INSERT INTO online_shopping_inventory.rack (rack_id, rack_number, total_items, total_size, aisle_id) VALUES (119, 119, 0, 50, 11);
INSERT INTO online_shopping_inventory.rack (rack_id, rack_number, total_items, total_size, aisle_id) VALUES (120, 120, 0, 50, 11);
INSERT INTO online_shopping_inventory.rack (rack_id, rack_number, total_items, total_size, aisle_id) VALUES (121, 121, 0, 50, 12);
INSERT INTO online_shopping_inventory.rack (rack_id, rack_number, total_items, total_size, aisle_id) VALUES (122, 122, 0, 50, 12);
INSERT INTO online_shopping_inventory.rack (rack_id, rack_number, total_items, total_size, aisle_id) VALUES (123, 123, 0, 50, 12);
INSERT INTO online_shopping_inventory.rack (rack_id, rack_number, total_items, total_size, aisle_id) VALUES (124, 124, 0, 50, 12);
INSERT INTO online_shopping_inventory.rack (rack_id, rack_number, total_items, total_size, aisle_id) VALUES (125, 125, 0, 50, 12);
INSERT INTO online_shopping_inventory.rack (rack_id, rack_number, total_items, total_size, aisle_id) VALUES (126, 126, 0, 50, 12);
INSERT INTO online_shopping_inventory.rack (rack_id, rack_number, total_items, total_size, aisle_id) VALUES (127, 127, 0, 50, 12);
INSERT INTO online_shopping_inventory.rack (rack_id, rack_number, total_items, total_size, aisle_id) VALUES (128, 128, 0, 50, 12);
INSERT INTO online_shopping_inventory.rack (rack_id, rack_number, total_items, total_size, aisle_id) VALUES (129, 129, 0, 50, 12);
INSERT INTO online_shopping_inventory.rack (rack_id, rack_number, total_items, total_size, aisle_id) VALUES (130, 130, 0, 50, 12);
INSERT INTO online_shopping_inventory.rack (rack_id, rack_number, total_items, total_size, aisle_id) VALUES (131, 131, 0, 50, 13);
INSERT INTO online_shopping_inventory.rack (rack_id, rack_number, total_items, total_size, aisle_id) VALUES (132, 132, 0, 50, 13);
INSERT INTO online_shopping_inventory.rack (rack_id, rack_number, total_items, total_size, aisle_id) VALUES (133, 133, 0, 50, 13);
INSERT INTO online_shopping_inventory.rack (rack_id, rack_number, total_items, total_size, aisle_id) VALUES (134, 134, 0, 50, 13);
INSERT INTO online_shopping_inventory.rack (rack_id, rack_number, total_items, total_size, aisle_id) VALUES (135, 135, 0, 50, 13);
INSERT INTO online_shopping_inventory.rack (rack_id, rack_number, total_items, total_size, aisle_id) VALUES (136, 136, 0, 50, 13);
INSERT INTO online_shopping_inventory.rack (rack_id, rack_number, total_items, total_size, aisle_id) VALUES (137, 137, 0, 50, 13);
INSERT INTO online_shopping_inventory.rack (rack_id, rack_number, total_items, total_size, aisle_id) VALUES (138, 138, 0, 50, 13);
INSERT INTO online_shopping_inventory.rack (rack_id, rack_number, total_items, total_size, aisle_id) VALUES (139, 139, 0, 50, 13);
INSERT INTO online_shopping_inventory.rack (rack_id, rack_number, total_items, total_size, aisle_id) VALUES (140, 140, 0, 50, 13);
INSERT INTO online_shopping_inventory.rack (rack_id, rack_number, total_items, total_size, aisle_id) VALUES (141, 141, 0, 50, 14);
INSERT INTO online_shopping_inventory.rack (rack_id, rack_number, total_items, total_size, aisle_id) VALUES (142, 142, 0, 50, 14);
INSERT INTO online_shopping_inventory.rack (rack_id, rack_number, total_items, total_size, aisle_id) VALUES (143, 143, 0, 50, 14);
INSERT INTO online_shopping_inventory.rack (rack_id, rack_number, total_items, total_size, aisle_id) VALUES (144, 144, 0, 50, 14);
INSERT INTO online_shopping_inventory.rack (rack_id, rack_number, total_items, total_size, aisle_id) VALUES (145, 145, 0, 50, 14);
INSERT INTO online_shopping_inventory.rack (rack_id, rack_number, total_items, total_size, aisle_id) VALUES (146, 146, 0, 50, 14);
INSERT INTO online_shopping_inventory.rack (rack_id, rack_number, total_items, total_size, aisle_id) VALUES (147, 147, 0, 50, 14);
INSERT INTO online_shopping_inventory.rack (rack_id, rack_number, total_items, total_size, aisle_id) VALUES (148, 148, 0, 50, 14);
INSERT INTO online_shopping_inventory.rack (rack_id, rack_number, total_items, total_size, aisle_id) VALUES (149, 149, 0, 50, 14);
INSERT INTO online_shopping_inventory.rack (rack_id, rack_number, total_items, total_size, aisle_id) VALUES (150, 150, 0, 50, 14);
INSERT INTO online_shopping_inventory.rack (rack_id, rack_number, total_items, total_size, aisle_id) VALUES (151, 151, 0, 50, 15);
INSERT INTO online_shopping_inventory.rack (rack_id, rack_number, total_items, total_size, aisle_id) VALUES (152, 152, 0, 50, 15);
INSERT INTO online_shopping_inventory.rack (rack_id, rack_number, total_items, total_size, aisle_id) VALUES (153, 153, 0, 50, 15);
INSERT INTO online_shopping_inventory.rack (rack_id, rack_number, total_items, total_size, aisle_id) VALUES (154, 154, 0, 50, 15);
INSERT INTO online_shopping_inventory.rack (rack_id, rack_number, total_items, total_size, aisle_id) VALUES (155, 155, 0, 50, 15);
INSERT INTO online_shopping_inventory.rack (rack_id, rack_number, total_items, total_size, aisle_id) VALUES (156, 156, 0, 50, 15);
INSERT INTO online_shopping_inventory.rack (rack_id, rack_number, total_items, total_size, aisle_id) VALUES (157, 157, 0, 50, 15);
INSERT INTO online_shopping_inventory.rack (rack_id, rack_number, total_items, total_size, aisle_id) VALUES (158, 158, 0, 50, 15);
INSERT INTO online_shopping_inventory.rack (rack_id, rack_number, total_items, total_size, aisle_id) VALUES (159, 159, 0, 50, 15);
INSERT INTO online_shopping_inventory.rack (rack_id, rack_number, total_items, total_size, aisle_id) VALUES (160, 160, 0, 50, 15);
INSERT INTO online_shopping_inventory.rack (rack_id, rack_number, total_items, total_size, aisle_id) VALUES (161, 161, 0, 50, 16);
INSERT INTO online_shopping_inventory.rack (rack_id, rack_number, total_items, total_size, aisle_id) VALUES (162, 162, 0, 50, 16);
INSERT INTO online_shopping_inventory.rack (rack_id, rack_number, total_items, total_size, aisle_id) VALUES (163, 163, 0, 50, 16);
INSERT INTO online_shopping_inventory.rack (rack_id, rack_number, total_items, total_size, aisle_id) VALUES (164, 164, 0, 50, 16);
INSERT INTO online_shopping_inventory.rack (rack_id, rack_number, total_items, total_size, aisle_id) VALUES (165, 165, 0, 50, 16);
INSERT INTO online_shopping_inventory.rack (rack_id, rack_number, total_items, total_size, aisle_id) VALUES (166, 166, 0, 50, 16);
INSERT INTO online_shopping_inventory.rack (rack_id, rack_number, total_items, total_size, aisle_id) VALUES (167, 167, 0, 50, 16);
INSERT INTO online_shopping_inventory.rack (rack_id, rack_number, total_items, total_size, aisle_id) VALUES (168, 168, 0, 50, 16);
INSERT INTO online_shopping_inventory.rack (rack_id, rack_number, total_items, total_size, aisle_id) VALUES (169, 169, 0, 50, 16);
INSERT INTO online_shopping_inventory.rack (rack_id, rack_number, total_items, total_size, aisle_id) VALUES (170, 170, 0, 50, 16);
INSERT INTO online_shopping_inventory.rack (rack_id, rack_number, total_items, total_size, aisle_id) VALUES (171, 171, 0, 50, 17);
INSERT INTO online_shopping_inventory.rack (rack_id, rack_number, total_items, total_size, aisle_id) VALUES (172, 172, 0, 50, 17);
INSERT INTO online_shopping_inventory.rack (rack_id, rack_number, total_items, total_size, aisle_id) VALUES (173, 173, 0, 50, 17);
INSERT INTO online_shopping_inventory.rack (rack_id, rack_number, total_items, total_size, aisle_id) VALUES (174, 174, 0, 50, 17);
INSERT INTO online_shopping_inventory.rack (rack_id, rack_number, total_items, total_size, aisle_id) VALUES (175, 175, 0, 50, 17);
INSERT INTO online_shopping_inventory.rack (rack_id, rack_number, total_items, total_size, aisle_id) VALUES (176, 176, 0, 50, 17);
INSERT INTO online_shopping_inventory.rack (rack_id, rack_number, total_items, total_size, aisle_id) VALUES (177, 177, 0, 50, 17);
INSERT INTO online_shopping_inventory.rack (rack_id, rack_number, total_items, total_size, aisle_id) VALUES (178, 178, 0, 50, 17);
INSERT INTO online_shopping_inventory.rack (rack_id, rack_number, total_items, total_size, aisle_id) VALUES (179, 179, 0, 50, 17);
INSERT INTO online_shopping_inventory.rack (rack_id, rack_number, total_items, total_size, aisle_id) VALUES (180, 180, 0, 50, 17);
INSERT INTO online_shopping_inventory.rack (rack_id, rack_number, total_items, total_size, aisle_id) VALUES (181, 181, 0, 50, 18);
INSERT INTO online_shopping_inventory.rack (rack_id, rack_number, total_items, total_size, aisle_id) VALUES (182, 182, 0, 50, 18);
INSERT INTO online_shopping_inventory.rack (rack_id, rack_number, total_items, total_size, aisle_id) VALUES (183, 183, 0, 50, 18);
INSERT INTO online_shopping_inventory.rack (rack_id, rack_number, total_items, total_size, aisle_id) VALUES (184, 184, 0, 50, 18);
INSERT INTO online_shopping_inventory.rack (rack_id, rack_number, total_items, total_size, aisle_id) VALUES (185, 185, 0, 50, 18);
INSERT INTO online_shopping_inventory.rack (rack_id, rack_number, total_items, total_size, aisle_id) VALUES (186, 186, 0, 50, 18);
INSERT INTO online_shopping_inventory.rack (rack_id, rack_number, total_items, total_size, aisle_id) VALUES (187, 187, 0, 50, 18);
INSERT INTO online_shopping_inventory.rack (rack_id, rack_number, total_items, total_size, aisle_id) VALUES (188, 188, 0, 50, 18);
INSERT INTO online_shopping_inventory.rack (rack_id, rack_number, total_items, total_size, aisle_id) VALUES (189, 189, 0, 50, 18);
INSERT INTO online_shopping_inventory.rack (rack_id, rack_number, total_items, total_size, aisle_id) VALUES (190, 190, 0, 50, 18);
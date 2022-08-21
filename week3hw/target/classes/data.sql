INSERT INTO meals(name,price,description)VALUES('apple',30,'taste sweet');
INSERT INTO meals(name,price,description)VALUES('banana',20,'taste sweet');
INSERT INTO meals(name,price,description)VALUES('cherry',50,'taste sour');
INSERT INTO meals(name,price,description)VALUES('watermelon',80,'taste sweet');
INSERT INTO meals(name,price,description)VALUES('lemon',50,'taste sour');

INSERT INTO orders(id,total_Price,waiter)VALUES(1,100,'A waiter');
INSERT INTO orders(id,total_Price,waiter)VALUES(2,200,'B waiter');

INSERT INTO order_meals(order_id, meal_id) VALUES(1, 1);
INSERT INTO order_meals(order_id, meal_id) VALUES(1, 2);
INSERT INTO order_meals(order_id, meal_id) VALUES(2, 3);
INSERT INTO order_meals(order_id, meal_id) VALUES(2, 4);





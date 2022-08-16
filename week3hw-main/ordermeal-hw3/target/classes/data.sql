INSERT INTO orders(seq,total_price,waiter) VALUES(0,100,'A waiter');
INSERT INTO orders(seq,total_price,waiter) VALUES(1,200,'B waiter');
INSERT INTO orders(seq,total_price,waiter) VALUES(2,300,'C waiter');


INSERT INTO meals(id, name, price, description) VALUES(0,'Apple', 10, 'sweet');
INSERT INTO meals(id, name, price, description) VALUES(1,'Banana', 20, 'sweet');
INSERT INTO meals(id, name, price, description) VALUES(2,'Cherry',30, 'sour');
INSERT INTO meals(id, name, price, description) VALUES(3,'Hamburger', 40, 'delicious');
INSERT INTO meals(id, name, price, description) VALUES(4,'sandwitch', 50, 'delicious');
INSERT INTO meals(id, name, price, description) VALUES(5,'Cake', 60, 'sweet');

INSERT INTO order_meal(order_seq, meal_id) VALUES(0, 0);
INSERT INTO order_meal(order_seq, meal_id) VALUES(0, 1);
INSERT INTO order_meal(order_seq, meal_id) VALUES(1, 2);
INSERT INTO order_meal(order_seq, meal_id) VALUES(1, 3);
INSERT INTO order_meal(order_seq, meal_id) VALUES(2, 4);
INSERT INTO order_meal(order_seq, meal_id) VALUES(2, 5);



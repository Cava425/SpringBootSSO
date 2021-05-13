delete from t_user;
insert into t_user (id, username, password, nickname, avatar, age, mobile, mail, address, create_at)
    values (1, 'admin', '$2a$10$75M8UoxdczbGk38NQt6pGeRrWLj6NZilEJ1bSsOm8KQ43xxWcVw0W', '扯皮王', '/1001.jpg', 18, 18999999999, '2828@qq.com', '北京市', CURRENT_TIMESTAMP());
insert into t_user (id, username, password, nickname, avatar, age, mobile, mail, address, create_at)
    values (2, 'user', '$2a$10$75M8UoxdczbGk38NQt6pGeRrWLj6NZilEJ1bSsOm8KQ43xxWcVw0W', '撒泼去吧', '/1002.jpg', 28, 15666666666, '2728@qq.com', '北京市', CURRENT_TIMESTAMP());
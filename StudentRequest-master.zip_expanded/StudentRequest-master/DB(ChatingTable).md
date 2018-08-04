<h1>StudentRequest</h1>
<h3>채팅  디비 설계</h3>

CREATE TABLE `studentrequest`.`message` (

  `message_id` INT NOT NULL AUTO_INCREMENT,

  `message_sender` VARCHAR(45) NULL,

  `message_receiver` VARCHAR(45) NULL,

  `message_context` VARCHAR(150) NULL,

  `message_sendTime` DATETIME NULL,

  `chatroom_id` INT NULL,

  PRIMARY KEY (`message_id`));

CREATE TABLE `studentrequest`.`chatroom` (

  `ChatRoom_id` INT NOT NULL AUTO_INCREMENT,

  `user_id` VARCHAR(45) NULL,

  `class_id` VARCHAR(45) NULL,

  PRIMARY KEY (`ChatRoom_id`));

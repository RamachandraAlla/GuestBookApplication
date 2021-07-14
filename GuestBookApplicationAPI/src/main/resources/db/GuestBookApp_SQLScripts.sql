CREATE DATABASE guestbook_app;

CREATE TABLE `guestbook_app`.`GUEST_BOOK_ENTRY`(
  `GUEST_BOOK_ENTRY_ID` INT NOT NULL AUTO_INCREMENT,
  `GUEST_BOOK_ENTRY_TEXT` VARCHAR(4000) NULL,
  `GUEST_BOOK_ENTRY_IMAGE` MEDIUMBLOB NULL,
  `GUEST_BOOK_ENTRY_STATUS` TINYINT NULL,
  `GUEST_BOOK_ENTRY_CAPTURED_BY` INT NULL,
  `CREATED_BY`VARCHAR(20) NOT NULL DEFAULT '17.0.0.1',
  `CREATED_ON` DATETIME NOT NULL DEFAULT NOW(),
  `MODIFIED_BY`VARCHAR(20) NOT NULL DEFAULT '127.0.0.1',
  `MODIFIED_ON` DATETIME NOT NULL DEFAULT NOW(),
  PRIMARY KEY (`GUEST_BOOK_ENTRY_ID`)
);

CREATE TABLE `guestbook_app`.`user`(
  `USER_ID` INT NOT NULL AUTO_INCREMENT,
  `USER_EMAIL` VARCHAR(40) NULL,
  `USER_PASSWORD` VARCHAR(2000) NULL,
  `USER_NAME` VARCHAR(45) NULL,
  `NAME` VARCHAR(45) NULL,
  `ROLE` VARCHAR(10) NOT NULL DEFAULT 'USER',
  PRIMARY KEY (USER_ID));

COMMIT;

/*
For creating admin entry, Create one user from application and update its role to ADMIN*/

update `guestbook_app`.`user` set role='ADMIN' where user_email='###';

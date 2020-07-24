DROP TABLE IF EXISTS CAR;

CREATE TABLE CAR (
  BRAND VARCHAR(50) NOT NULL,
  MODEL VARCHAR(50) NULL,
  HORSEPOWER VARCHAR(6) NULL,
  TORQUE VARCHAR(6) NULL,
  PRIMARY KEY (BRAND,MODEL)
);

INSERT INTO CAR (BRAND, MODEL, HORSEPOWER, TORQUE)
VALUES ('Proton', 'x70', '181HP', '300Nm'),
       ('Proton', 'x50', '174HP', '255Nm'),
       ('Honda', 'CR-V', '190HP', '243Nm'),
       ('Honda', 'HR-V', '140HP', '172Nm'),
       ('Peugeot', '3008', '165HP', '240Nm'),
       ('Peugeot', '2008', '163HP', '243Nm');
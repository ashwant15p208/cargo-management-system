---USER---
CREATE TABLE USER(
  USER_ID             INT NOT NULL,
  USER_NAME           VARCHAR(30) NOT NULL,
  USER_EMAIL          VARCHAR(30) NOT NULL,
  USER_NUMBER         INT NOT NULL,
  USER_DOB            VARCHAR(30) NOT NULL,
  USER_ADDRESS        VARCHAR(30) NOT NULL
  );

---PRODUCT---
CREATE TABLE PRODUCT(
  PRODUCT_ID          INT NOT NULL,
  PRODUCT_NAME        VARCHAR(30) NOT NULL,
  PRODUCT_ADDRESS     VARCHAR(30) NOT NULL,
  PRODUCT_PRICE       INT NOT NULL,
  PRODUCT_DESCRIPTION VARCHAR(30) NOT NULL,
  PRODUCT_DESTINATION VARCHAR(30) NOT NULL,
  );
  
---LOCATION---
CREATE TABLE LOCATION(
  LOCATION_INIT       VARCHAR(30) NOT NULL,
  LOCATION_INIT_ETA   DATE NOT NULL,
  LOCATION_FINAL      VARCHAR(30) NOT NULL,
  LOCATION_FINAL_ETA  DATE NOT NULL,
  LOCATION_CURR       VARCHAR(30) NOT NULL,
  LOCATION_CURR_ETA   DATE NOT NULL
  );
  
---SERVICE---
CREATE TABLE SERVICE(
  SERVICE_NAME        VARCHAR(30) NOT NULL,
  SERVICE_ID          VARCHAR(30) NOT NULL,
  SERVICE_NUMBER      VARCHAR(30) NOT NULL,
  SERVICE_EMAIL       VARCHAR(30) NOT NULL,
  SERVICE_TYPE        VARCHAR(30) NOT NULL
  );

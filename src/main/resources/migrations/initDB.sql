CREATE TABLE USER(
    ID  INTEGER NOT NULL,
    FIRSTNAME   VARCHAR2(50) NOT NULL,
    LASTNAME    VARCHAR2(50) NOT NULL,
    EMAIL       VARCHAR2(100)
    CONSTRAINT PK_USER PRIMARY KEY (ID)
);

INSERT INTO USER VALUES (1, "Roshan", "Jamkatel", "personal@rjamkatel.com");
INSERT INTO USER VALUES (2, "Crypto", "Jamkatel", "crypto@rjamkatel.com");
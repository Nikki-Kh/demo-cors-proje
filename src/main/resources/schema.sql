CREATE table cors_origins (
    id INTEGER NOT NULL AUTO_INCREMENT,
    origin VARCHAR(32) NOT NULL,
    PRIMARY KEY (id),
    UNIQUE (origin)
    );
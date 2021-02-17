CREATE table cors_domains (
    id INTEGER NOT NULL AUTO_INCREMENT,
    cors_domain varchar(64) not null,
    primary key (id),
    UNIQUE (cors_domain)
    );
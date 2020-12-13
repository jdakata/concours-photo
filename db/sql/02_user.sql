use photodb;

CREATE TABLE user (
    id int UNSIGNED AUTO_INCREMENT,
    username VARCHAR(24) NOT NULL UNIQUE,
    sha TEXT NOT NULL,

    PRIMARY KEY (id)
)
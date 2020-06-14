\c lab;

CREATE SEQUENCE CAR_SQ START 1 INCREMENT 1;

CREATE TABLE CAR(
    ID INT8 not null,
    DESCRIPTION varchar(1024),
    NAME varchar (255),
    PRIMARY KEY(id)
);

DO
$DO$
DECLARE i int;

BEGIN
    FOR i IN 1..500000
    LOOP
        INSERT INTO CAR(id, description, NAME)
        VALUES
        (
            NEXTVAL('CAR_SQ'),
            'Lorem ipsum dolor sit amet, consecteturadipiscing elit. Curabitur facilisis magna leo, sit amet malesuada ligula mattis pellentesque. Vivamus facilisis dignissim nisi, vitae sodales sapien varius sed. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Phasellus suscipit dolor massa, tempor eleifend arcu faucibus non. Vestibulum consequat dolor id augue rutrum egestas. Vestibulum mauris erat, lacinia auctor cursus ac, pellentesque in mi. Sed sed purus at diam scelerisque molestie. Nunc non ex quis id. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Curabitur facilisis magna leo, sit amet malesuada ligula mattis pellentesque. Vivamus facilisis dignissim nisi, vitae sodales sapien varius sed. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Phasellus suscipit dolor massa, tempor eleifend arcu faucibus non. Vestibulum consequat dolor id augue rutrum egestas. Vestibulum mauris erat, lacinia auctor cursus ac, pellentesque in mi. Sed sed purus at diam scelerisque molestie. Nunc non ex quis id.',
            'CAR ' || i::TEXT
        );
    END LOOP;

END;
$DO$;

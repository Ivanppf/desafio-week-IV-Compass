CREATE TABLE Address (

address_id SERIAL PRIMARY KEY,
zip_code INTEGER,
address VARCHAR(300),
complement VARCHAR(250),
neighborhood VARCHAR(250),
city VARCHAR(100),
state VARCHAR(100),
country VARCHAR(100)

)
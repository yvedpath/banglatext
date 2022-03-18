# Instructions: 

This can be build using "mvn package". generated WAR can be deployed in JBoss EAP. In the browser it will ask for a string 
and it will store the string in database. It uses datasource from JBoss EAP. Only change required will be to update "hibernate.connection.datasource"
property in hibernate.cfg.xml. 

A table named "bangla" is required in the database. Atleast with two columns. One is "id" as primary key and other as name. This project was tested with 
PostgreSql and the primary key column is marked auto increment in the entity. 

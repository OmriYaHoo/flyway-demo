# Demo Project For Flyway
### Using SpringBoot

#### You need Java 11 (or higher) to run this project

You can run this project with in-memory database H2 or MySQL using the docker-compose file in the root path.  
To start the mysql server run it as `docker-compose up -d`.  
The MySQL server port is **33061** because I'm assuming you already have a MySQL server running on the default 3306.

The database you choose is determine the Spring Profile you should run:
- h2
- mysql 

Not choosing one of those will make the project crash.  
You can set the profile through "Active Profile" in Intellij IDE run configuration for Spring Boot or running the following scripts to run it in terminal (less recommended):  
`./start.sh h2 &`  
or   
`./start.sh mysql &`  
  
To stop the server in the terminal mode (no matter which profile you choose) run `./stop.sh`
# apiDemoSpringBoot
Restful API

## Download DB
  backup db url:
  `https://github.com/brian-esguerra/apiDemoSpringBoot/blob/master/backup-demo.sql`
  
  import Mysql -> name: demo

## Download Code
  run `git clone https://github.com/brian-esguerra/apiDemoSpringBoot.git`

## Open workspace
  run project (Spring Tools 4 ó Netbeans)
  
## Configure DB
  change configuration in  `/src/main/resources/application.properties` directory.

  update info:
  * spring.datasource.url=jdbc:mysql://localhost:3306/demo ó jdbc:mysql://127.0.0.1:3306/demo
  * spring.datasource.username=your-username
  * spring.datasource.password=your-password
  
## Deploy Api
  Run proyect in Tomcat start on port(s): 8080
  
  Run as http://localhost:8080/
  
## Endpoint 
  Get list persons 
  * url: `http://localhost:8080/apiDemo/personas`, method: [GET]
  
  Add person
  * url: `http://localhost:8080/apiDemo/personas`, method: [POST]
 
 
  

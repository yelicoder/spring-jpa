# PluralSight Training: Spring Framework: Spring Data JPA with Hibernate by Bryan Hansen

### Module 4
* Controller: Annotated with @Controller. Should not have business logic
* Service: Annotated with @Service. Describes verbs/actions of system and should have all business logic, business object state, transactional
* Repository: Annotated with @Repository. Nonus (data) of the system.One-to-one object mapping. Often one-to-one database table mapping.

### Module 6
* data source configuration
```
# log level
logging.level.org.hibernate.SQL=DEBUG 
# show queries
spring.jpa.show-sql=true
# format sql
spring.jpa.properties.hibernate.format_sql=true
```
### Module 7
* Database creation
```
spring.jpa.generate-ddl=true
spring.jpa.hibernate.ddl-auto=update // defaults to create-drop for embedded dbs. values are: create, update, create-drop, validate and none
```

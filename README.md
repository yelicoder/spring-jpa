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
### Module 8
* Annotations
  * @Entity - Declares Object
  * @Table - Table specifics
  * @Id - Primary Key
  * @GeneratedValue - Used with @Id. Strategies are:
    * IDENTITY - unique at per type
    * AUTO - unique at the database level
    * SEQUENCE - If database supports it. No gurantee that id are continuous
    * TABLE - almost identical to SEQUENCE. Uses identity table
  * @Column - Override names or add into: column Definition, scale, insertable, table, length, unique, name, updatable, nullable, precision
* Uppercase Names
```
spring.jpa.hibernate.naming.physical-strategy=org.hibernate.boot.model.naming.PhysicalNamingStrategyStandardImpl
```

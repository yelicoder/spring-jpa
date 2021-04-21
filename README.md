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
    * IDENTITY - unique per type
    * AUTO - unique at the database level
    * SEQUENCE - If database supports it. No gurantee that id are continuous
    * TABLE - almost identical to SEQUENCE. Uses identity table
  * @Column - Override names or add into: column Definition, scale, insertable, table, length, unique, name, updatable, nullable, precision
* Uppercase Names
```
spring.jpa.hibernate.naming.physical-strategy=org.hibernate.boot.model.naming.PhysicalNamingStrategyStandardImpl
```
* @PersistenceContext - Injects EntityManager
* @Service - Location of Business logic
  * Annotated on the Impl class
* @Repository - Database Integration
  * Annotated on the Impl class
* @Transactional - Beginning of Transaction
* Layers of abstractions when working with persistent data in Java/Spring
  * JDBC
  * JdbcTemplate
  * JPA (Contains EntityManager and Repository)
  * Spring Data JPA (contains JpaRepository)
* Join Types
  * @OneToOne
  * @OneToMany
    * Paried with @ManyToOne
    * mappedBy="xx". xx is the Entity name and is the "One" that has many of another entity. xx should be the same object on the corresponding @ManyToOne
    * cascade: when we perform some action on the target entity, the same action will be applied to the associated entity
    * fetch: lazy or eager loading
  * @ManyToOne
  * @ManyToMany
* Cascade Types
  * ALL: propagates all operations - including Hibernate-specific ones - from a parent to a child entity
  * PERSIST: propagates the persist operation from a parent to a child entity
  * MERGE: propagates the merge operation from a parent to a child entity
  * REMOVE: propagates the remove operation from parent to child entity
  * REFRESH: re-read the value of a given instance from the database
  * DETACH: The child entity will also get removed from the persistent context
  * REPLICATE (Hibernate only): used when we have more than one data source, and we want the data in sync
  * SAVE_UPDATE (Hibernate only): propagates the same operation to the associated child entity
  * LOCK (Hibernate only): re-attaches the entity and its associated child entity with the persistent context again
* Fetch Types
  * Lazy - DB query when property is called
  * Eager - DB query when object is created
* JPQL
  * JPQL != SQL
  * Centered around objects
  * Query q = em.createQuery ("Select r from Registration r")
    * SQL will be: "Select * from Registration"

* @JsonManagedReference
  * when converting to Json, just one level, do not cascading
* @JsonBackReference
* @RestController: method return type will be ResponseBody
* Projection
  * Presents objects to the UI
  * Objects added using JPQL
  * Projection Objects can be JPA Entities
  * Construction for the projection is needed
  * Object is not tied to complete entity or entity hierarchy
* @NamedQueries and @NamedQuery
  * Cleaner then adhoc JPQL
  * Not required, but focuses on the domain
  * Named parameters
### Module 9
* Updates using JPA
  * Persiste is just used for Created
  * Merge is used for updates
  * Save methods are usually overridden to handle both
* Spring Data JPA
  * Wrapper for JPA
  * Replaces our Repository Tier
  * Eliminates boiler plate code
  * Extended for additional functionality
* @NamedQuery: has to add Entity class before the name
  * Structure: EntityName.JpaRepostoryMethodName
  

# Web intro

- Display `Hello World` in your browser
- Refactor DAO and Service layers using GenericDao and GenericService (if you haven't done it yet)
- configure web.xml
- add new dependencies `servlet-api` and `maven-war-plugin` in `pom.xml` (remember about `<packaging>war</packaging>`)
- create IndexController
- create index.jsp

__Before submitting solution make sure you checked it first with__ [checklist](https://mate-academy.github.io/jv-program-fulltime/02_jdbc/checklist/07_servlets_intro_checklist.html)

As example of GenericDao you can use this:
```java
public interface GenericDao<T, I> {
    T create(T value);
    Optional<T> get(I id);
    List<T> getAll();
    T update(T value);
    boolean delete(I id);
}
```
Usage example:
```java
public interface DriverDao extends GenericDao<Driver, Long> {
    // specific method for DriverDao if required
}
```
or
```java
public interface CarDao extends GenericDao<Car, Long> {
    // specific method for CarDao if required
}
```

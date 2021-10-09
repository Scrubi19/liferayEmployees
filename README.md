# liferay Employee roster Portlet

## Installation

* create .WAR package (path: liferayEmployees-portlet/target/example.war)
```
mvn clean install 
```
* create databases from service.xml
```
mvn liferay:build-service
```
#### sql_examples directory contains Employee, banks, positions databases
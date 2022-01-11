# warehouse Project

## Build native image & Deploy straight on OCP
```bash
cd warehouse-quarkus/warehouse/
mvn clean package -Pnative -DskipTests
# Build is made on OCP Cluster
```


To know the implemented APIs please refer to http://your-project.your-cluster/q/swagger-ui/

## Running the application invoking REST API via httpie
### Get all books
```
http your-project.your-cluster:8080/books
```


### Get book by ISBN
```
http your-project.your-cluster:8080/books/ISBN/9780671820855
```


For further info, please refer to README-original.md

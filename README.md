

```
oc new-project quarkus-bookstore
oc apply -f openshift-resources/postgresql-secret.yaml

oc new-app postgresql:12~https://github.com/obryan5598/quarkus-bookstore.git#master --name warehouse-dbms --context-dir postgres/ -e POSTGRESQL_USER=testUser -e POSTGRESQL_DATABASE=warehouse -e POSTGRESQL_PASSWORD='testPassword' --as-deployment-config

cd ../warehouse-quarkus/warehouse/
mvn clean package -DskipTests
```
### Swagger API
To give a look at the provided APIs please refer to:
http://your-project.your-cluster/q/swagger-ui/

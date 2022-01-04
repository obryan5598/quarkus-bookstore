

```
oc new-project quarkus-bookstore
oc apply -f openshift-resources/postgresql-secret.yaml

cd postgres/
oc new-app openshift/postgresql:13-el7~https://github.com/obryan5598/quarkus-bookstore.git#master --name warehouse-dbms --context-dir postgres/ -e POSTGRESQL_USER=testUser -e POSTGRESQL_DATABASE=warehouse -e POSTGRESQL_PASSWORD='testPassword' --as-deployment-config

cd warehouse-quarkus/warehouse/
mvn clean package -DskipTests
```

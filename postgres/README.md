# PostgreSQL

```
oc new-app postgresql:12~https://github.com/obryan5598/quarkus-bookstore.git#master --name warehouse-dbms --context-dir postgres/ -e POSTGRESQL_USER=testUser -e POSTGRESQL_DATABASE=warehouse -e POSTGRESQL_PASSWORD='testPassword' --as-deployment-config
```

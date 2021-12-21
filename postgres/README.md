# PostgreSQL

```
oc new-app postgresql:13~https://github.com/.git#master --name warehouse-dbms --context-dir postgresql/ -e POSTGRESQL_USER=testUser -e POSTGRESQL_DATABASE=warehouse -e POSTGRESQL_PASSWORD='testPassword' --as-deployment-config
```

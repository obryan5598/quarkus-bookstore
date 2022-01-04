# PostgreSQL

```
# SPECIFIC OCP INTERNAL REGISTRY POSTGRES IMAGE
# oc new-app openshift/postgresql:13-el7~https://github.com/obryan5598/quarkus-bookstore.git#master --name warehouse-dbms --context-dir postgres/ -e POSTGRESQL_USER=testUser -e POSTGRESQL_DATABASE=warehouse -e POSTGRESQL_PASSWORD='testPassword' --as-deployment-config

# STANDARD REDHAT CONTAINER CATALOG IMAGE
oc new-app postgresql:13~https://github.com/obryan5598/quarkus-bookstore.git#master --name warehouse-dbms --context-dir postgres/ -e POSTGRESQL_USER=testUser -e POSTGRESQL_DATABASE=warehouse -e POSTGRESQL_PASSWORD='testPassword' --as-deployment-config
```

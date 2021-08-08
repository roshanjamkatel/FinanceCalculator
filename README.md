# FinanceCalculator
 Oracle database featuring ways to improve financial status, currently under development using Spring, Java, Oracle, and Docker.


# Inital run for creating container and mouting using oracle-12c image (Docker)
docker run -d -p 8080:8080 -p 1521:1521 -v ~/oracle_data/:/u01/app/oracle truevoly/oracle-12c

# Checking if container is up and running
docker ps


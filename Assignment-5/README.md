# JAVA ASSIGNMENT 5 — CO5: Engineering Reliable Data Storage
**Student:** N. ARUN KUMAR | **Register:** 192424184 | **Course:** CSA09 — Programming in Java  
**Java:** OpenJDK 21 | **Database:** MariaDB / MySQL-compatible | **JDBC:** MariaDB Connector/J 2.7.6

## Contents
- Part-A: persistence design, buffered I/O, DAO pattern, serialization and transaction/security pseudocode.
- Task-B1: delimited bus-pass file store, damaged-line recovery, scan-vs-HashMap and I/O benchmark.
- Task-B2: intentionally vulnerable SQL login demonstration versus PreparedStatement.
- Task-B3: JDBC Statement, PreparedStatement and batch import comparison, including transaction rollback.
- Task-B4: metadata inspection and validated migration of legacy records into a relational database.
- sql/: schema and seed scripts. data/: small test input and benchmark CSVs. figures/: explanatory SVG charts/diagrams.

## Run (JDK 21)
Compile each task separately:
```bash
javac -d out Task-B1/*.java
java -cp out PassStoreDemo
java -cp out IoBenchmark
javac -d out Task-B2/*.java
java -cp out LoginDemo
```
For JDBC tasks, install MariaDB/MySQL and MariaDB Connector/J 2.7.6. Run the SQL scripts in `sql/`, update credentials in `common/Db.java`, then compile with the driver jar:
```bash
javac -cp mariadb-java-client-2.7.6.jar -d out common/Db.java Task-B3/*.java
java -cp out:mariadb-java-client-2.7.6.jar LoaderBenchmark
```
On Windows use `; ` instead of `:` in the Java classpath.
For Task-B4 compile `common/Db.java Task-B4/PassMigration.java` with the same connector jar and run with the source text file path.

## Important honesty note
The numerical benchmark tables in the report and the CSV files are transcribed from the supplied Assignment 5 PDF; they are reference/report measurements, not a fresh benchmark run on this machine. The source programs are runnable experiments. The PDF refers to screenshots in a shots folder, but those screenshot assets were not supplied separately, so this folder does not claim to contain original live screenshots. The SVGs are explanatory diagrams/charts made from the report values.

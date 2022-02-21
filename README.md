# flyway

This repo show a simple case of flyway usage.

- Flyway is used for relational database migration and version control
- Flyway configuration is done in the application.yml
- It is running the sql scripts that are created in the db/migration folder in the specific order (respect the naming
  convention of the scripts that start with the version + 2 underscores)
- Flyway will automatically create a table that will store information about the scripts that run (
  `flyway_schema_history`)
- Mostly usages for flyway is table creation, record insertion, alterations etc.
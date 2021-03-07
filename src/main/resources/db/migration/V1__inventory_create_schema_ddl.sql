IF (NOT EXISTS (SELECT * FROM sys.schemas WHERE name = 'inventory'))
BEGIN
    CREATE SCHEMA ['inventory']
END
-- Simple Database Recreation Script for Forkito
-- This completely drops and recreates the database
-- After running this, just start your Spring Boot app and Flyway will do the rest!

-- Drop and recreate database completely
DROP DATABASE IF EXISTS forkito_db;
CREATE DATABASE forkito_db
    WITH OWNER = "user"
    ENCODING = 'UTF8';

-- That's it! Now start your Spring Boot application and Flyway will:
-- 1. Create the schema (V0__Create_schema.sql)
-- 2. Insert test data (V1__Insert_test_data.sql)

-- Terminate all connections to forkito_db (except our own)
SELECT pg_terminate_backend(pid)
FROM pg_stat_activity
WHERE datname = 'forkito_db' AND pid <> pg_backend_pid();


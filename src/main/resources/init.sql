DO
$$
BEGIN
   IF NOT EXISTS (SELECT FROM pg_database WHERE datname = 'daw135-gt01-corto2') THEN
      CREATE DATABASE daw135-gt01-corto2;
   END IF;
END
$$;

DO
$$
BEGIN
   IF NOT EXISTS (SELECT FROM pg_roles WHERE rolname = 'daw135-gt01-corto2') THEN
      CREATE USER DATABASE daw135-gt01-corto2 WITH ENCRYPTED PASSWORD 'daw135-gt01-corto2';
   END IF;
END
$$;

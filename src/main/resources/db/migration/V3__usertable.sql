CREATE TABLE usser (
--user esta reservado, por eso lo ponemos con ss
    userid uuid NOT NULL DEFAULT gen_random_uuid() PRIMARY KEY,
    username varchar(24) NOT NULL UNIQUE,
    password varchar(255) NOT NULL,
    role varchar(10),--lo que vamos a usar necesita esto aunque no lo usemos
    enabled boolean DEFAULT true
  );



  -- afegim un usuari de prova
  CREATE EXTENSION IF NOT EXISTS pgcrypto;
  INSERT INTO usser (username, password) VALUES ('user', crypt('pass', gen_salt('bf')));
  --las contras se guardan hasheados y ese se llama BF.
  --salt es algo (num, letras..) aleatorio que le añades al principio
  --se guarda $n2$SALT%PASSOWRD
  --para mirar si lo que entra es lo mismo, añades el SALT en lo que has metido. Si es el mismo, entra
  --users con la misma contra tienen diferente salt, asi que nunca habra dos contras iguales guardadas en la base de datos
INSERT INTO USUARIO(nombre, email, contrasena) VALUES('Alumno', 'alumno@email.com', '123456');

INSERT INTO CURSO(nombre, categoria) VALUES('Spring Boot', 'Desarrollo');
INSERT INTO CURSO(nombre, categoria) VALUES('HTML 5',  'Front-end');

INSERT INTO TOPICO(titulo, mensaje, fecha_creacion, status, autor_id, curso_id) VALUES('Duda', 'Error al crear el proyecto', '2020-08-15', 'SIN_RESPUESTA', 1, 1);
INSERT INTO TOPICO(titulo, mensaje, fecha_creacion, status, autor_id, curso_id) VALUES('Duda 2', 'El proyecto no compila', '2020-08-25', 'SIN_RESPUESTA', 1, 1);
INSERT INTO TOPICO(titulo, mensaje, fecha_creacion, status, autor_id, curso_id) VALUES('Duda 3', 'Tag HTML', '2020-09-02', 'SIN_RESPUESTA', 1, 2);

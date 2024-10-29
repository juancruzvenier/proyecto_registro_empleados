# Mini CRUD de Empleados

Este es un proyecto de ejemplo de un CRUD básico para la gestión de empleados. Permite insertar, editar y eliminar registros de empleados en una base de datos MySQL. Este proyecto fue desarrollado en **Java** y utiliza el paquete `java.sql` para la conexión a la base de datos. Es un proyecto estudiantil creado para una exposición oral de la materia **Programación II** en la **Tecnicatura Superior en Programación**.

## Funcionalidades

- **Insertar Empleados:** Agregar nuevos empleados a la base de datos.
- **Editar Empleados:** Modificar los datos de empleados existentes.
- **Eliminar Empleados:** Eliminar registros de empleados de la base de datos.
- **Listar Empleados:** Mostrar una lista de todos los empleados registrados.

## Tecnologías Utilizadas

- **Lenguaje:** Java
- **Base de Datos:** MySQL
- **Conector JDBC:** [MySQL Connector](https://dev.mysql.com/downloads/connector/j/)

## Requisitos Previos

Para ejecutar este proyecto necesitas:

1. Tener instalado **Java JDK** (Java Development Kit).
2. Tener configurada una base de datos **MySQL**.
3. **NetBeans** (o cualquier otro IDE de Java, como **Eclipse** o **IntelliJ IDEA**) para abrir y ejecutar el proyecto.
4. **MySQL Connector**: Descargado y configurado en el proyecto. Puedes obtenerlo desde el sitio oficial de MySQL en [este enlace](https://dev.mysql.com/downloads/connector/j/).

## Configuración de la Base de Datos

1. En tu sistema de gestión de MySQL, importa el archivo `bd_registros.sql` incluido en este repositorio. Este archivo crea la base de datos `bd_registros` y la tabla necesaria (`empleados`) para almacenar los registros. Antes de importar deberías tener creada la base de datos en MySQL `CREATE DATABASE bd_registros`.

   Puedes importar el archivo usando el siguiente comando en MySQL:

   ```bash
   mysql -u tu_usuario -p bd_registros < 'tu_ruta_de_carpetas'\bd_registros.sql

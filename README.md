# Proyecto Spring Boot - API Stefanini

## Descripción

Este proyecto es una API desarrollada con Spring Boot que ofrece funcionalidades para la empresa Stefanini. Proporciona endpoints para interactuar con una base de datos utilizando Spring Data JPA y permite la visualización de la documentación de la API mediante Swagger UI.

## Dependencias

- Spring Boot Starter Data JPA: Proporciona las dependencias necesarias para trabajar con JPA y Hibernate para la persistencia de datos en la base de datos.
- Spring Boot Starter Web: Proporciona las dependencias necesarias para desarrollar aplicaciones web utilizando Spring MVC y Tomcat embebido como servidor web.
- springfox-swagger2: Permite la generación de la documentación de la API en formato Swagger 2, lo que facilita su visualización y prueba.
- springfox-swagger-ui: Proporciona una interfaz de usuario para interactuar con la documentación de la API generada por Swagger 2.
- javax.servlet-api: Proporciona las clases e interfaces para trabajar con el API de Servlet, requeridas para el desarrollo de aplicaciones web Java.
- springfox-boot-starter: Integra las dependencias de springfox-swagger2 y springfox-swagger-ui para simplificar su configuración en proyectos Spring Boot.
- mysql-connector-j: Driver JDBC para la conexión y manipulación de datos en una base de datos MySQL.
- Spring Boot Starter Test: Proporciona las dependencias necesarias para escribir pruebas unitarias y de integración en el proyecto.

## Requisitos

- Java 17 o superior
- Maven 3.x

## Ejecución

Para ejecutar la aplicación, sigue estos pasos:

1. Clona el repositorio o descarga el código fuente del proyecto.
2. Abre una terminal o línea de comandos en el directorio raíz del proyecto.
3. Ejecuta el siguiente comando para compilar y empaquetar la aplicación:

```shell
mvn clean package

- Una vez que la compilación sea exitosa, ejecuta el siguiente comando para iniciar la aplicación:

java -jar target/Stefanini-API-0.0.1-SNAPSHOT.jar

    La aplicación estará disponible en http://localhost:8080/api.

Documentación de la API

Una vez que la aplicación esté en ejecución, puedes acceder a la documentación de la API generada por Swagger UI:

    Documentación Swagger UI: http://localhost:8080/api/swagger-ui/index.html

Configuración de la Base de Datos

-- phpMyAdmin SQL Dump
-- version 5.2.1-1.fc38
-- https://www.phpmyadmin.net/
--
-- Servidor: localhost
-- Tiempo de generación: 29-07-2023 a las 02:26:53
-- Versión del servidor: 8.0.34
-- Versión de PHP: 8.2.8

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `stefanini`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuarios`
--

CREATE TABLE `usuarios` (
  `id_usuarios` bigint NOT NULL,
  `nombre_usuario` varchar(255) COLLATE utf8mb4_bin NOT NULL,
  `tipo_documento` varchar(255) COLLATE utf8mb4_bin NOT NULL,
  `documento` varchar(255) COLLATE utf8mb4_bin NOT NULL,
  `categoria` varchar(255) COLLATE utf8mb4_bin NOT NULL,
  `tarjeta` tinyint(1) DEFAULT NULL,
  `fecha_registro` datetime(6) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin;

--
-- Volcado de datos para la tabla `usuarios`
--

INSERT INTO `usuarios` (`id_usuarios`, `nombre_usuario`, `tipo_documento`, `documento`, `categoria`, `tarjeta`, `fecha_registro`) VALUES
(384, 'Tally Knotton', 'CC', '406-73-0436', 'Mercado', 1, '2022-07-06 00:00:00.000000'),
(822, 'Heidie Purdom', 'CE', '829-44-7403', 'Mercado', 0, '2022-01-23 00:00:00.000000'),
(1065, 'Tasia Thirlwell', 'CC', '113-92-9476', 'Mercado', 0, '2021-06-23 00:00:00.000000'),
(1081, 'Sheri Fend', 'Pasaporte', '869-35-0478', 'Ahorro', 0, '2021-03-01 00:00:00.000000'),
(1137, 'Eveleen Snoding', 'CC', '140-86-7131', 'Moda', 0, '2022-03-15 00:00:00.000000'),
(1414, 'Maxwell McCanny', 'CC', '863-74-8349', 'Moda', 0, '2021-09-21 00:00:00.000000'),
(2866, 'Seana Favela', 'Pasaporte', '455-92-4037', 'Mercado', 0, '2022-01-14 00:00:00.000000'),
(3024, 'Evanne Dutnell', 'Pasaporte', '831-40-6660', 'Ahorro', 1, '2022-05-04 00:00:00.000000'),
(3154, 'Emlynne Scriviner', 'Pasaporte', '863-82-8333', 'Mercado', 0, '2021-11-30 00:00:00.000000'),
(3426, 'Elyssa Cluckie', 'CC', '716-68-9625', 'Ahorro', 0, '2021-04-23 00:00:00.000000'),
(3555, 'Daveta Woodcroft', 'Pasaporte', '470-51-2637', 'Moda', 1, '2021-10-14 00:00:00.000000'),
(3629, 'Richard Pinnell', 'CE', '458-70-8810', 'Mercado', 1, '2021-02-25 00:00:00.000000'),
(4107, 'Coleman Howett', 'CE', '521-16-1592', 'Diversión', 0, '2021-08-05 00:00:00.000000'),
(4183, 'Cyril Glavis', 'CC', '574-75-3496', 'Mercado', 0, '2021-12-17 00:00:00.000000'),
(4226, 'Angelo Hampton', 'CE', '403-67-4328', 'Moda', 1, '2022-02-08 00:00:00.000000'),
(5815, 'Damara Verrell', 'Pasaporte', '776-05-2243', 'Moda', 0, '2022-07-11 00:00:00.000000'),
(6171, 'Taylor Townsley', 'Pasaporte', '791-84-1858', 'Mercado', 1, '2021-04-05 00:00:00.000000'),
(6530, 'Pinchas Belliveau', 'CC', '521-21-7230', 'Diversión', 0, '2021-11-09 00:00:00.000000'),
(6582, 'Lise Kamiyama', 'CC', '829-06-9583', 'Diversión', 1, '2021-07-13 00:00:00.000000'),
(6648, 'Milena Budgey', 'CE', '332-72-6747', 'Diversión', 1, '2021-08-27 00:00:00.000000'),
(6804, 'Clarita Meltetal', 'Pasaporte', '763-10-8268', 'Moda', 0, '2021-09-30 00:00:00.000000'),
(7534, 'Terrijo MacKnockiter', 'Pasaporte', '399-61-4959', 'Moda', 1, '2021-12-26 00:00:00.000000'),
(7741, 'Brandi Markovic', 'Pasaporte', '543-86-4332', 'Mercado', 0, '2022-03-09 00:00:00.000000'),
(8122, 'Mauricio Cowan', 'CE', '198-51-1409', 'Diversión', 0, '2021-06-07 00:00:00.000000'),
(8570, 'Birch Earles', 'CC', '437-49-4206', 'Moda', 0, '2021-07-28 00:00:00.000000'),
(9026, 'Winifred Bussy', 'Pasaporte', '268-80-8936', 'Diversión', 0, '2021-12-21 00:00:00.000000'),
(9042, 'Konrad Christol', 'CC', '728-48-7160', 'Moda', 0, '2021-02-27 00:00:00.000000'),
(9334, 'Winny Pickrill', 'CE', '863-47-0740', 'Mercado', 0, '2022-01-23 00:00:00.000000'),
(9995, 'Cyrillus Fynes', 'CC', '826-11-3024', 'Diversión', 0, '2022-05-16 00:00:00.000000');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `usuarios`
--
ALTER TABLE `usuarios`
  ADD PRIMARY KEY (`id_usuarios`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `usuarios`
--
ALTER TABLE `usuarios`
  MODIFY `id_usuarios` bigint NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9999;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

La aplicación está configurada para utilizar una base de datos MySQL. Asegúrate de tener una instancia de MySQL en ejecución y configura los detalles de conexión en el archivo application.properties o application.yml según tus necesidades.

```

## Pruebas

El proyecto incluye pruebas unitarias y de integración para garantizar la calidad del código. Para ejecutar las pruebas, utiliza el siguiente comando:

mvn test

## Este proyecto fue desarrollado por Leopoldo Caraballo.

## Este proyecto está licenciado bajo la Licencia LIBRE.

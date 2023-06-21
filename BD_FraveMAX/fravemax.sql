-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 21-06-2023 a las 02:52:31
-- Versión del servidor: 10.4.28-MariaDB
-- Versión de PHP: 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `fravemax`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cliente`
--

CREATE TABLE `cliente` (
  `idCliente` int(11) NOT NULL,
  `apellido` varchar(30) NOT NULL,
  `nombre` varchar(30) NOT NULL,
  `dni` int(11) NOT NULL,
  `domicilio` varchar(50) NOT NULL,
  `telefono` int(30) NOT NULL,
  `estado` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `cliente`
--

INSERT INTO `cliente` (`idCliente`, `apellido`, `nombre`, `dni`, `domicilio`, `telefono`, `estado`) VALUES
(1, 'Sosas', 'Rodrigo', 28965421, 'San Martin 66', 267854521, 0),
(2, 'diaz', 'oscar', 34525855, 'Mitre 300', 2147483647, 1),
(3, 'Juan', 'Tello', 32588456, 'Peñaloza 123', 11223252, 1),
(4, 'diaz', 'ignacio', 32456789, 'Mitre 333', 256854585, 1),
(5, 'Pablo', 'Roldano', 3214565, 'San Juan 258', 26574852, 1),
(6, 'Andrez', 'Palacio', 3214569, 'Lainez 234', 26584852, 1),
(7, 'Ignacio', 'Soloas', 3332258, 'juan saa 222', 26547532, 1),
(9, 'daniel', 'dominguez', 35486513, 'lavalle 555', 26579845, 1),
(10, 'figueroa', 'marcela', 32145698, 'Berrondo 147', 265752652, 1),
(12, 'Bustos', 'Sofia', 32156454, 'Iseas 1544', 265487554, 0),
(13, 'Romina', 'Andreani', 35478545, 'Los Andes 1255', 112548784, 1),
(14, 'Perez', 'Carlos Manuel', 22564587, 'Alric 258', 26545522, 1),
(15, 'Ruis', 'Sebastian', 32564548, 'Chacabuco 235', 265487611, 1),
(16, 'Retegui', 'Carolina', 32589564, 'Cordoba 147', 265898641, 0),
(17, 'Gomez', 'Dario', 235484956, 'Juan w gez 123', 262589456, 1),
(19, 'Romina', 'Calderon', 34785121, 'Andes 666', 222555888, 1),
(20, 'Romero', 'Cristian', 32659874, 'Berrondo 1233', 26598977, 1),
(21, 'Gimenez', 'Marcela', 35998154, 'Lavalle 555', 265555845, 1),
(22, 'Lorenzo', 'Carlos', 25852585, 'la madrid 123', 26589655, 1),
(23, 'Caceres', 'Jorge', 65945121, 'domicilio x', 265948454, 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `compra`
--

CREATE TABLE `compra` (
  `idCompra` int(11) NOT NULL,
  `idProveedor` int(11) NOT NULL,
  `fecha` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `detallecompra`
--

CREATE TABLE `detallecompra` (
  `idDetalle` int(11) NOT NULL,
  `cantidad` int(11) NOT NULL,
  `precioCosto` double NOT NULL,
  `idCompra` int(11) NOT NULL,
  `idProducto` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `detalleventa`
--

CREATE TABLE `detalleventa` (
  `idDetalleVenta` int(11) NOT NULL,
  `cantidad` int(11) NOT NULL,
  `precioVenta` double NOT NULL,
  `idVenta` int(11) NOT NULL,
  `idProducto` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `detalleventa`
--

INSERT INTO `detalleventa` (`idDetalleVenta`, `cantidad`, `precioVenta`, `idVenta`, `idProducto`) VALUES
(1, 1, 98000, 3, 2),
(2, 1, 98000, 4, 2),
(3, 1, 98000, 5, 2),
(4, 2, 260000, 6, 3),
(5, 1, 50000, 7, 6),
(6, 2, 380000, 8, 7),
(7, 4, 48000, 9, 10),
(8, 2, 50000, 10, 9),
(9, 1, 90000, 11, 8),
(10, 1, 50000, 12, 6),
(11, 1, 100000, 13, 4),
(12, 1, 350000, 14, 5),
(13, 1, 100000, 15, 4),
(14, 2, 250000, 16, 1),
(15, 2, 50000, 17, 9),
(16, 1, 98000, 18, 2),
(17, 1, 350000, 19, 5),
(18, 1, 130000, 20, 3),
(19, 1, 190000, 21, 7),
(20, 1, 98000, 21, 2),
(21, 1, 25000, 22, 9),
(22, 1, 98000, 22, 2),
(23, 1, 100000, 23, 4),
(24, 1, 5000, 23, 15),
(25, 1, 3500, 23, 14);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `producto`
--

CREATE TABLE `producto` (
  `idProducto` int(11) NOT NULL,
  `descripcion` varchar(30) NOT NULL,
  `precioActual` double NOT NULL,
  `stock` int(30) NOT NULL,
  `estado` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `producto`
--

INSERT INTO `producto` (`idProducto`, `descripcion`, `precioActual`, `stock`, `estado`) VALUES
(1, 'Lavarropas Aurora 6kg', 125000, 10, 1),
(2, 'Televisor 42\" Sony', 98000, 12, 1),
(3, 'NoteBook 14\" Lenovo', 130000, 11, 1),
(4, 'Heladera Philips', 100000, 4, 1),
(5, 'PlayStation 5 Sony', 350000, 8, 1),
(6, 'Bicicleta Fija Generica', 50000, 16, 1),
(7, 'NoteBook 15\" Acer', 190000, 9, 1),
(8, 'Equipo de Musica Philips', 90000, 15, 1),
(9, 'Plancha Generica Aurora', 25000, 14, 1),
(10, 'Caloventor BKF', 12000, 30, 1),
(11, 'Cinta de Correr SemiProf', 150000, 5, 1),
(12, 'Pava Electrica Generica', 7000, 0, 1),
(13, 'Estufa Electrica ', 15000, 0, 1),
(14, 'Secador de pelo', 3500, -1, 1),
(15, 'Batidora pequeña', 5000, -1, 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `proveedor`
--

CREATE TABLE `proveedor` (
  `idProveedor` int(11) NOT NULL,
  `razonSocial` varchar(30) NOT NULL,
  `domicilio` varchar(30) NOT NULL,
  `telefono` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `proveedor`
--

INSERT INTO `proveedor` (`idProveedor`, `razonSocial`, `domicilio`, `telefono`) VALUES
(1, 'AutoSal srl', 'mitre1159', '265898565'),
(2, 'Distribuidora electroHogar srl', 'iseas 2547 ', '265821565'),
(3, 'Randal', 'ruta 7 km 255', '265865565');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `venta`
--

CREATE TABLE `venta` (
  `idVenta` int(11) NOT NULL,
  `fecha` date NOT NULL,
  `idCliente` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `venta`
--

INSERT INTO `venta` (`idVenta`, `fecha`, `idCliente`) VALUES
(1, '2023-06-14', 4),
(2, '2023-06-14', 4),
(3, '2023-06-14', 1),
(4, '2023-06-14', 1),
(5, '2023-06-14', 1),
(6, '2023-06-14', 7),
(7, '2023-06-14', 12),
(8, '2023-06-14', 13),
(9, '2023-06-14', 1),
(10, '2023-06-14', 13),
(11, '2023-06-14', 5),
(12, '2023-06-14', 4),
(13, '2023-06-14', 1),
(14, '2023-06-14', 1),
(15, '2023-06-14', 4),
(16, '2023-06-14', 15),
(17, '2023-06-14', 14),
(18, '2023-06-14', 12),
(19, '2023-06-14', 1),
(20, '2023-06-15', 1),
(21, '2023-06-20', 16),
(22, '2023-06-20', 1),
(23, '2023-06-20', 6);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `cliente`
--
ALTER TABLE `cliente`
  ADD PRIMARY KEY (`idCliente`),
  ADD UNIQUE KEY `dni` (`dni`);

--
-- Indices de la tabla `compra`
--
ALTER TABLE `compra`
  ADD PRIMARY KEY (`idCompra`),
  ADD KEY `compra_proveedor` (`idProveedor`);

--
-- Indices de la tabla `detallecompra`
--
ALTER TABLE `detallecompra`
  ADD PRIMARY KEY (`idDetalle`),
  ADD KEY `detalleCompra_compra` (`idCompra`),
  ADD KEY `detalleCompra_producto` (`idProducto`);

--
-- Indices de la tabla `detalleventa`
--
ALTER TABLE `detalleventa`
  ADD PRIMARY KEY (`idDetalleVenta`),
  ADD KEY `detalleVenta_venta` (`idVenta`),
  ADD KEY `detalleVenta_producto` (`idProducto`);

--
-- Indices de la tabla `producto`
--
ALTER TABLE `producto`
  ADD PRIMARY KEY (`idProducto`);

--
-- Indices de la tabla `proveedor`
--
ALTER TABLE `proveedor`
  ADD PRIMARY KEY (`idProveedor`);

--
-- Indices de la tabla `venta`
--
ALTER TABLE `venta`
  ADD PRIMARY KEY (`idVenta`),
  ADD KEY `venta_cliente` (`idCliente`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `cliente`
--
ALTER TABLE `cliente`
  MODIFY `idCliente` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=24;

--
-- AUTO_INCREMENT de la tabla `compra`
--
ALTER TABLE `compra`
  MODIFY `idCompra` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `detallecompra`
--
ALTER TABLE `detallecompra`
  MODIFY `idDetalle` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `detalleventa`
--
ALTER TABLE `detalleventa`
  MODIFY `idDetalleVenta` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=26;

--
-- AUTO_INCREMENT de la tabla `producto`
--
ALTER TABLE `producto`
  MODIFY `idProducto` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=16;

--
-- AUTO_INCREMENT de la tabla `proveedor`
--
ALTER TABLE `proveedor`
  MODIFY `idProveedor` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT de la tabla `venta`
--
ALTER TABLE `venta`
  MODIFY `idVenta` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=24;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `compra`
--
ALTER TABLE `compra`
  ADD CONSTRAINT `compra_proveedor` FOREIGN KEY (`idProveedor`) REFERENCES `proveedor` (`idProveedor`);

--
-- Filtros para la tabla `detallecompra`
--
ALTER TABLE `detallecompra`
  ADD CONSTRAINT `detalleCompra_compra` FOREIGN KEY (`idCompra`) REFERENCES `compra` (`idCompra`),
  ADD CONSTRAINT `detalleCompra_producto` FOREIGN KEY (`idProducto`) REFERENCES `producto` (`idProducto`);

--
-- Filtros para la tabla `detalleventa`
--
ALTER TABLE `detalleventa`
  ADD CONSTRAINT `detalleVenta_producto` FOREIGN KEY (`idProducto`) REFERENCES `producto` (`idProducto`),
  ADD CONSTRAINT `detalleVenta_venta` FOREIGN KEY (`idVenta`) REFERENCES `venta` (`idVenta`);

--
-- Filtros para la tabla `venta`
--
ALTER TABLE `venta`
  ADD CONSTRAINT `venta_cliente` FOREIGN KEY (`idCliente`) REFERENCES `cliente` (`idCliente`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

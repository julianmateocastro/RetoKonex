# Reto automatización con serenity screenplay

Esta es una automatización en Java utilizando serenity screenplay, diseñada para cumplir con los requisitos del desafío presentado por la empresa Konex. La automatización se centra en la ejecución de flujos simples en las páginas de YouTube y Wikipedia.

## Prerrequisitos
- [x] Java JDK 11 o superior
- [x] Apache Maven 4.0.0 para compilar y gestionar las dependencias del proyecto

## Instalación
Para instalar este proyecto en tu máquina local, sigue estos pasos:

1. Clona el repositorio en tu máquina local usando `git clone https://github.com/julianmateocastro/RetoKonex.git`
2. Navega hasta el directorio del proyecto usando `cd Reto`

## Ejecución de las pruebas
Para ejecutar las pruebas, usa el siguiente comando en la raíz del proyecto:

```bash
mvn clean verify '-Dtest=WikipediaRunner,YoutubeRunner'

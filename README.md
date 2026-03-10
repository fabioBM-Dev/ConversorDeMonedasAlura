# ConversorDeMonedasAlura
Desafío AluraLatam de Creacion Conversor de monedas usando JAVA, Spring y API

# 💱 Conversor de Monedas - Challenge Java

¡Bienvenido al Conversor de Monedas! Este proyecto es un desafío de programación desarrollado como parte de mi formación en el programa **Oracle Next Education (ONE)** junto a **Alura Latam**. Es una aplicación de consola en Java que permite realizar conversiones de divisas en tiempo real consumiendo una API externa.

## 🚀 Funcionalidades

* **Conversión en tiempo real:** Obtiene las tasas de cambio actualizadas a través de la API de ExchangeRate-API.
* **Menú interactivo:** Interfaz amigable en consola para que el usuario elija las monedas y cantidades.
* **Soporte dinámico:** Permite consultar cualquier divisa base (COP, USD, BRL, JPY, EUR, etc.).
* **Bucle de uso:** Puedes realizar múltiples conversiones en una misma sesión hasta que decidas salir.

## 🛠️ Tecnologías Utilizadas

* **Java 17** (o la versión que estés usando en IntelliJ).
* **Gson:** Biblioteca de Google para convertir JSON a objetos Java.
* **HttpClient:** Para realizar peticiones HTTP a la API.
* **ExchangeRate-API:** Servicio externo para obtener las tasas de mercado (TRM).

## 📁 Estructura del Proyecto

El proyecto sigue una arquitectura organizada para separar responsabilidades:

1.  **`Principal.java`**: Contiene el menú (`switch`) y la lógica de interacción con el usuario.
2.  **`ConsultaMonedaApi.java`**: Se encarga de la conexión HTTP y de traer los datos de la API.
3.  **`DatosMonedaApi.java`**: Un `record` que actúa como DTO para mapear la respuesta JSON de forma eficiente.
4.  **`Moneda.java`**: Clase de modelo para gestionar los datos procesados.

## ⚙️ Cómo ejecutar el proyecto

1.  Clona este repositorio:
    ```bash
    git clone [https://github.com/tu-usuario/nombre-de-tu-repo.git](https://github.com/tu-usuario/nombre-de-tu-repo.git)
    ```
2.  Abre el proyecto en **IntelliJ IDEA**.
3.  Asegúrate de tener agregada la librería **Gson** en las dependencias del proyecto.
4.  Ejecuta la clase `Principal.java`.
5.  ¡Sigue las instrucciones en la consola!

## 📸 Demostración

> <img width="476" height="856" alt="image" src="https://github.com/user-attachments/assets/88762255-2d55-4512-8b34-aa4c090f3dd9" />

>
> 

---
Desarrollado con ❤️ por FABIO BARON - Dev. en proceso de formacion Programa Alura Latam - ONE Oracle Next Education.

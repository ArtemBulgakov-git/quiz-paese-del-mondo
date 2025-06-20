# 🌍 World Country Quiz — Spring Boot Edition

A web application built with **Spring Boot** that offers an educational quiz on countries around the world. Users can answer questions about country names, flags, and other characteristics, with backend logic and an interactive frontend interface.

---

## 🚀 Key Features

- Dynamic quiz with questions about countries and flags
- Interactive web interface (HTML/CSS/JavaScript)
- Data persistence using Spring Data JPA
- Combined MVC and REST architecture
- Automatic database initialization using `schema.sql` and `data.sql`

---

## 🛠️ Technologies Used

| Layer          | Technologies                                       |
|----------------|----------------------------------------------------|
| Backend        | Java 17+, Spring Boot, Spring MVC, Spring Data JPA |
| Frontend       | HTML, CSS, Vanilla JavaScript                      |
| Database       | H2 in-memory (via JDBC)                            |
| Build System   | Maven                                              |

---

## 📁 Project Structure


QuizGruppo/
├── src/
│ ├── main/
│ │ ├── java/com/cai/quiz_spring/
│ │ │ ├── api/ # Endpoint REST
│ │ │ ├── entities/ # Entity JPA
│ │ │ ├── repos/ # Repository JPA
│ │ │ ├── services/ # Logica di business
│ │ │ ├── web/ # Controller MVC
│ │ │ └── QuizSpringApplication.java
│ │ ├── resources/
│ │ │ ├── static/ # JS, CSS, immagini bandiere
│ │ │ ├── templates/ # HTML (Thymeleaf o simili)
│ │ │ ├── application.properties
│ │ │ ├── schema.sql
│ │ │ └── data.sql
│ └── test/
│ └── java/... # Test di unità
├── pom.xml # Configurazione Maven
├── mvnw*, .vscode, .gitignore # Configurazioni progetto
└── README.md # Questo file


---

## 🧪 Esecuzione locale

### ▶️ Prerequisiti

- Java 17+
- Maven

### ▶️ Avvio dell’applicazione

```bash
# Clona il repository
git clone  https://artembulgakov-git.github.io/quiz-paese-del-mondo/
cd quiz-paese-del-mondo-spring

# Compila ed esegui
./mvnw spring-boot:run

The application will be accessible at:
http://localhost:8080


## 🌐 Example REST Endpoints
GET /api/countries → List all countries

GET /api/countries/random → Get a random country for the quiz

POST /api/game/start → Start a new game session

POST /api/game/submit → Submit an answer


## 🖥️ Frontend Interface
The static files in the resources/static/ directory handle:

Rendering questions and flag images

Handling user interactions

Answer checking and score tracking

## 🧠 Future Improvements
User accounts and leaderboards

Difficulty levels and countdown timer

Multi-language support

Game session statistics

## 📝 License

This project is **free for educational and non-commercial use with attribution**.  
You **must credit** the original authors and **may not re-publish it as your own** without explicit permission.

See the full [LICENSE](./LICENSE) for details.

## 👨‍💻 Authors

Artem Bulgakov
Elisa Andreoli
Matteo Cai

## 📌 Notes

This project was developed within the scope of the "Programmazione - Java" course, focusing on Java Spring Boot architecture, under the guidance of full-stack developer and certified Java and Cloud trainer Mauro Bogliancino.

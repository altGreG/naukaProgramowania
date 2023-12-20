# Sklep Internetowy - Java, Spring ...

1. Inicjalizacja projektu w Springu
	https://start.spring.io/
	- Maven
	- SpringBoot 3.2.0
	- Java 17
		Rozszerzenia:
		- Spring Web
		- Lombork
		- Thymeleaf
		- H2 Database
		- Spring Data JPA

2. Struktura Projektu
	- struktura katalogowa: src, java, resources
	- pom.xml plik konfiguracyjny
	- maven: lifecycles, folder target
	- Tomcat serwer, automatycznie wbudowany dzięki spring bootowi (port 8080)
	

3. Pierwszy kontroler
- dodanie kontrolera: punkt dostępu do aplikacji requesty http i odpowiedzi na nie
- w Springu dużo używa się adnotacji
Użyte adnotacje:
	- @GetMapping("/")
	- @ResponseBody
4. Widoki
- pliki html i css umieszczamy w katalogu resources
- do edytowania plików html i css warto użyć VS Code

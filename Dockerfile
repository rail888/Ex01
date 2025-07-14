FROMopenjdk:17
COPYtarget/Ex01-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT["java", "-jar", "/app.jar"]
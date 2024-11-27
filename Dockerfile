FROM openjdk:21-bullseye as builder

COPY . .

RUN ./gradlew bootJar


FROM openjdk:21

COPY --from=builder /build/libs/application.jar .

ENTRYPOINT ["java", "-jar", "application.jar"]

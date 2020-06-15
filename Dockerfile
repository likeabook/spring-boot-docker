FROM openjdk:8-jre-alpine

ADD spring-boot-docker222-2.2.0.RELEASE.jar /app.jar

ENTRYPOINT exec java $JAVA_OPTS -jar /app.jar \
    $JAR_OPTS

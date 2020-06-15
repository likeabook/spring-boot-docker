FROM openjdk:8-jre-alpine
ARG FINAL_NAME

ADD ${FINAL_NAME}.jar /app.jar

ENTRYPOINT exec java $JAVA_OPTS -jar /app.jar \
    $JAR_OPTS

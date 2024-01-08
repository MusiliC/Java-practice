FROM openjdk:8-jdk-alpine
VOLUME /tmp
ARG JAVA_OPTS
ENV JAVA_OPTS=$JAVA_OPTS
COPY target/pizzabillgenerator-1.0-SNAPSHOT.jar javapractice.jar
EXPOSE 8000
ENTRYPOINT exec java $JAVA_OPTS -jar javapractice.jar
# For Spring-Boot project, use the entrypoint below to reduce Tomcat startup time.
#ENTRYPOINT exec java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar javapractice.jar

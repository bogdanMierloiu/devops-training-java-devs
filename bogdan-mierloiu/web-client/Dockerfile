FROM eclipse-temurin:17-jdk-alpine

VOLUME /tmp

#ARG USERNAME=bogdan-dev
#ARG GROUPNAME=bogdan-group
#ARG GROUPID=1001
#ARG USERID=1001
#
#RUN addgroup --gid $GROUPID $GROUPNAME && \
#    adduser --disabled-password --gecos "Virtual-account" --uid $USERID --home /home/$GROUPNAME --ingroup $GROUPNAME $USERNAME
#
#WORKDIR /home/$GROUPNAME

ARG JAR_FILE=target/web-client-0.0.1.jar
#COPY ${JAR_FILE} /home/$GROUPNAME/app-start.jar
COPY ${JAR_FILE} app-start.jar

#USER bogdan-dev

#ENTRYPOINT ["java","-jar","/home/bogdan-group/app-start.jar"]
ENTRYPOINT ["java","-jar","app-start.jar"]

#docker run --name container-1 -p 8080:8080 spring-container-1

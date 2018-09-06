FROM centos7jdk8:3
VOLUME /tmp
ADD ./target/boot-demo-0.0.1-SNAPSHOT.jar /app/
CMD ["sh", "-c", "java ${JAVA_OPTS} -Djava.security.egd=file:/dev/./urandom -jar /app/boot-demo-0.0.1-SNAPSHOT.jar ${RUN_ARGS}"]
EXPOSE 9999
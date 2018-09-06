FROM centos7jdk8:3
VOLUME /tmp
ADD ./target/boot-demo.jar /app/
CMD ["sh", "-c", "java ${JAVA_OPTS} -Djava.security.egd=file:/dev/./urandom -jar /app/boot-demo.jar ${RUN_ARGS}"]
EXPOSE 9999
FROM frolvlad/alpine-oraclejdk8:slim
VOLUME /tmp
ADD ./target/boot-demo.jar /app/
#CMD ["sh", "-c", "java ${JAVA_OPTS} -Djava.security.egd=file:/dev/./urandom -jar /app/boot-demo.jar ${RUN_ARGS}"]
CMD java -jar /app/boot-demo.jar
EXPOSE 9998
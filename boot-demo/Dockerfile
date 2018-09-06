FROM frolvlad/alpine-oraclejdk8:slim
# VOLUME /tmp
ADD /var/lib/jenkins/workspace/maven-test/boot-demo/target/boot-demo.jar /app/
CMD ["sh", "-c", "java ${JAVA_OPTS} -Djava.security.egd=file:/dev/./urandom -jar /app/boot-demo.jar ${RUN_ARGS}"]
EXPOSE 9999
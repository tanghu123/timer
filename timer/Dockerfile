# Runner container
FROM vip-proxy.vip:5000/centos/openjdk8

run mkdir -p /opt/timer

ARG JAR_FILE
ADD target/${JAR_FILE} /opt/timer/timer.jar
CMD ["/usr/bin/java", "-jar", "/opt/timer/timer.jar"]
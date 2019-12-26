# Runner container
FROM vip-proxy.vip:5000/centos/openjdk8

run mkdir -p /opt/timer

COPY ./timer/target/*.jar /opt/timer/
ENV jarfile $(find /opt/timer -name timer-*.jar)
CMD java -jar $jarfile
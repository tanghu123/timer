# Runner container
FROM vip-proxy.vip:5000/centos/openjdk8

run mkdir -p /opt/timer

COPY ./timer/target/*.jar /opt/timer/
CMD java -jar $jarfile
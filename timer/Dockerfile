# Runner container
FROM vip-proxy.vip:5000/centos/openjdk8

run mkdir -p /opt/timer

COPY ./timer/target/*.jar /opt/timer/
COPY ./timer/startup.sh /opt/timer/
run chmod 755 /opt/timer /opt/timer/startup.sh
CMD sh /opt/timer/startup.sh
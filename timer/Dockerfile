# Runner container
FROM vip-proxy.vip:5000/java

run mkdir -p /opt/timer

COPY ./timer/target/*.jar /opt/timer/
COPY ./timer/startup.sh /opt/timer/
run chmod 777 /opt/timer /opt/timer/startup.sh
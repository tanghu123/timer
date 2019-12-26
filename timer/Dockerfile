# Runner container
FROM vip-proxy.vip:5000/java

COPY ./timer/target/*.jar /var/
COPY ./timer/startup.sh /var/
run chmod 755 /var/startup.sh /var/*.jar
export ORDER_SERVICE_URL=http://localhost:8082/order
export CUSTOMER_SERVICE_URL=http://localhost:8081/customer

cd build/libs

java -jar api-gateway-1.0-SNAPSHOT.jar
# Currency-exchange service

## URL for testing
http://localhost:8000/currency-exchange/from/{from}/to/{to}
http://localhost:8000/currency-exchange/from/USD/to/INR

kubectl get all 
check for external ip
35.193.18.216
http://35.193.18.216:8000/currency-exchange/from/USD/to/INR
curl http://35.225.70.255:8000/currency-exchange/from/USD/to/INR




## Docker commands
```
spring-boot:build-image -DskipTests[docker-compose.yaml](..%2Fdocker-compose.yaml)
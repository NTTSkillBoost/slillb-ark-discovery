http://localhost:8761/eureka
# slillb-ark-discovery



docker build -t rogeriofontes/slillb-ark-discovery:v1 .
docker login
docker push rogeriofontes/slillb-ark-discovery:v1


docker-compose -f docker-compose-api.yml up -d
docker-compose -f docker-compose-api.yml down
---
docker-compose -f docker-compose-hub.yml up -d
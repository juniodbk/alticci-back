# how to run this project

This project uses Quarkus

## Running the application in dev mode

You can run your application in dev mode that enables live coding using:
```shell script
./mvnw compile quarkus:dev
```

## Packaging and running the application

The application can be packaged using:
```shell script
./mvnw package
```
It produces the `quarkus-run.jar` file in the `target/quarkus-app/` directory.

## Creating docker image

You can create a native executable using: 
```shell script
./mvnw package
docker build -f src/main/docker/Dockerfile.jvm -t quarkus/code-with-quarkus-jvm .
```

To run:
```shell script
docker run -i --rm -p 8080:8080 quarkus/code-with-quarkus-jvm
```

Once your application is started, you can go to `http://localhost:8080/q/swagger-ui` and play with your API or get the doc yml in `http://localhost:8080/q/openapi` or json in `http://localhost:8080/q/openapi?format=json`.
make:
	mvn package && mvn clean package

run:
	java -jar target/hybrid-1.0-SNAPSHOT.jar

docker-build:
	# docker build -t jenky-spring-docker .
	
docker-pull-run:
	docker run --rm -p 5850:9090 countach/springboot-docker-jenkins
	
clean:
	# Clean build



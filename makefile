make:
	mvn package && mvn clean package

run:
	java -jar target/hybrid-1.0-SNAPSHOT.jar

docker-build:
	docker build -t jenky-spring-docker .
	
docker-pull:
	# Pull from DockerHub

clean:
	# Clean build



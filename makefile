make:
	mvn package && mvn clean package

run:
	java -jar target/hybrid-1.0-SNAPSHOT.jar

docker:
	docker run -p 8000:9090 jenky

clean:
	# Clean build



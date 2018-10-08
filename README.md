# Jenkins-Spring

#### Deploying a [dockerized](http://jasonwilder.com/blog/2014/10/13/a-simple-way-to-dockerize-applications/) Spring-boot application with Jenkins (and Heroku)

![Imgur](https://i.imgur.com/ea3O10E.jpg)

- ##### Dependencies include: [Heroku CLI](https://devcenter.heroku.com/articles/heroku-cli), [Maven CLI](https://maven.apache.org/install.html), [Docker CLI](https://docs.docker.com/install/overview/), [Jenkins](https://jenkins.io/download/).
---
##### Login to heroku container registry
```
$ heroku container:login
```
##### Create a new registry application: 
+ ###### NB: You need to link this new application to the github repository housing your Spring-boot application, do this manually via the heroku dashboard: heroku-app-dashboard > Deploy > Deployment method
```
$ heroku create
```
##### Create an image of the registry application (locally): 
```
$ heroku container:push web --app <generated-app-name>
$ heroku container:release web --app <generated-app-name>
```
##### Push the created image to dockerhub
```
$ docker login
$ docker tag <imageID> <DockerhubUsername>/<DockerhubRepoName>:<ImageTag>
$ docker push <DockerhubUsername>/<DockerhubRepoName>
```
##### The image will then be pulled from dockerhub, built and run by Jenkins:

###### Jenkinsfile:
```
pipeline {
    agent any
    
    stages {
        .....
        
        stage('D E P L O Y') {
            steps {
                sh 'make docker-pull-run'
            }
        }
    }
    
    ...
}
```

###### makefile:
```
....

docker-pull-run:
	docker run --rm -p 5850:9090 countach/springboot-docker-jenkins:jenky
	
  ...

```

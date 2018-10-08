/********** Declaritive ***********/
pipeline {
    agent any
    
    stages {
        /************** Production **************/
        stage('Pull (and run) image from Dockerhub') {
            steps {
                # docker run --rm -p <Port>:9090 countach/springboot-docker-jenkins
                sh 'make docker-pull-run'
            }
        }
        /************** Development **************/
        stage('Build') {
            steps {
                # sh 'make'
                sh 'traceroute localhost:5850'
            }
        }
        stage('Deploy') {
            steps {
                # sh 'make run'
                sh 'curl localhost:5850'
            }
        }
    }
    post{
        always{
            sh 'make clean'
        }
    }
}

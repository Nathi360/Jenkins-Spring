/********** Declaritive ***********/
pipeline {
    agent any
    
    stages {
        stage('Build and push application container to Dockerhub') {
            steps {
                # To be run once for each new build of the application (new state/instance)
                sh 'make docker-build'
            }
        }
        stage('Build') {
            steps {
                sh 'make'
            }
        }
        stage('Deploy') {
            steps {
                sh 'make run'
            }
        }
    }
    post{
        always{
            sh 'make clean'
        }
    }
}

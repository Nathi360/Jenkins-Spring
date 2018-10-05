/********** Declaritive ***********/
pipeline {
    agent any
    
    stages {
        stage('Build ') {
            steps {
                sh 'make'
                sh ''
            }
        }
        stage('Test') {
            steps {
                
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

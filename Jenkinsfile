/********** Declaritive ***********/
pipeline {
    agent any
    
    stages {
        stage('Build ') {
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

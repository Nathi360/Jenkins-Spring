/********** Declaritive ***********/
pipeline {
    agent any
    
    stages {
        stage('B U I L D') {
            steps {
                sh 'echo "Building application!"'
            }
        }
        stage('T E S T') {
            steps {
                sh 'echo "Testing application!"'
            }
        }
        stage('D E P L O Y') {
            steps {
                sh 'make docker-pull-run'
            }
        }
    }
    post{
        always{
            sh 'make clean'
        }
    }
}

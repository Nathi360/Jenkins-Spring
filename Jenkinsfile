/********** Declaritive ***********/
pipeline {
    agent any
    
    stages {
        stage('B U I L D') {
            steps {
                // Build and pack application here
                sh 'echo "Building application!"'
            }
        }
        stage('T E S T') {
            steps {
                // Trigger application test-suites here
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

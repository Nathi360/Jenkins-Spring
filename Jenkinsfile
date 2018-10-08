/********** Declaritive ***********/
pipeline {
    agent any
    
    stages {
        /************** Production **************/
        stage('B U I L D') {
            steps {
                //sh 'make'
                sh 'echo "Building application!"'
            }
        }
        stage('T E S T') {
            steps {
                //sh 'make run'
                sh 'echo "Testing application!"'
            }
        }
        stage('D E P L O Y') {
            steps {
                //docker run --rm -p <Port>:9090 countach/springboot-docker-jenkins
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

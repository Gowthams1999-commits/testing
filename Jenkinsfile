pipeline {

    agent {
        docker {
            image 'gowthamtest1999/ubuntu-docker-maven:v1'
            args '-v /var/run/docker.sock:/var/run/docker.sock'
        }
    }

    stages {

        stage('code checkout') {
            steps {
                git credentialsId: 'git_creds',
                    url: 'https://github.com/Gowthams1999-commits/testing.git'
            }
        }

        stage('maven build test') {
            steps {
                sh '''
                    mvn clean
                    mvn package
                '''
            }
        }

    }

}

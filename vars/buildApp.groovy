def call() {
    stage('Build Stage') {
        echo "Building the application using Shared Library"
        sh 'echo Build started'
    }
}

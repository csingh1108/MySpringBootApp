pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                
                // Get some code from a GitHub repository
                git 'https://github.com/csingh1108/MySpringBootApp.git'

                // Run Maven Wrapper commands.
                sh "./mvnw compile"
                
                echo 'Building the project with Maven compile'
            }
        }
        
        stage('Test') {
            steps {

                // Run Maven Wrapper commands.
                sh "./mvnw test"
                
                  echo 'Testing the project with Maven test'
            }
        }
        
        stage('Deploy') {
            steps {

                // Run Maven Wrapper commands.
                sh "./mvnw package"
                
                  echo 'Deploying the project with Maven package'
            }
        }
    }
}
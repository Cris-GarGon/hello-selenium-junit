pipeline {
    agent any

    stages{ 
        stage('Build') {
            steps {
                withGradle {
                    sh './gradlew assemble'
                }
            }
        }

        stage('Test') {
            steps {
                withGradle {
                    sh './gradlew clean test'
                }
            }
        }
    }
}
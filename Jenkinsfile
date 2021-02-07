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
                    sh './gradlew check'
                }
            }
            post {
                always {
                    junit 'build/test-results/test/TEST-*.xml'
                    recordIssues(
                        enabledForFailure: true, 
                        tool: checkStyle(pattern: 'build/reports/checkstyle/*.xml')
                    )
                }
            }
        }
    }
}

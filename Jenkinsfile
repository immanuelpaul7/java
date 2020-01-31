pipeline {
    agent any
    
    tools { 
        maven 'maven' 
    }
    stages {
        stage('Build') {
            steps {
                snDevOpsStep()
                echo 'Building..'
                echo "Pipeline name is ${env.JOB_NAME}"
        echo "Pipeline run rumber is ${env.BUILD_NUMBER}"
        echo "Stage name is ${env.STAGE_NAME}"
        echo "GIT branch is ${env.GIT_BRANCH}"
        sh 'mvn clean install'

        }
            post {
                success {
                    junit '**/target/surefire-reports/*.xml' 
                }
            }
        }
        stage('Deploy') {
            steps {
                snDevOpsStep()
            }
        }
    }
}

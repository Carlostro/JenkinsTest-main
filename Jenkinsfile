pipeline {
    agent any
    parameters {
        choice(name: "VERSION", choices:['1.1.0', '1.2.0', '1.3.0'], description: 'Select the version to build and deploy')
        booleanParam(name: 'executeTest', defaultValue: true, description: 'Check to execute tests')
    }
    stages {
        stage('Build') {
            steps {
                echo 'Building...'
                sh 'mvn clean install'  // Agrega comandos de construcción reales aquí
            }
        }
        stage('Test') {
            when {
                expression {
                    params.executeTest
                }
            }
            steps {
                echo 'Testing...'
                sh 'mvn test'  // Agrega comandos de prueba reales aquí
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying...'
                echo "Deploying version ${params.VERSION}"
                sh "./deploy.sh ${params.VERSION}"   
            }
        }
    }   
}

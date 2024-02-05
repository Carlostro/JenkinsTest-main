def gv

pipeline {
    agent any
    parameters{
        choice(name: 'VERSION' , choices:['1.1.0','1.2.0','1.3.0'], description: '')
        booleanParam(name:'executeTest', defaultValue: true , description: '')

    }
    stages {
        stage("Build") {
            steps {
                echo 'Building..'
                sh "mvn --version"
            }
        }
        stage("Test") {
            when{
                expression{
                    params.executeTest
                }
            }
            steps {
                echo 'Testing..'
            }
        }
        stage("deploy") {
            steps {
                echo 'Deploying....'
                echo "deploying version ${params.VERSION}"
            }
        }
    }   
}
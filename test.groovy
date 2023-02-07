

pipeline {
    agent { label any }

    options {
        ansiColor('xterm')
    }

    stages {
        stage('Preparing the Environment') {
            steps {
                script{
                    sh '''
                        get_greetings = "Hi Phani"
                    '''
                }
            }
        }

        stage('Publishing and Signing the Image') {
            steps {
                script{
                    sh '''
                        echo $get_greetings
                    '''
                }
            }
        }
    }
}
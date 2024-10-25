/////////// Build another project //////////////
pipeline{
    agent any
    stages{
        stage("stage-1"){
            steps{
                build 'simple-pipeline'
            }
        }
    }
}
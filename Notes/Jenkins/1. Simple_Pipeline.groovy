/////// simple pipeline ////////

pipeline{
    agent any
    stages{
        stage("stage-1"){
            steps{
                sleep 10
            }
        }
        stage("stage-2"){
            steps{
                sleep 10
            }
        }
        stage("stage-3"){
            steps{
                sleep 10
            }
        }
    }
}
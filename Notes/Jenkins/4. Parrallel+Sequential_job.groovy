///////parrallel + sequential job///////////////
pipeline{
    agent{
        label "dev"
    }
    stages{
        stage("sequence-1"){
            steps{
                sleep 10
            }
        }
        stage("sequence-2"){
            steps{
                sleep 15
            }
        }
        stage("parralel-stage"){
            parallel{
                stage("stage-1"){
                    steps{
                        sleep 15
                    }
                }
                stage("stage-2"){
                    steps{
                        sleep 15
                    }
                }
                stage("stage-3"){
                    steps{
                        sleep 15
                    }
                }
            }
        }
        stage("sequence-3"){
                steps{
                    sleep 10
                }
        }
    }
}
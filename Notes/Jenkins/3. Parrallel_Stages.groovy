////////// Parrallel stages ////////////
pipeline{
    agent{
        agent "dev"
    }
    stages{
        stage("parralel-name"){
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
    }
}
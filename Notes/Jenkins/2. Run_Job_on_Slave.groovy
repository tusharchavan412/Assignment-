/////////// Run a job on specific slave ///////////
pipeline{
    agent{
        label "slave-1" //jenkins will run a job on slave-1
    }
    stages{
        stage("stage-1"){
            steps{
                sleep 10
                echo "This is stage one"
            }
        }
        stage("stage-2"){
            steps{
                sleep 10
                echo "This is stage two"
            }
        }
        stage("stage-3"){
            steps{
                sleep 10
                echo "This is stage three"
            }
        }
    }
}
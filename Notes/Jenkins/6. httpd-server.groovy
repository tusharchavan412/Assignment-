///////// httpd server //////////
pipeline{
    agent{
        label "slave-1"
    }
    stages{
        stage("Install-httpd"){
            steps{
                sh '''
                    sudo yum install httpd -y
                '''
            }
        }
        stage ("Start-httpd"){
            sh '''
                sudo systemctl start httpd
            '''
        }
        stage("deploy-application"){
            steps{
                sh '''
                    sudo chmod -R 777 /var/www/html
                    echo "Test web appliation" > /var/www/html/index.html
                '''
            }
        }
    }
}
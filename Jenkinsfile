pipeline {
  agent any

stages{
  stage("echo"){
    steps{
     echo "Hello world"
    }
  }
 stage("docker-command"){
    steps{
     sh "docker --version"
    }
  }  

}
}

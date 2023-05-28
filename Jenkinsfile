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
      retry(3){
     sh "docker --version"
      }}
  }  

}
}

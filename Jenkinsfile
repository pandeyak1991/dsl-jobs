pipeline {
  agent any

stages{
  stage("echo"){
    steps{
     echo "Hello world"
    }
  }
//   commenting below steps as jenkins is installed inside of container
//  stage("docker-command"){
//     steps{
//       retry(3){
//      sh "docker --version"
//       }}
//   }  
  
    stage("build number"){
    steps{
      echo "${env.BUILD_NUMBER}"
    }
  }
  
  
    parallel{
      stage("git clone repo 1")
      steps{
        echo "clone git repo 1" 
      }
      stage("cloning repo 2"){
        steps{
        echo "cloning repo 2"
        }}
    
  }

}
}

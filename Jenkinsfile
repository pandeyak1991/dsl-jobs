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

}
}

pipeline {
  agent any

  options{timestamps()
  buildDiscarder(logRotator(numToKeepStr: "3"))       // will remove old logs and last 3 logs will remain
         
         }   // will add timestemps for each stage and steps 

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
//      Will skip this step if when condition will fail
      when {
        expression {
                    return env.GIT_BRANCH == "origin/test"
                   }
       }
    steps{
      echo "${env.BUILD_NUMBER}"
    }
  }
    
    stage("CleanUP Before deploy"){
      steps{
//         uncomment docker command to make build failure
//         docker ps -a
        echo "Clean up"
      }
    }  
    stage("Build-deploy"){
//       Will ask manual approval for deployement else job will be on hold
      input
          {
          message "Do you want to proceed for deployment ?"   
          }
      steps{
        echo "Deploying build"
      }
    }
    
 // FOLLOWING STEPS WILL EXECUTE PARALLEL ===== 
  stage("parallel"){
    parallel{
      stage("git clone repo 1"){
      steps{
        echo "clone git repo 1" 
      }}
      stage("cloning repo 2"){
        steps{
        echo "cloning repo 2"
        }}
    }
  }
  stage("CleanUP after deploy"){
      steps{
        echo "Clean up"
      }
    }     
// ===============
}
//   this will trigger always
  post{
//     this will always 
   always{
    sh "ls -l / " }
//     this will trigger when job is aborted 
    aborted{
     sh "echo $PWD" 
       }
//     this will trigger when job is aborted
    failure{
     sh "echo Executing because job is failed"
    }
    //   this will trigger when job is successfully executed
  success{
    sh "curl localhost:8080"
  }
  cleanup{
    sh "echo cleaning everything after stage and post job"
  }
  }}

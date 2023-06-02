job("auto-pilot-job"){
//   disabled() //will disable job
  description('Welcome to my Sample DSL Job')
  parameters{
  stringParam('tool',defaultValue="docker",description="name of tool")
  stringParam('Name',defaultValue="DSL-job", description="dsl-job-name")
  choice { name("country")
		description("deployment region")
		choices(['IN','US','SL'])
		}
	booleanParam {
		name("Prod")
		defaultValue(false)
		description("is a production deployment")
		}
      wrappers {
        timestamps()  // will enable timestamp in build environment
       }
    scm{
    git('https://github.com/pandeyak1991/dsl-jobs.git','main') 
    }
     steps { 
       shell("echo 'Hello World'") 
     }
    steps{
    shell("echo docker version")}
   }
   displayName('autopilot-dsl-example') // will change/update the job name, but not project name
}

def q = Jenkins.instance.queue
q.items.each { q.cancel(it.task) }
 
for (int i=0; i < Jenkins.instance.items.size(); i++) {
  if(!killStuckBuilds(Jenkins.instance.items[i])){
     println("Kill failed!")
  }
}
def killStuckBuilds(job){
  def result = true
  def runningBuilds = getRunningBuilds(job)
  def jobName = job.name
  for(int j=0; j < runningBuilds.size(); j++){
    int durationInSeconds = (System.currentTimeMillis() - runningBuilds[j].getTimeInMillis())/1000.0
    result = false
    def buildId = runningBuilds[j].id
    println("Aborting ${jobName}-${buildId} which is running for ${durationInSeconds}s")
    try{
      runningBuilds[j].finish(hudson.model.Result.ABORTED, new java.io.IOException("Aborting build by long running jobs killer"));
      result = true
    }catch(e){
      println("Error occured during aborting build: Exception: ${e}")
    }
  }
  return result
}
def getRunningBuilds(job){
  return job.builds.findAll{build -> build.isBuilding()}
}
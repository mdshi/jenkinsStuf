import jenkins.model.Jenkins

String[] JOBS_TO_WIPE=[
  "Hello1",
  "Hello2"
]


void cleanNode(Node node, item_to_wipe) {
  println("${node.name}:")

  workspacePath = node.getWorkspaceFor(item_to_wipe)
  if(!workspacePath){
    println("    Failed to find workspace path on ${node.name}.")
    return
  }

  pathAsString = workspacePath.getRemote()
  if (workspacePath.exists())
  {
    try {
      workspacePath.deleteRecursive()
      println("    Deleted from location " + pathAsString)
    }
    catch(IOException e) {
      println("    Failed to delete from location " + pathAsString)
    }
  }
}

void wipeJob(String jobName) {
  println("WIPING ${jobName}.")
  println("--------------------------------------------.")

  item_to_wipe = null
  for (item in Jenkins.instance.items) {
    if(item.name == jobName){
      item_to_wipe = item
      break
    }
  }
  
  if(!item_to_wipe){
    println("Failed to find Job with name ${jobName}")
  }
  else {
    for (node in Jenkins.instance.getNodes()) {
        cleanNode(node, item_to_wipe)
    }
  }
}

for (String jobName in JOBS_TO_WIPE) {
  wipeJob(jobName)
}
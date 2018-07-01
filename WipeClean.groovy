import jenkins.model.Jenkins

String [] Jobs_To_Be_Deleted = [
    "Hello"
]

void cleanUPtheNodes(Node node, item_to_clean)
{
    println("${node.name}:")

      workspacePath = node.getWorkspaceFor(item_to_wipe)
  if(!workspacePath){
    println("    Failed to find workspace path on ${node.name}.")
    return
    }
}
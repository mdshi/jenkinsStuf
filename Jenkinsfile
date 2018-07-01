node {
    def msg = powershell(returnStdout: true, script: 'Write-Output "PowerShell is mighty!"')
    println msg
    def myname = "Mike Shiferaw"
    println myname
// some status check 
    def someMessage = powershell(returnStdout: true, script: 'Write-Output "I love you!"')
    println someMessage

}
node {
    stage("Finally"){
        def stdout = powershell(returnStdout: true, script: '''
        # Enable streams 3-6
        $WarningPreference = 'Continue'
        $VerbosePreference = 'Continue'
        $DebugPreference = 'Continue'
        $InformationPreference = 'Continue'

        Write-Output 'Hello, World!'
        Write-Error 'Something terrible has happened!'
        Write-Warning 'Warning! There is nothing wrong with your television set'
        Write-Verbose 'Do not attempt to adjust the picture'
        Write-Debug 'We will control the horizontal.  We will control the vertical'
        Write-Information 'We can change the focus to a soft blur or sharpen it to crystal clarity.'
    ''')
    println stdout
  // Now load 
def externalMethod = evaluate readTrusted("stringInter.groovy")
println externalMethod
    }
}
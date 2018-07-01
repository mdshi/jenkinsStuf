// This value is being read in from an external file, which is why we can't perform the interpolation at runtime
myString = 'https://${first}:${second}@outlook.com'

// These are the two variables I want to substitute
first = 'Mike'
second = 'Shiferaw'

println evaluate(/"$myString"/)



def multilineString = """
Lorem ipsum dolor sit amet,
consectetur adipiscing elit,
sed do eiusmod tempor incididunt
ut labore et dolore magna aliqua.
"""
println multilineString;

def multilineStrings = '''
Lorem ipsum dolor sit amet,
consectetur adipiscing elit,
sed do eiusmod tempor incididunt
ut labore et dolore magna aliqua.
'''
println multilineStrings


def a = 25
def b = 25
def multilineStringA = """
The sum of ${a} and ${b}
is ${a+b}
${a} + ${b} = ${a+b} 
"""
println multilineStringA


def someMessage = powershell(returnStdout: true, script: 'Wite-Host "I love you!"')
println someMessage
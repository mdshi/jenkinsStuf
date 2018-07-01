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
println multilineString
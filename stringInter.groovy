// This value is being read in from an external file, which is why we can't perform the interpolation at runtime
myString = 'https://${first}:${second}@outlook.com'

// These are the two variables I want to substitute
first = 'Mike'
second = 'Shiferaw'

println evaluate(/"$myString"/)

// Expected
// 'https://hello:world@foobar.com'
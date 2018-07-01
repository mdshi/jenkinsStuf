class MyClass {

    def greeting = { name -> "Hello, ${name}!" }

    MyClass() {
    }

    void sayHello(name) {
        println greeting(name)
    }
}
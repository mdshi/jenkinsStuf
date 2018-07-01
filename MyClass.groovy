class MyClass {
     
    String name = "Mike Shiferaw"
    
    def greeting = { name -> "Hello, ${name}!" }
    MyClass() {
    }
   static void main(String[] args){
       MyClass newObject = new MyClass();
       println newObject.name
       
   }
   void sayHello(name) {
        println greeting(name)
    }
}


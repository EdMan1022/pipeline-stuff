class Person {

    String name
    Integer age

    def whoAmI() {
        println "My name is ${this.name}.\nI am ${this.age} years old!"
    }

    def increaseAge(Integer years) {
        this.age += years
    }
}

def person = new Person()

person.name = 'Yollanda'
person.age = 21

person.increaseAge(3)

person.whoAmI()

class Person {
    String name
    Integer age

    Person (name, age) {
        this.name = name
        this.age = age
    }
}

def person1 = new Person('Bob', 34)
def person2 = ['May', 26] as Person
Person person3 = ['Oswald', 12]

println "${person1.name}, ${person2.name}, ${person3.name}"

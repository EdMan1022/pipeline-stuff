class Car {

    String make
    Integer tires
    String engine
    Boolean on

    def void accelerate() {
        if (this.on) {
            println "vroom"
        }
    }
}

Car mustang = ['make': 'Ford', 'tires': 4, 'engine': 'V8', 'on': true]

mustang.accelerate()
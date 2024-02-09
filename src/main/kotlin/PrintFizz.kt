fun main() {
    //val number = 30

    for (number in 3..50) {
        if (number % 3 == 0 && number % 5 == 0)
            print(" FizzBuzz ")
        else if (number % 3 == 0)
            print(" Fizz ")
        else if (number % 5 == 0)
            print(" Buzz ")
        else print(" $number ")
    }
}
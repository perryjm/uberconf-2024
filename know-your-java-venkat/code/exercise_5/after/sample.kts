val numbers = listOf(1, 2, 3)

var factor = 2

val temp = numbers
  //.asSequence()
  .map { number -> number * factor }

factor = 0

temp.forEach { number -> print(number) }


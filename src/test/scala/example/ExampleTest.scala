package example

import munit.FunSuite

class ExampleTest extends FunSuite {
  test("Greeting the world") {
    assertEquals("Hello, World!", Example.greeting)
  }
}

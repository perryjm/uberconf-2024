package com.xyzcorp;

import java.time.LocalDate;

import com.xyzcorp.instructor.tdd.Programmer;
import org.junit.jupiter.api.Test;
import org.assertj.core.api.Assertions;

public class ProgrammerTest {


  @Test
  void testProgrammer() {
    Programmer programmer = Programmer.of("James", "Gosling", LocalDate.of(1955, 5, 19));
    int age = programmer.age();
    Assertions.assertThat(age).isEqualTo(69);
  }
}

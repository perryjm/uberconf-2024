import java.time.LocalDate;
import java.util.function.Supplier;

public class Programmer {
  String firstName;
  String lastName;
  LocalDate birthDate;
  Supplier<LocalDate> now;

  protected Programmer(String firstName, String lastName, LocalDate birthDate, Supplier<LocalDate> now) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.birthDate = birthDate;
    this.now = now;
  }

  public static Programmer of() {
    return new Programmer("James", "Gosling", LocalDate.of(1955, 5, 19), LocalDate::now);
  }

  public int age() {
    return birthDate.until(now.get()).getYears();
  }
}

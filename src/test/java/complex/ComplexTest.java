package complex;

/* nécessaire pour les timeout */

/* importer les annotations utilisées */


import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.within;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;


/**
 * Test class for the complex class.
 */

class ComplexTest {
  private static final float EPSILON = 0.000001F;

  @BeforeAll
  static void setUpBeforeClass() throws Exception {
    // TODO: add message
  }

  @AfterAll
  static void tearDownAfterClass() throws Exception {
    // TODO: add message
  }

  @BeforeEach
  void setUp() throws Exception {
    // TODO: add message
  }

  @AfterEach
  void tearDown() throws Exception {
    // TODO: add message
  }


  @Test
  void testGetterImaginary() {

    float expected = 2.0F;
    Complex z = new Complex(1.0F, 2.0f);
    assertThat(z.getImaginaryPart()).as("problem on getter imaginary")
            .isCloseTo(expected, within(EPSILON));

  }

  @Test
  void testGetterReal() {

    float expected = 1.0F;
    Complex z = new Complex(1.0F, 2.0f);

    assertThat(z.getRealPart()).as("problem on getter imaginary")
            .isCloseTo(expected, within(EPSILON));

  }

  @Test
  void testSetterImaginary() {

    float expected = 3.0F;
    Complex z = new Complex();
    z.setImaginaryPart(expected);
    assertThat(z.getImaginaryPart()).as("problem on setter imaginary")
            .isCloseTo(expected, within(EPSILON));

  }

  @Test
  void testSetterReal() {

    float expected = 3.0F;
    Complex z = new Complex();
    z.setRealPart(expected);
    assertThat(z.getRealPart()).as("problem on getter imaginary")
            .isCloseTo(expected, within(EPSILON));
  }

  @Test
  void testZeroTrue() {
    Complex z = new Complex(0.0F, 0.0F);
    assertThat(z.isZero()).as("problem with isZero on Zero Complex number")
            .isTrue();
  }

  @Test
  void testZeroFalse() {
    Complex z = new Complex(1.0F, 1.0F);
    assertThat(z.isZero()).as("problem with isZero on non Zero Complex number")
            .isFalse();
  }

  @Test
  void testSumReal() {
    Complex z1 = new Complex(1.0F, 2.0F);
    Complex z2 = new Complex(3.0F, 4.0F);

    float expected = 1.0F + 3.0F;

    Complex z = z1.sum(z2);
    assertThat(z.getRealPart()).as("problem with Real part of Sum")
            .isCloseTo(expected, within(EPSILON));
  }

  @Test
  void testSumImaginary() {
    Complex z1 = new Complex(1.0F, 2.0F);
    Complex z2 = new Complex(3.0F, 4.0F);

    float expected = 2.0F + 4.0F;
    Complex z = z1.sum(z2);
    assertThat(z.getImaginaryPart()).as("problem with Imaginary part of Sum")
            .isCloseTo(expected, within(EPSILON));
  }


  // TODO: activate test
  @Test
  void testProductReal() {
    Complex z1 = new Complex(1.0F, 2.0F);
    Complex z2 = new Complex(3.0F, 4.0F);

    float expected = 1.0F * 3.0F - 2.0F * 4.0F;

    Complex z = z1.product(z2);
    assertThat(z.getRealPart()).as("problem with Real part of Product")
            .isCloseTo(expected, within(EPSILON));

  }

  // TODO: activate test
  @Test
  void testProductImaginary() {
    Complex z1 = new Complex(1.0F, 2.0F);
    Complex z2 = new Complex(3.0F, 4.0F);

    float expected = 1.0F * 4.0F + 2.0F * 3.0F;

    Complex z = z1.product(z2);
    assertThat(z.getImaginaryPart()).as("problem with Imaginary part of Product")
            .isCloseTo(expected, within(EPSILON));


  }


  // TODO: Write a test that fails if computation with infinite takes too long

  @Test
  final void testTimeoutInfinite() {
    Complex.infinite();
    fail("NYI");
  }


}

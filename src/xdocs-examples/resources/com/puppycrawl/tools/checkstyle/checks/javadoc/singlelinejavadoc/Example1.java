/*xml
<module name="Checker">
  <module name="TreeWalker">
    <module name="SingleLineJavadoc"/>
  </module>
</module>
*/
package com.puppycrawl.tools.checkstyle.checks.javadoc.singlelinejavadoc;
// xdoc section -- start
public class Example1 {
  /** @see Math */ // violation
  public int foo() {
    return 42;
  }

  /**
   * @return 42
   */
  public int bar() {
    return 42;
  }

  /** {@link #equals(Object)} */
  public int baz() {
    return 42;
  }

  /**
   * <p>the answer to the ultimate question
   */
  public int magic() {
    return 42;
  }

  /**
   * <p>the answer to the ultimate question</p>
   */
  public int foobar() {
    return 42;
  }
}
// xdoc section -- end
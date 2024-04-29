/*xml
<module name="Checker">
  <module name="TreeWalker">
    <module name="WriteTag">
      <property name="tag" value="@since"/>
    </module>
  </module>
</module>
*/
package com.puppycrawl.tools.checkstyle.checks.javadoc.writetag;

// xdoc section -- start
/**
 * Some class
 */
public class Example2 { // violation as required tag is missed
    /** some doc */
    void foo() {} // OK, as methods are not checked by default
}
// xdoc section -- end

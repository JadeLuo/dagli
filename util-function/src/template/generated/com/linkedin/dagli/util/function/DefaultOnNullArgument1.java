// AUTOGENERATED CODE.  DO NOT MODIFY DIRECTLY!  Instead, please modify the util/function/DefaultOnNullArgument.ftl file.
// See the README in the module's src/template directory for details.
package com.linkedin.dagli.util.function;

import com.linkedin.dagli.util.named.Named;
import java.util.Objects;


/**
 * A function class implementing Function1.Serializable<A, R> that returns null if any of
 * the function's inputs are null.
 */
class DefaultOnNullArgument1<A, R> implements Function1.Serializable<A, R>, Named {
  private static final long serialVersionUID = 1;
  private static final int CLASS_HASH = DefaultOnNullArgument1.class.hashCode();
  private final Function1<A, R> _wrapped;

  DefaultOnNullArgument1(Function1<A, R> wrapped) {
    // stacking this wrapper multiple times should be idempotent:
    if (wrapped instanceof DefaultOnNullArgument1) {
      _wrapped = ((DefaultOnNullArgument1) wrapped)._wrapped;
    } else {
      _wrapped = Objects.requireNonNull(wrapped);
    }
  }

  @Override
  public DefaultOnNullArgument1<A, R> safelySerializable() {
    return new DefaultOnNullArgument1<>(((Function1.Serializable<A, R>) _wrapped).safelySerializable());
  }

  @Override
  public R apply(A value1) {
    if (value1 == null) {
      return null;
    }
    return _wrapped.apply(value1);
  }

  @Override
  public int hashCode() {
    return CLASS_HASH + _wrapped.hashCode();
  }

  @Override
  public boolean equals(Object obj) {
    if (obj instanceof DefaultOnNullArgument1) {
      return this._wrapped.equals(((DefaultOnNullArgument1) obj)._wrapped);
    }
    return false;
  }

  @Override
  public String toString() {
    return "arg == null ? null : " + Named.getName(_wrapped);
  }

  @Override
  public String getShortName() {
    return "arg == null ? null : " + Named.getShortName(_wrapped);
  }
}
